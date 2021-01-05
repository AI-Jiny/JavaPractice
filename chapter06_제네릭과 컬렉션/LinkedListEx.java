/*
		<<linkedList>>
		
						배열									LinkedList
----------------------------------------------------------------------------------
저장					물리적인 연속 공간								논리적인 연속공간
삽입/삭제			크기가 변하면 다시 만들어야 함						앞 뒤 노드의 연결주소만 변경
장단점				자료변경이 거의 없을때							자료변경이 많을때


		* 주요 메소드
			* add(), add(index, value), addFirst(value), addLast(Value)
			* get(index), getFirst(), getLast()
			* remove(index), removeAll(), removeFirst(), removeLast()
			
*/
package Collection;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {

		LinkedList<String> link = new LinkedList<>();
		link.add("A");
		link.add("B");
		link.add("C");

		System.out.println(link);
		link.add(1, "D");
		link.add(1, "E");
		System.out.println(link);
		
		link.addFirst("0");
		link.addLast("10000");
		System.out.println(link);
		
		//첫번쨰 값 출력
		System.out.println(link.get(0));
		System.out.println(link.get(6));
		System.out.println(link.get(2));
		
		
		System.out.println(link.size());
	}

}
