package com.linkedlist.DoublyLinkedList.UndoRedo;

class TextEditorHistory {
	private StateNode head;
	private StateNode currentState;
	private int historySize = 0;
	private final int MAX_HISTORY = 10;

	// ADD NEW STATE: Typing or performing an action
	public void addState(String text) {
		StateNode newState = new StateNode(text);

		// If we type something new, we clear the 'Redo' history
		if (currentState != null) {
			currentState.next = newState;
			newState.prev = currentState;
		} else {
			head = newState;
		}

		currentState = newState;
		historySize++;

		//LIMIT HISTORY: Maintain only the last 10 states
		if (historySize > MAX_HISTORY) {
			head = head.next;
			head.prev = null;
			historySize--;
		}
	}

	// UNDO: Move pointer to previous state
	public void undo() {
		if (currentState != null && currentState.prev != null) {
			currentState = currentState.prev;
			System.out.println("Action: UNDO performed.");
		} else {
			System.out.println("Action: Nothing to undo.");
		}
	}

	// REDO: Move pointer to next state
	public void redo() {
		if (currentState != null && currentState.next != null) {
			currentState = currentState.next;
			System.out.println("Action: REDO performed.");
		} else {
			System.out.println("Action: Nothing to redo.");
		}
	}

	// DISPLAY: Current Editor Content
	public void displayCurrentText() {
		if (currentState != null) {
			System.out.println("Current Editor View: \"" + currentState.textContent + "\"");
		} else {
			System.out.println("Editor is empty.");
		}
	}
}