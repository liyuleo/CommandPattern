package com.leo.pattern;

public class Demo {
	public static void main(String[] args) {
		Light light = new Light();
		Computer computer = new Computer();
		
		LightOffCommand lightOffCommand = new LightOffCommand(light);
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		
		ComputerOffCommand computerOffCommand = new ComputerOffCommand(computer);
		ComputerOnCommand computerOnCommand = new ComputerOnCommand(computer);
		
		ContrlPanel contrlPanel = new ContrlPanel();
		
		contrlPanel.setCommand(computerOnCommand, 0);
		contrlPanel.setCommand(computerOffCommand, 1);
		
		contrlPanel.setCommand(lightOnCommand, 2);
		contrlPanel.setCommand(lightOffCommand, 3);
		
		/**
		contrlPanel.keyPress(2);
		contrlPanel.keyPress(3);
		contrlPanel.keyPress(0);
		contrlPanel.keyPress(1);
		
		contrlPanel.keyPress(7);
		**/
		
		/**
		contrlPanel.keyPress(0);
		contrlPanel.undo();
		**/
		
		QuickCommand quickCommand = new QuickCommand(new Command[]{lightOnCommand,computerOnCommand});
		contrlPanel.setCommand(quickCommand, 4);
		
		contrlPanel.keyPress(4);
		contrlPanel.undo();
	}
}
