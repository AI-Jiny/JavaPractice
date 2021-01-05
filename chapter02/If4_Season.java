package c1_if;

import java.util.Scanner;

public class If4_Season {
	
	public static void main(String[] args) {
		
		String season= null;
		
		System.out.println("계절을 알고싶은 달을 입력해 주세요>>");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
						
		if(3<=month && month<=5) {
			season = "봄";
			System.out.println("해당계절은 "+season+"입니다.");

		}else if(6<=month  && month<=8) {
			season = "여름";
			System.out.println("해당계절은 "+season+"입니다.");

		}else if(9<=month && month<=11) {
			season = "가을";
			System.out.println("해당계절은 "+season+"입니다.");

		}else if(month==12 || 1==month || month==2) { 
			season="겨울";
			System.out.println("해당계절은 "+season+"입니다.");

		}else {
			System.out.println("계절을 알 수 없습니다.");
		}
		
		
		
		sc.close();
	}

}
