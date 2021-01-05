package c1_array;

import java.util.Scanner;

public class Array9_Scanner {

	public static void main(String[] args) {

		System.out.println("배열 방의 크기를 입력해 주세요>>");

		Scanner sc = new Scanner(System.in);
		int size = 0;

		// 입출력 예외처리
		try {
			// 실행문
			size = sc.nextInt();

		} catch (Exception e) {
			System.out.println("배열방의 크기를 잘못입력하셨습니다.");			
			sc.close();
			System.exit(0);
		}
		
	//배열 생성
		String [] arr=new String[size];
		String str;
		int i=0;
		
		System.out.println("저장할 이름을 입력해주세요>>");
		while(i<size) {
			str = sc.next()	;
			if(str.equals("q")) break;
			arr[i] = str;
			i++;
			if(i==(size-1))System.out.println("마지막 하나 남았습니다.");
		}
		sc.close();
		
		System.out.println("저장된 이름은...");
		for(String k:arr) {
			System.out.print(k+" ");
		}

	}

}
