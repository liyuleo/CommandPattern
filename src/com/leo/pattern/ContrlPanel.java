package com.leo.pattern;

public class ContrlPanel {
	public static final int COMMAND_SIZE = 8;
	private Command mCommands[];
    private Command mUndoCommand = new EmptyCommand();
	
	
	public ContrlPanel() {
		mCommands = new Command[COMMAND_SIZE];
		for (int i = 0; i < mCommands.length; i++) {
			mCommands[i] = new EmptyCommand();
		}
	}

	public void setCommand(Command command, int index) {
		if (index >= 0 && index < mCommands.length) {
			mCommands[index] = command;
		}
	}

	public void keyPress(int index) {
		if (index >= 0 && index < mCommands.length) {
			mCommands[index].execute();
			mUndoCommand = mCommands[index];
		}
	}

	
	public void undo(){
		mUndoCommand.undo();
	}
}
