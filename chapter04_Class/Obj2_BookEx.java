package step4_objarr;

import java.util.Scanner;

class Book {

	String title, author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

}

public class Obj2_BookEx {

	public static void main(String[] args) {

		Book[] b = new Book[2];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < b.length; i++) {
			// 책제목 입력하기
			System.out.println("제목>> ");
			String title = sc.next();
			System.out.println("저자>> ");
			String author = sc.next();

			// 입력받은 값을 배열에 Book클래스 객체로 저장하기
			b[i] = new Book(title, author);

		}
		// for문을 이용해서 출력
		for (int i = 0; i < b.length; i++) {
			System.out.println("제목 : " + b[i].title + ", 저자 : " + b[i].author);
		}

		sc.close();
	}

}
