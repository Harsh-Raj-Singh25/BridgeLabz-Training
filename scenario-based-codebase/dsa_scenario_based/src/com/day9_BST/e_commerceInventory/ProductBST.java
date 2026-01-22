package com.day9_BST.e_commerceInventory;

import com.day9_BST.universityRecord.StudentNode;

public class ProductBST {
	Product root;

	// insertion
	Product insert(Product root, String SKU, String name, double price) {
		if (root == null) {
			return new Product(SKU,name,  price);
		}

		if (SKU.compareToIgnoreCase(root.SKU) > 0) {
			root.right = insert(root.right, SKU, name, price);
		} else if (SKU.compareToIgnoreCase(root.SKU) < 0) {
			root.left = insert(root.left, SKU, name, price);
		}
		return root;
	}

	// searching for a Product
	boolean search(Product root, String SKU) {
		if (root == null)
			return false;
		if (root.SKU.equalsIgnoreCase(SKU))
			return true;
		if (SKU.compareToIgnoreCase(root.SKU) < 0) {
			return search(root.left, SKU);
		} else {
			return search(root.right, SKU);
		}

	}
	// displaying a sorted list of Products
	void inOrder(Product root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.println("SKU code.: " + root.SKU + "   |   Name: " + root.name+ " | Price :"+ root.price);
		inOrder(root.right);
	}
	
	// price update using SKU
	void updatePrice(Product root, String SKU, double newPrice) {
		if(root==null) {
			return ;
		}
		if(root.SKU.equalsIgnoreCase(SKU)) {
			root.price=newPrice;
			System.out.println("Updated price of "+ SKU);
			return;
		}
		if(SKU.compareToIgnoreCase(root.SKU)<0) {
			updatePrice(root.left,SKU,newPrice);
		}else {
			updatePrice(root.right, SKU, newPrice);
		}
	}
}
