/*
		<<ArrayList>>
			* add(E e)				:	맨 끝에 객체 추가
			* ass(int index, E e)	:	해당 인덱스에 객체추자
			* void clear()			:	벤터의 모든 요소 삭제
			* elementAT(int index)	:	인덱스 요소 리턴
			* contains(Object e)	:	지정된 객체를 포함하고 있으면 true리턴
			* get(int index)		:	인덱스 요소 리턴
			* indexOf(Object abj)	:	obj와 같은 첫번째 요소의 인덱스 리턴, 없으면 -1리턴
			* isEmpty()				:	벡터가 비어있으면 true리턴
			* remove(int index)		:	인덱스의 요소 제거
			* removeAllElements()	:	모든 요소를 삭제하고 크기를  0 으로 만듬
			* size()				:	벡터 요소 객수 리턴
*/

package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class C1_ArrayListEx1 {

	public static void main(String[] args) {

		// ArrayList생성
		ArrayList<String> a = new ArrayList<>();

		// 키보드로부터 4개의 이름을 받아서 삽입
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			System.out.println("이름을 입력해 주세요");
			String s = sc.next();
			a.add(s); // add() : 값(요소)를 추가한다.

		}

		for (int i = 0; i < a.size(); i++) {
			String name = a.get(i); // get() : 값(요소)을 가져온다.
			System.out.println(name + " ");
		}

		// 가장 긴 이름을 출력하세요.
		int longest = 0;

		for (int i = 1; i < a.size(); i++) {

			if (a.get(longest).length() < a.get(i).length()) {
				longest = i;
			}

		}

		System.out.println("가장 긴 이름은 " + a.get(longest) + "입니다.");
		sc.close();
	}

}
