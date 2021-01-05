package step3_constructor;
/*
	THIS의 활용법
		- 다른 메소드를 호풀할 때 객체 자신의 레퍼렁스를 전달하는경우
		- 메소드가 객체 자신의 레퍼런스를 반환할 경우
		- 객체의 멤버변수와 메스드속의 변수 이름이 같은 경우

*/

class Book {

	String title;
	String author;

	public Book() {
		this(" ");		//자신의 생성자를 부름
		System.out.println("생성자를 호출하였습니다.");
	}

	Book(String title) {
		this(title, "작자미상");	//자신의 변수를 부름
		
	}

	Book(String title, String author) {
		this.title = title;
		this.author = author;
		
	}

	void show() {
		System.out.println("메소드 : " + title + ", " + author);
	}
}





public class C1_This_OverRoading {

	public static void main(String[] args) {

/*		Book b1 = new Book();
		Book b2 = new Book("작자미상");
		Book b3 = new Book("작자미상, 춘향전");
*/
		Book littlePrince = new Book("어린왕자","샹테쥐페리");
		System.out.println(littlePrince.title+", "+littlePrince.author);
		
		Book loveStory = new Book("춘향전");
		System.out.println(loveStory.title+", "+loveStory.author);
		
		Book emptyBook = new Book();
		System.out.println(emptyBook.title+", "+emptyBook.author);
		
		
	}

}
