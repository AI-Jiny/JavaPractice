/*
	StringBuffer :  String클래스의 불변문제를 개선, 스레드 동시오요시 안전보장, 속도는 상대적 느림

	* 메소드
		* append(String str)	:	str스트링을 스트링 버퍼에 덧붙인다.
		* int capacity()		:	스트링버퍼의 현재 크리를 정수값을 리턴해준다.
		* delete(int start, int end)	:	start위치에서  end위치 앞까지 문자 삭제
		* insert(int offset, String str)	:	str을 offset위치에 삽입시킨다.
		* reverse()		:	문자열을 반대로 순서변경한다.
		* void setLength(int newLength)		:	스트링버퍼 내 문자열의 길이를 새롭게 재 설정한다.
		* 

	
*/
package object;

public class StringBufferE {

	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer("Hello Java");

		StringBuffer sb2 = new StringBuffer("처음 시작하는 자바");

		System.out.println(sb1);
		System.out.println(sb1.length());

		// capacity()
		System.out.println("sb1 버퍼를 포함한 길이 : " + sb1.capacity());

		System.out.println(sb2);
		System.out.println("sb2 버퍼를 포함한 길이 : " + sb2.capacity());

		// insert()
		System.out.println("문자열 끼워넣기 : " + sb2.insert(8, "power "));

		System.out.println("문자열 끼워넣기 : " + sb1.insert(6, "my "));

		// charAt()
		System.out.println("8번째 문자 추출 : " + sb2.charAt(8));

		System.out.println("4번째 문자 추출 : " + sb1.charAt(4));

		// setCharAt()
		sb2.setCharAt(5, '되');
		System.out.println("5번째의 값을 \'되\'로 변경 : " + sb2);

		sb1.setCharAt(6, 'M');
		System.out.println(sb1);
		// setLength()
		sb2.setLength(5);
		System.out.println("문자열을 5까지만 고정시킨 새로운 값 : " + sb2);

		// reverse
		System.out.println("문자열을 역순으로 출력하기 : " + sb2.reverse());

	}

}
