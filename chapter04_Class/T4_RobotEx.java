package step8_추상과인터페이스;

public class T4_RobotEx {

	static void action(T4_Robot r) {

		if (r instanceof DanceRobot) {
			((DanceRobot) r).dance(); // down casting
		} else if (r instanceof DrawRobot) {
			((DrawRobot) r).draw();
		} else {
			((SingRobot) r).sing();

//			SingRobot r = (SingRobot)r;
//			r.sing();
		}
	}

	public static void main(String[] args) {

		T4_Robot[] rb = new T4_Robot[3];
		rb[0] = new DanceRobot();
		rb[1] = new DrawRobot();
		rb[2] = new SingRobot();

		for (T4_Robot r : rb) {
		/*T4_RobotEx.*/action(r);
		}

	}

}
