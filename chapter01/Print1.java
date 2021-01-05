package c3_print;

public class Print1 {
	
	public static void main(String[] args) {
		
		//print
		System.out.print("Hello \n");
		System.out.print("Java~ \n");
		//println
		System.out.println("Hello~");
		System.out.println("Java~~");
		//printf
		System.out.printf("%c \n", 'A');
		System.out.printf("%d \n", 100);
		System.out.printf("%s \n", "야앙아");
		System.out.printf("%.2f \n", 1.2);
		
		//(과목전체의) 평균은 (90.123)점입니다.
		System.out.printf("%s 평균은 %.3f점 입니다.\n", "과목전체의", 90.123);
		System.out.printf("%s : %.1f점 입니다.", "영어", 87.5);
		
	}

}
