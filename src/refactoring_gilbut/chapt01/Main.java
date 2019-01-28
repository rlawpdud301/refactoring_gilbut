package refactoring_gilbut.chapt01;

import refactoring_gilbut.chapt01.after.RobotSymbolicConstant;
import refactoring_gilbut.chapt01.after2.RobotCommandClass;
import refactoring_gilbut.chapt01.after3.Command;
import refactoring_gilbut.chapt01.after3.RobotEnum;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		befor();	
		afterSymbolicContant();
		afterClass();
		afterEnum();
		

	}

	private static void afterEnum() {
		System.out.println("afterEnum");
		RobotEnum robot = new RobotEnum("Andrew");
		robot.order(Command.WALK);
		robot.order(Command.STOP);
		robot.order(Command.JUMP);
	}

	private static void afterClass() {
		System.out.println("afterClass");
		RobotCommandClass robot = new RobotCommandClass("Andrew");
		robot.order(RobotCommandClass.COMMAND_WALK);
		robot.order(RobotCommandClass.COMMAND_STOP);
		robot.order(RobotCommandClass.COMMAND_JUMP);
	}

	private static void afterSymbolicContant() {
		
		System.out.println("afterSymbolicContant");
		RobotSymbolicConstant robot = new RobotSymbolicConstant("Andrew");
		robot.order(RobotSymbolicConstant.COMMAND_WORK); // wark
		robot.order(RobotSymbolicConstant.COMMAND_STOP); // stop
		robot.order(RobotSymbolicConstant.COMMAND_JUMP); // jump
	}

	private static void befor() {
		refactoring_gilbut.chapt01.befor.RobotMagicNumber robot = new refactoring_gilbut.chapt01.befor.RobotMagicNumber("Andrew");
		System.out.println("befor");
		robot.order(0); // wark
		robot.order(1); // stop
		robot.order(2); // jump
	}

}
