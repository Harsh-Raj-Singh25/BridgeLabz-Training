package com.jUnit.listOperations;

import java.util.List;

public class ListManager {
	public void addElement(List<Integer> list, int element) {
		list.add(element);
	}

	public void removeElement(List<Integer> list, int element) {
		// We use Integer.valueOf to ensure we remove the object, not the index
		list.remove(Integer.valueOf(element));
	}

	public int getSize(List<Integer> list) {
		return list.size();
	}
}