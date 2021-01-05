package practice_test;

import java.util.Scanner;

public class Ex3_change {

	public static void main(String[] args) {

		// 환산단위 선언
/*		int 오만원 = 50000;
		int 만원 = 10000;
		int 천원 = 1000;
		int 오백원 = 500;
		int 백원 = 100;
		int 오십원 = 50;
		int 십원 = 10;
		int 일원 = 1;
		
*/		int[] a = new int[] {50000, 10000, 1000, 500, 100, 50, 10, 1};

		System.out.println("금액을 입력해 주세요>>");

		Scanner sc = new Scanner(System.in);
		int 입금액 = sc.nextInt();

		//배열, 반복문, 사용가능?
		
		for(int i=0; i<a.length;i++) {
			int c1=입금액/a[i];
			System.out.print(c1+" ");
			입금액=입금액%a[i];
			
		}
/*		int 몫_매수 = 입금액 / 오만원;
		입금액 = 입금액 % 오만원;
		if (몫_매수 > 0) {
			System.out.println("오만원권 : " + 몫_매수 + "매");
		}

		몫_매수 = 입금액 / 만원;
		입금액 = 입금액 % 만원;
		if (몫_매수 > 0) {
			System.out.println("만원권 : " + 몫_매수 + "매");
		}

		몫_매수 = 입금액 / 천원;
		입금액 = 입금액 % 천원;
		if (몫_매수 > 0) {
			System.out.println("천원권 : " + 몫_매수 + "매");
		}
*/
		
		
		sc.close();

	}

}
