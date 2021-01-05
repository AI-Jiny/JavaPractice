package GenericMake;

class GStack3<T> {

	int point;
	Object[] stack; // 최상위 Object의 객체를 담는 배열 stack생성

	public GStack3() {
		point = 0;
		stack = new Object[10];

	}

	public void push(T item) {

		if (point == 10) { // 배열이 꽉 차있으면
			return; // 호출한 곳으로 돌아가라
		}

		// 아직 남아있으면 스택에다가 String객체를 저장하고, 포인트를 증가시켜놓는다.
		stack[point] = item; // String클래스 타입의 item
		point++;

	}

	public T pop() {
		if (point == 0) {
			return null;
		}
		// 값이 있으면, 포인트를 내려놓고 값을 리턴해라
		point--;
		return (T) stack[point]; // 다운캐스팅해서 반환

	}

}

public class G2_Generic {

	public static void main(String[] args) {

		// Generic의 구체화 : 객체 생성시에 타입 결정
		GStack3<Integer> st3 = new GStack3/* <Integer> */();

		st3.push(1);
		st3.push(2);
		st3.push(3);

		for (int i = 0; i < 3; i++) {
			System.out.println(st3.pop());
		}

		
		// 문자열형으로 활용
		GStack3<String> st4 = new GStack3();

		st4.push("김효진");
		st4.push("박유정");
		st4.push("홍예훈");

		for (int i = 0; i < 3; i++) {
			System.out.println(st4.pop());
		}

	}

}
