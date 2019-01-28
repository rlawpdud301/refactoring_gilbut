package refactoring_gilbut.chapt01.after;

public class RobotSymbolicConstant {
	public static final int COMMAND_JUMP = 2;
	public static final int COMMAND_STOP = 1;
	public static final int COMMAND_WORK = 0;
	private final String name;
	
	public RobotSymbolicConstant(String name) {
		this.name = name;
	}
	
	public void order(int command) {
		if (command == COMMAND_WORK) {
			System.out.printf("%s %s%n",name,"walks.");
		} else if(command == COMMAND_STOP) {
			System.out.printf("%s %s%n",name,"stops.");
		} else if(command == COMMAND_JUMP) {
			System.out.printf("%s %s%n",name,"jumps.");
		} else {
			System.out.printf("command error. command = %s%n",command);
		}
	}
}
