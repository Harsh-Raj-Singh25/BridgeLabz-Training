package com.day9_BST.universityRecord;

public class UniversityRecordSystem {
	public static void main(String[] args) {
		StudentBinarySearchTree tree=new StudentBinarySearchTree();
		tree.root=tree.insert(tree.root,78 , "Harsh");
		tree.root=tree.insert(tree.root,115, "Namrata");
		tree.root= tree.insert(tree.root, 01, "Anand");
		System.out.println(" Sorted list of studnets:");
		tree.inOrder(tree.root);
		System.out.println(" Searching roll 115 in list :"+ tree.search(tree.root, 115));
		
		tree.root=tree.delete(tree.root, 78);
		
		System.out.println(" After deletion :");
		tree.inOrder(tree.root);
	}
}
