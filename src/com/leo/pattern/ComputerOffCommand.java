package com.leo.pattern;

public class ComputerOffCommand implements Command {
	private Computer mComputer;

	public ComputerOffCommand(Computer computer) {
		mComputer = computer;
	}

	@Override
	public void execute() {
		mComputer.off();
	}

	@Override
	public void undo() {
		mComputer.on();
	}

}
