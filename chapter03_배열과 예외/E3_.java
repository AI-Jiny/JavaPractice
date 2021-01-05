package c2_Exception;

import java.util.Scanner;

public class E3_ {

	String name;
	String gender;

	E3_() {
	}

	public static void main(String[] args) {

		E3_ im = new E3_();
		
		System.out.println("이름을 입력해주세요>>");
		System.out.println("성별을 입력해주세요>>");

		Scanner sc = new Scanner(System.in);

		im.name=sc.next();
		im.gender=sc.next();
		
		System.out.println("이름 : "+im.name+"\n"+"성별 : "+im.gender);

		sc.close();

	}

}
