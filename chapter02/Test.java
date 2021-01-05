package c2_switch;

public class Test {

	public static void main(String[] args) {

		int i = 10;
		int j = 0;

		switch (i) {

		case 10:
			j += 5;
			break;
		case 20:
			j += 10;
			break;

		default:
			j += 100;
			break;
		}

		System.out.println(j);

	}
}
