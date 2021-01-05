/*
	HashMap<K, V>
	
		* 키와 쌍으로 구성되는 요소를 다룬다.
		* Key는 절대 중복이 되면 안된다. 
			ex)사번, 이름		단어, 뜻		키, 객체
			
		* 주요 메소드
			* put(k, v)		:	해시맵에 값 저장
			* get(k)		:	Value(객체 덩어리)를 호출하는 메소드, 값이 없으면 null 리턴
			* remove(k)		:	삭제
조건문		* isEmpty()		:	해시맵이 비어 있으면 TRUE 리턴
			* clear()		:	모두 삭제
조건문		* containsKey(k):	지정된 키의 값이 존재하면 TRUE 리턴
조건문		* containsValue(v)	:	지정된 값이 존재하면 TRUE 리턴
			* size()		:	크기
*/
package Collection;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {

	public static void main(String[] args) {

		// <단어, 단어 >를 넣을 수 있는 해시맵 생성
		HashMap<String, String> dic = new HashMap<>();

		// 3개의 키는 영어단어, 값은 뜻 생성
		dic.put("Effort", "노력");
		dic.put("Love", "사랑");
		dic.put("Study", "공부");

		// 검색

		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("뜻을 알고 싶은 영어 단어를 입력해주세요>>");
			System.out.println("(종료 하고 싶을떈 q를 눌러주세요.)");
			String str = sc.next();

			
			
			if (str.equals("q")) {
				System.out.println("종료합니다.");
				break;
			}
			
			
			
			
			
			String kor = dic.get(str);

			if (kor == null) {
				System.out.println(str + "단어는 현재 사전에 없습니다.");
			} else {

				System.out.println(kor);
			}

		}
		sc.close();

	}
}
