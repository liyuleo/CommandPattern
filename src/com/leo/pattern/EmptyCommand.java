package com.leo.pattern;

public class EmptyCommand implements Command {

	@Override
	public void execute() {
		System.out.println("空命令：什么也不做");
	}

	@Override
	public void undo() {
		System.out.println("空命令:没有可以撤销的动作");
	}

}
