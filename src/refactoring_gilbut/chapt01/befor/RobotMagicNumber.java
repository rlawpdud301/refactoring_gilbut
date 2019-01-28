package refactoring_gilbut.chapt01.befor;

public class RobotMagicNumber {
	private final String name;
	
	public RobotMagicNumber(String name) {
		this.name = name;
	}
	
	public void order(int command) {
		if (command == 0) {
			System.out.printf("%s %s%n",name,"walks.");
		} else if(command == 1) {
			System.out.printf("%s %s%n",name,"stops.");
		} else if(command == 2) {
			System.out.printf("%s %s%n",name,"jumps.");
		} else {
			System.out.printf("command error. command = %s%n",command);
		}
	}
}
