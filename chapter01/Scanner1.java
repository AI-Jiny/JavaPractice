/*
	향후 학습에 활용하기 위해서 Scanner를 우석 학습해 봄
	콘솔창으로 값을 받아서 내부에서 처리하기 위함

	활용순서를 익혀주고, 사용절차를 자꾸 반복해서 따라해 보실것.

*/
package c3_print;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {

		// 1.안내문구를 띄워준다.
		System.out.println("Please enter your name>>");
		// 2.스캐너를 준비한다.
		Scanner sc = new Scanner(System.in);
		// 3.스캐너로 입력받은 값을 활용한다.
		String str = sc.next();//데이터 타입 : char, String
		// 4.스캐너를 닫아준다.
		sc.close();
		
		System.out.println("Name : "+str);
	}

}
