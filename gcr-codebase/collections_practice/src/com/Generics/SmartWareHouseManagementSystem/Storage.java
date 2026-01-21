package com.Generics.SmartWareHouseManagementSystem;

import java.util.ArrayList;
import java.util.List;

// The 'T' ensures that this storage instance is type-specific
class Storage<T extends WarehouseItem> {
	private List<T> items = new ArrayList<>();

	public void addItem(T item) {
		items.add(item);
		System.out.println(item.name + " added to storage.");
	}

	public List<T> getItems() {
		return items;
	}
}
