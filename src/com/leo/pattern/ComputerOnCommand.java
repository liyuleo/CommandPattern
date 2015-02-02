package com.leo.pattern;

public class ComputerOnCommand implements Command{
    private Computer mComputer;
    
	public ComputerOnCommand(Computer computer) {
		mComputer = computer;
	}

	@Override
	public void execute() {
		mComputer.on();
	}

	@Override
	public void undo() {
		mComputer.off();
	}

}
