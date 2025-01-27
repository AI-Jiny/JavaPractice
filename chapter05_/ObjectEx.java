/*
		<<Object class>>
		* 클래스를 담는 그릇 역할
		* 최상위클래스이고, 무조건 강제로 상속되어있다.
		* 주요 메소드
			* boolean equals(Object obj) : obj가 가르키는 객체와 현재 객체를 비교하여 같으면 true return
			* Class getClass()			 : 현 객체의 런타임 클래스를 리턴
			* int hashCode()			 : 현 객체에 대한 해시코드 값 리턴
			* String toString()			 : 현  객체에 대한 문자열 표현을 리턴
			* object clone()			 : 객체 복제해서 신규 객체 생성

*/
package object;

class Point1 {
	int x, y;

	public Point1(int x, int y) {
		this.x = x;
		this.y = y;
	}

}

public class ObjectEx {
	public static void print(Object obj) {
		System.out.println(obj.getClass());
		System.out.println(obj.getClass().getName());
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
		System.out.println(obj);
	}

	public static void main(String[] args) {
		Point1 p = new Point1(2, 3);
		print(p);

	}
}
