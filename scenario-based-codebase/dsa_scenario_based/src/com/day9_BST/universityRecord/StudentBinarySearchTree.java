package com.day9_BST.universityRecord;

public class StudentBinarySearchTree {

	StudentNode root;
	
	
	// insertion
	StudentNode insert(StudentNode root, int rollNumber, String name) {
		if (root == null) {
			return new StudentNode(name, rollNumber);
		}

		if (rollNumber < root.getRoll()) {
			root.left = insert(root.left, rollNumber, name);
		} else if (rollNumber > root.getRoll()) {
			root.right= insert(root.right, rollNumber, name);
		}

		return root;
	}
	// searching
	boolean search(StudentNode root, int roll) {
		if (root == null)
			return false;
		if (root.getRoll() == roll)
			return true;
		if (roll < root.getRoll()) {
			return search(root.left,  roll);
		} else {
			return search(root.right,  roll);
		}

	}
	// displaying a sorted list of students
	
	void inOrder(StudentNode root) {
		if(root== null) {
			return;
		}
		inOrder(root.left);
		System.out.println("RollNo.: "+root.getRoll()+ "   |   Name: "+root.name);
		inOrder(root.right);
	}
	
	// deletion by roll number
	StudentNode delete(StudentNode root, int roll) {
		if(root==null) return null;
		if(roll < root.getRoll()) {
			root.left = delete(root.left, roll);
		}else if ( roll > root.getRoll()) {
			root.right=delete(root.right, roll);
		}else {
			// case 1 and 2
			if(root.left == null) {
				return root.right;
			}else if (root.right == null) {
				return root.left;
			}
			// case 3: inorder succession
			StudentNode successor=minNode(root.right);
			root.setRoll(successor.getRoll());
			root.name=successor.name;
			root.right=delete(root.right, successor.getRoll());
			
		}
		return root;
	}
	
	StudentNode minNode(StudentNode root) {
		//int min=root.getRoll();
		while(root.left!=null) {
			root=root.left;
			//min=root.getRoll();
		}
		return root;
	}

}
