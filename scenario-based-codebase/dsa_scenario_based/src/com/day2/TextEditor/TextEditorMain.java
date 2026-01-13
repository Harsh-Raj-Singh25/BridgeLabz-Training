package com.day2.TextEditor;

/*
 * 6. TextEditor – Undo/Redo Functionality (Stack)
Story: Shanaya is building a basic text editor app. Every action (insert, delete, format) is
pushed onto a Stack. An Undo action pops from the stack, and Redo uses another stack to
reapply actions.
Requirements:
● Support insert/delete operations.
● Undo using a stack.
● Maintain redo stack separately.
 */
public class TextEditorMain {
	public static void main(String[] args) {
		UndoRedoStackLL editorStack = new UndoRedoStackLL();
		UndoRedoStackLL redoStack = new UndoRedoStackLL();

//		editorStack.push("insert");
//		editorStack.push("delete");
//		editorStack.push("format");

		// undo action pops from the stack and redo uses another stack to reapply
		// actions:
		System.out.println("--- Performing Actions ---");
		performAction("Type 'Hello'", editorStack, redoStack);
		performAction("Delete 'H'", editorStack, redoStack);
		performAction("Make Bold", editorStack, redoStack);

		//  Undo: Pop from Editor, Push to Redo
		System.out.println("\n--- Undo Clicked ---");
		String actionToUndo = editorStack.pop();
		if (!actionToUndo.equals("-1")) {
			redoStack.push(actionToUndo);
			System.out.println("Undone: " + actionToUndo);
		}

		//  Redo: Pop from Redo, Push back to Editor
		System.out.println("\n---  Redo Clicked ---");
		String actionToRedo = redoStack.pop();
		if (!actionToRedo.equals("-1")) {
			editorStack.push(actionToRedo);
			System.out.println("Redone: " + actionToRedo);
		}
	}

	// Helper method to simulate a new action
	public static void performAction(String action, UndoRedoStackLL editor, UndoRedoStackLL redo) {
		editor.push(action);
		//  CRITICAL: Every time a NEW action is performed,
		// the Redo stack MUST be cleared!
		while (!redo.peek().equals("-1")) {
			redo.pop();
		}
		System.out.println("Action Performed: " + action);
	}
}