package com.leo.pattern;

public class LightOffCommand implements Command {
	private Light mLight;

	public LightOffCommand(Light light) {
		mLight = light;
	}

	@Override
	public void execute() {
		mLight.off();
	}

	@Override
	public void undo() {
		mLight.on();
	}

}
