package c2_switch;

import java.util.Scanner;

public class Switch2 {

	
	public static void main(String[] args) {
		
		
		System.out.println("점수를 입력하세요>>");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		String grade = null;
		
		
		switch (score) {
		case 90: grade = "A"; break;
		case 80: grade = "B"; break;
		case 70: grade = "C"; break;
		case 60: grade = "D"; break;
		default: grade = "F";
		}
		System.out.println("입력하신 점수는 "+score+"이고, 등급은"+grade+"입니다.");
		
		
		
		switch(score/10) {
		case 9: grade = "A"; break;
		case 8: grade = "B"; break;
		case 7: grade = "C"; break;
		case 6: grade = "D"; break;
		default: grade = "F";		
		}
		System.out.println("입력하신 점수는 "+score+"이고, 등급은"+grade+"입니다.");
		
		sc.close();
	}
}
