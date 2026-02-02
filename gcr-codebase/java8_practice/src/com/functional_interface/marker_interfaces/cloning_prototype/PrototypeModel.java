package com.functional_interface.marker_interfaces.cloning_prototype;

class PrototypeModel implements Cloneable {
	String modelName;

	public PrototypeModel(String name) {
		this.modelName = name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public void display() {
		System.out.println("Model: " + modelName);
	}
}

