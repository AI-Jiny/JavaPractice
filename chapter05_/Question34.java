package StringTokenizer;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Question34 {

	public static void main(String[] args) {

//		/*
//		 * 문제3. 스캐너로 문장을 입력 받아서 공백으로 부리된 어절이 몇개나 들어있는지 카운트 하고, 분리된 토큰을 출력하시오. 입력받은 단어가
//		 * "그만" 이라고 하면 "종료합니다"라고 말하고 종료되는 반복 프로그램을 작성하시오.
//		 */
//		while (true) {
//
//			System.out.println("분석하고 싶은 문자열을 입력해주세요>>");
//			Scanner str1 = new Scanner(System.in);
//			String s = str1.nextLine();
//
//			if (s.equals("그만")) {
//				System.out.println("종료합니다");
//				break;
//			}
//
//			String[] word = s.split(" "); // 한글자씩 배열에 넣어준다
//			System.out.println("어절의 개수는 " + word.length);
//
//			for (String k : word) {
//				System.out.print(k);
//			}
//			System.out.println("\n**************************************");
//
//			StringTokenizer st = new StringTokenizer(s, " ");
//			int num = st.countTokens();
//			System.out.println("어절의 개수는 " + num);
//
//			for (int i = 0; i < num; i++) {
//				System.out.print(st.nextToken());
//			}
//			System.out.println();
//
//		}

		/*
		 * 문제4. 문자열을 입력받아서 한 글자씩 회전시켜 한바퀴도는 모두 출력하는 프로그램을 작성하시오. I LOVE YOU LOVE YOUI
		 * LOVE YOUI OVE YOUI L ... I LOVE YOU
		 */

		System.out.print("회전시킬 문자열을 입력해주세요>>");
		Scanner str2 = new Scanner(System.in);

		String text = str2.nextLine();
		int len = text.length();

		for (int i = 0; i < len; i++) {

			String first = text.substring(0, 1);
			String last = text.substring(1);

			text = last + first;
			System.out.println(text);

		}

		str2.close();
	}

}
