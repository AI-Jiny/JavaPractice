package c2_switch;

import java.util.Scanner;

public class Switch3 {

	public static void main(String[] args) {

		String season = null;

		System.out.println("월을 입력하세요>>");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();

		//나열할 수 있다.
		
		switch (month) {
		case 12:
		case 1:
		case 2:
			season = "겨울";System.out.println("해당 계절은 "+season+"입니다.");

			break;
		case 3:
		case 4:
		case 5:
			season = "봄";System.out.println("해당 계절은 "+season+"입니다.");

			break;
		case 6:
		case 7:
		case 8:
		case 9:
			season = "여름";System.out.println("해당 계절은 "+season+"입니다.");

			break;
		case 10:
		case 11:
			season = "가을";System.out.println("해당 계절은 "+season+"입니다.");

			break;

		default:System.out.println("해당 계절을 알 수 없습니다.");
			break;
		}
		
		sc.close();
	}

}
