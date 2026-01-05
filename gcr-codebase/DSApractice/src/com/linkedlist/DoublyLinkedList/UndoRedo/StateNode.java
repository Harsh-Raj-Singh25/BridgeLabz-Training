package com.linkedlist.DoublyLinkedList.UndoRedo;

class StateNode {
	String textContent;
	StateNode next;
	StateNode prev;

	public StateNode(String text) {
		this.textContent = text;
		this.next = null;
		this.prev = null;
	}
}