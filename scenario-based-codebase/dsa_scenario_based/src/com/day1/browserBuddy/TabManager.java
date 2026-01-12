package com.day1.browserBuddy;

import java.util.Stack;

public class TabManager {
	private HistoryNode current; // The page currently being viewed
	private Stack<HistoryNode> closedTabs; // Stack for "Recently Closed"

	public TabManager(String homepage) {
		this.current = new HistoryNode(homepage);
		this.closedTabs = new Stack<>();
	}

	//  Visit a new page
	public void visit(String url) {
		HistoryNode newNode = new HistoryNode(url);
		current.next = newNode;
		newNode.prev = current;
		current = newNode; // Move view to the new page
		System.out.println("Visited: " + url);
	}

	//  Backward Navigation (DLL Prev)
	public void back() {
		if (current.prev != null) {
			current = current.prev;
			System.out.println("Went Back to: " + current.url);
		} else {
			System.out.println(" No back history.");
		}
	}

	//  Forward Navigation (DLL Next)
	public void forward() {
		if (current.next != null) {
			current = current.next;
			System.out.println("Went Forward to: " + current.url);
		} else {
			System.out.println("No forward history.");
		}
	}

	//  Close Tab (Push to Stack)
	public void closeTab() {
		System.out.println("Closing tab: " + current.url);
		closedTabs.push(current);
		// In a real browser, 'current' would then point to the next open tab
	}

	// Restore Tab (Pop from Stack)
	public void reopenClosedTab() {
		if (!closedTabs.isEmpty()) {
			HistoryNode restored = closedTabs.pop();
			System.out.println(" Restored Tab: " + restored.url);
		} else {
			System.out.println(" No recently closed tabs.");
		}
	}
}