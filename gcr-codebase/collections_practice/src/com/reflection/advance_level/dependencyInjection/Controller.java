package com.reflection.advance_level.dependencyInjection;

class Controller {
	@Inject
	private Service service; // We want this injected automatically

	public void execute() {
		service.run();
	}
}

