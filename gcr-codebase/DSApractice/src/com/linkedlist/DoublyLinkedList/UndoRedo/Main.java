package com.linkedlist.DoublyLinkedList.UndoRedo;

public class Main {
	public static void main(String[] args) {
		TextEditorHistory editor = new TextEditorHistory();

		// start typing
		editor.addState("Hello");
		editor.addState("Hello World");
		editor.addState("Hello World!");
		editor.displayCurrentText(); // "Hello World!"

		// perform Undo
		editor.undo();
		editor.displayCurrentText(); // "Hello World"

		editor.undo();
		editor.displayCurrentText(); // "Hello"

		//perform Redo
		editor.redo();
		editor.displayCurrentText(); // "Hello World"

		//type something new after an Undo (This clears Redo path)
		editor.addState("Hello Java");
		editor.displayCurrentText(); // "Hello Java"

		// Checking Redo (Should be empty now)
		editor.redo();
	}
}