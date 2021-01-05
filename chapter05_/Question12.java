package Calender;

import java.util.Calendar;
import java.util.Scanner;

class Player {

	private String name;
	Scanner sc = new Scanner(System.in);

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;

	}

	public int turn() {
		System.out.print(name + "님의 게임 시작 입니다. 엔터키를 눌러주세요>>");

		// 시작 초 시간
		String enterKey = sc.nextLine();
		Calendar c = Calendar.getInstance();
		int startSec = c.get(Calendar.SECOND);
		System.out.println("현재 초 시간 : " + startSec);

		// 끝 초 시간
		System.out.println("10초가 되었다면 엔터키를 눌러주세요>>");
		enterKey = sc.nextLine();
		c = Calendar.getInstance();
		int endSec = c.get(Calendar.SECOND);
		System.out.println("\n10초 예상 시간 : " + endSec);

		// 두개의 초 시간차 계산
		if (startSec > endSec) {
			startSec += 60;
		}

		return Math.abs(startSec - endSec);
		// abs 절대값

	}

}

public class Question12 {

	public void run() {
		System.out.println("플레이어 2명의 이름을 차례로 입력해 주세요>>");
		Scanner sc1 = new Scanner(System.in);
		String player1 = sc1.next();
		String player2 = sc1.next();

		Player[] player = new Player[2];
		player[0] = new Player(player1);
		player[1] = new Player(player2);

		int timeGap1 = player[0].turn();
		int timeGap2 = player[1].turn();

		System.out.println(player[0].getName() + "님의 시간차는 " + timeGap1 + "초 입니다.");
		System.out.println(player[1].getName() + "님의 시간차는 " + timeGap2 + "초 입니다.");

		System.out.println("승자는 ...........");
		if (Math.abs(10 - timeGap1) < Math.abs(10 - timeGap2)) {
			System.out.println(player[0].getName() + "입니다!");
		} else {
			System.out.println(player[1].getName() + "입니다!");
		}

	}

	public static void main(String[] args) {
//
//		Calendar now = Calendar.getInstance();
//		int hour = now.get(Calendar.HOUR_OF_DAY);
//		int min = now.get(Calendar.MINUTE);
//
//		System.out.println("현재 시간은 " + hour + "시 " + min + "분 입니다.");
//
//		if (hour > 4 && hour < 12) {
//
//			System.out.println("Good Morning :D");
//		} else if (hour > 12 && hour < 17) {
//
//			System.out.println("Good Afternoon :D");
//		} else {
//
//			System.out.println("Good Evening :D");
//		}

		/*
		 * 문제 2. 두사람이 엔터키를 치면 초만 읽어온다. 각각의 읽어온 초 시간이 10초간격에 접근한 사람이 Winner이다. 게임프로그램을
		 * 작성하시오.
		 */

		Question12 game = new Question12();
		game.run();

	}
}
