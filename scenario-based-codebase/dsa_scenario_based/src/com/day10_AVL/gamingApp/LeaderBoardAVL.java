package com.day10_AVL.gamingApp;

class LeaderboardAVL {
	Player root;

	// --- HELPER UTILITIES ---
	private int height(Player n) {
		return (n == null) ? 0 : n.height;
	}

	private int getBalance(Player n) {
		return (n == null) ? 0 : height(n.left) - height(n.right);
	}

	private Player rightRotate(Player y) {
		Player x = y.left;
		Player T2 = x.right;
		x.right = y;
		y.left = T2;
		y.height = Math.max(height(y.left), height(y.right)) + 1;
		x.height = Math.max(height(x.left), height(x.right)) + 1;
		return x;
	}

	private Player leftRotate(Player x) {
		Player y = x.right;
		Player T2 = y.left;
		y.left = x;
		x.right = T2;
		x.height = Math.max(height(x.left), height(x.right)) + 1;
		y.height = Math.max(height(y.left), height(y.right)) + 1;
		return y;
	}

	//  SCENARIO 1: Insert/Update Player
	public void addOrUpdatePlayer(String name, int score) {
		root = insert(root, name, score);
	}

	private Player insert(Player node, String name, int score) {
		if (node == null)
			return new Player(name, score);

		if (score < node.score)
			node.left = insert(node.left, name, score);
		else if (score > node.score)
			node.right = insert(node.right, name, score);
		else
			return node; // Score already exists

		node.height = 1 + Math.max(height(node.left), height(node.right));
		return rebalance(node, score);
	}

	//  SCENARIO 3: Remove Player (Banning/Exiting)
	public void removePlayer(int score) {
		root = deleteNode(root, score);
	}

	private Player deleteNode(Player root, int score) {
		if (root == null)
			return root;

		if (score < root.score)
			root.left = deleteNode(root.left, score);
		else if (score > root.score)
			root.right = deleteNode(root.right, score);
		else {
			// Node found - handle 1 child or no child
			if ((root.left == null) || (root.right == null)) {
				Player temp = (root.left != null) ? root.left : root.right;
				if (temp == null) {
					temp = root;
					root = null;
				} else
					root = temp;
			} else {
				// Node with two children: Get the In-order Successor (smallest in right)
				Player temp = minValueNode(root.right);
				root.score = temp.score;
				root.username = temp.username;
				root.right = deleteNode(root.right, temp.score);
			}
		}

		if (root == null)
			return root;
		root.height = Math.max(height(root.left), height(root.right)) + 1;
		int balance = getBalance(root);

		// Rebalance after deletion
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

	private Player minValueNode(Player node) {
		Player current = node;
		while (current.left != null)
			current = current.left;
		return current;
	}

	private Player rebalance(Player node, int score) {
		int balance = getBalance(node);
		if (balance > 1 && score < node.left.score)
			return rightRotate(node);
		if (balance < -1 && score > node.right.score)
			return leftRotate(node);
		if (balance > 1 && score > node.left.score) {
			node.left = leftRotate(node.left);
			return rightRotate(node);
		}
		if (balance < -1 && score < node.right.score) {
			node.right = rightRotate(node.right);
			return leftRotate(node);
		}
		return node;
	}

	//  SCENARIO 2: Display Top Players
	public void displayRankings() {
		System.out.println("\n --- CURRENT RANKINGS (Descending) ---");
		reverseInOrder(root);
	}

	private void reverseInOrder(Player node) {
		if (node != null) {
			reverseInOrder(node.right);
			System.out.println("User: " + node.username + " | Points: " + node.score);
			reverseInOrder(node.left);
		}
	}
}
