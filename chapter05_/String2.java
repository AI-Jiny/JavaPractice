package object;

public class String2 {

	public static void main(String[] args) {

		// String 객체 생성 방법들
		String s1 = "Java Korea"; // 단축초기화 문자열 _상수 풀이용
		String s2 = new String("Java Korea");
		String s3 = s2.intern(); // internn() 객체의 단축초기화 문자로 바꿔주는 메소드
		String s4 = "Java Korea";
		String s5 = new String("Java Korea");

		if (s1 == s2) {
			System.out.println("s1과 s2는 같은 장소입니다. 즉, 같은 객체입니다.");
		} else {
			System.out.println("s1과 s2는 다른 장소입니다.");
		}

		if (s1.equals(s2)) {
			System.out.println("s1과 s2는 값이 같습니다.");
		} else {
			System.out.println("s1과 s2는 값이 다릅니다.");
		}

		if (s1 == s3) {
			System.out.println("s1과 s3는 같은 장소입니다. 즉, 같은 객체입니다.");

		} else {
			System.out.println("s1과 s3는 다른 객체입니다.");

		}

		if (s1.equals(s3)) {
			System.out.println("s1과 s3는 값이 같습니다.");
		} else {
			System.out.println("s1과 s3는 값이 다릅니다.");
		}
	}

}
