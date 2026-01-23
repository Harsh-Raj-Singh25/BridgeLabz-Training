package com.day10_AVL.eventTicketBooking;

public class EventTicketAVL {
	Event root;

	private int height(Event e) {
		return (e == null) ? 0 : e.height;
	}

	private int getBalance(Event e) {
		return (e == null) ? 0 : height(e.left) - height(e.right);
	}

	private Event rightRotate(Event y) {
		Event x = y.left;
		Event t2 = x.right;
		x.right = y;
		y.left = t2;
		y.height = Math.max(height(y.left), height(y.right)) + 1;
		x.height = Math.max(height(x.left), height(x.right)) + 1;
		return x;
	}

	private Event leftRotate(Event x) {
		Event y = x.right;
		Event T2 = y.left;
		y.left = x;
		x.right = T2;
		x.height = Math.max(height(x.left), height(x.right)) + 1;
		y.height = Math.max(height(y.left), height(y.right)) + 1;
		return y;
	}

	// 🔹 Scenario 1: Insert Event (Add by Start Time)
	public void addEvent(int time, String name) {
		root = insert(root, time, name);
	}

	private Event insert(Event node, int time, String name) {
		if (node == null)
			return new Event(name, time);

		if (time < node.startTime)
			node.left = insert(node.left, time, name);
		else if (time > node.startTime)
			node.right = insert(node.right, time, name);
		else
			return node; // Duplicate times not allowed for simplicity

		node.height = 1 + Math.max(height(node.left), height(node.right));
		return rebalance(node, time);
	}

	// 🔹 Scenario 2: Cancel Event (Delete by Time)
	public void cancelEvent(int time) {
		root = delete(root, time);
	}

	private Event delete(Event root, int time) {
		if (root == null)
			return root;

		if (time < root.startTime)
			root.left = delete(root.left, time);
		else if (time > root.startTime)
			root.right = delete(root.right, time);
		else {
			// Node with one or no child
			if ((root.left == null) || (root.right == null)) {
				Event temp = (root.left != null) ? root.left : root.right;
				if (temp == null) {
					temp = root;
					root = null;
				} else
					root = temp;
			} else {
				// Node with two children: Get In-order Successor
				Event temp = minValueNode(root.right);
				root.startTime = temp.startTime;
				root.eventname = temp.eventname;
				root.right = delete(root.right, temp.startTime);
			}
		}

		if (root == null)
			return root;
		root.height = Math.max(height(root.left), height(root.right)) + 1;

		// Rebalance after deletion
		int balance = getBalance(root);
		if (balance > 1 && getBalance(root.left) >= 0)
			return rightRotate(root);
		if (balance > 1 && getBalance(root.left) < 0) {
			root.left = leftRotate(root.left);
			return rightRotate(root);
		}
		if (balance < -1 && getBalance(root.right) <= 0)
			return leftRotate(root);
		if (balance < -1 && getBalance(root.right) > 0) {
			root.right = rightRotate(root.right);
			return leftRotate(root);
		}
		return root;
	}

	private Event minValueNode(Event node) {
		Event current = node;
		while (current.left != null)
			current = current.left;
		return current;
	}

	private Event rebalance(Event node, int time) {
		int balance = getBalance(node);
		// LL Case
		if (balance > 1 && time < node.left.startTime)
			return rightRotate(node);
		// RR Case
		if (balance < -1 && time > node.right.startTime)
			return leftRotate(node);
		// LR Case
		if (balance > 1 && time > node.left.startTime) {
			node.left = leftRotate(node.left);
			return rightRotate(node);
		}
		// RL Case
		if (balance < -1 && time < node.right.startTime) {
			node.right = rightRotate(node.right);
			return leftRotate(node);
		}
		return node;
	}

	// 🔹 Scenario 3: Show Events in Order (In-Order Traversal)
	public void showSchedule() {
		System.out.println("\n --- UPCOMING EVENT SCHEDULE ---");
		inOrder(root);
	}

	private void inOrder(Event node) {
		if (node != null) {
			inOrder(node.left);
			System.out.println("Time: " + formatTime(node.startTime) + " | Event: " + node.eventname);
			inOrder(node.right);
		}
	}

	private String formatTime(int time) {
		return String.format("%02d:%02d", time / 100, time % 100);
	}

}
