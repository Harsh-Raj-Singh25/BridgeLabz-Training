package com.day9_BST.e_commerceInventory;
/*
 * 
Story: E-Commerce Product Inventory
An online store categorizes products by SKU numbers.
Scenarios:
● 🔹 Scenario 1: Lookup — Customers search for a product using SKU.
● 🔹 Scenario 2: Price Update — Admin updates products using SKU key.
● 🔹 Scenario 3: Sorted List — Display all products in sorted SKU order.
 */
public class E_CommerceInventorySystem {
	public static void main(String[] args) {
		ProductBST tree=new ProductBST();
		
		// inserting some products
		tree.root= tree.insert(tree.root, "S-001", "SOAP", 15);
		tree.root= tree.insert(tree.root, "S-002", "SUGAR", 40);
		tree.root= tree.insert(tree.root, "S-003", "SALT", 25);
		tree.root= tree.insert(tree.root, "S-004", "SOANPAPDI", 60);
		tree.root= tree.insert(tree.root, "S-005", "SURF EXCEL", 44);
		
		// DISPLAY
		tree.inOrder(tree.root);
		
		// search for a product using SKU code
		System.out.println(" Product was found :"+tree.search(tree.root, "S-004"));
		
		// updating the price of a product using sku code
		tree.updatePrice(tree.root, "S-002", 44);
		// new tree
		tree.inOrder(tree.root);
		
	}
}
