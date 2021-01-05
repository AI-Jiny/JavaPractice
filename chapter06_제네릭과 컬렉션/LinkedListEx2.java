package Collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx2 {

	static void printList(LinkedList<String> m) {

		Iterator<String> iterator = m.iterator();

		while (iterator.hasNext()) { // 다음값이 있으면 아래를 실행해라
			String e = iterator.next(); // 값을 읽어서 저장하고
			String separator;

			if (iterator.hasNext()) {
				separator = "->"; // 마지막이 아니면

			} else {
				separator = "\n"; // 마지막이면
			}
			System.out.print(e + separator);
		}

	}

	public static void main(String[] args) {

		
		LinkedList<String> myList = new LinkedList<>();
		
		myList.add("트랜스포머");
		myList.add("스타워즈");
		myList.add("어벤져스");
		myList.add(0, "비긴어게인");
		myList.add(2, "스타이즈본");
		
		
		Collections.sort(myList);//정렬시켜주는 메소드
		printList(myList);
		
		int index = Collections.binarySearch(myList, "비긴어게인")+1;
		System.out.println("비긴어게인은 "+index+"번째 요소입니다.");
	}

}
