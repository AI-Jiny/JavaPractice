package practice_test;

import java.util.Scanner;

public class Ex5_triancle {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("세 변의 길이 값을 입력해 주세요>>");
		
		int l1=sc.nextInt();
		int l2=sc.nextInt();
		int l3=sc.nextInt();
		
		if((l1+l2)<=l3 || (l3+l2)<=l1 || (l1+l3)<=l2) {
			System.out.println("삼각형 세변의 길이가 될 수 없습니다.");
		}else {
			System.out.println("삼각형을 그릴 수 있습니다.");
		}
		
		sc.close();
		
	}

}
