package com.leo.pattern;

public class QuickCommand implements Command {

	private Command mCommands[];
	
	public QuickCommand(Command[] commands) {
		mCommands = commands;
	}

	@Override
	public void execute() {
		for(int i = 0; i < mCommands.length;i++){
			mCommands[i].execute();
		}
	}

	@Override
	public void undo() {
		for(int i = mCommands.length - 1; i >= 0;i--){
			mCommands[i].undo();
		}
	}

}
