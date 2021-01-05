package GenericMake;

class GStack2 {

	int point;
	Object[] stack; // 최상위 Object의 객체를 담는 배열 stack생성

	public GStack2() {
		point = 0;
		stack = new Object[10];

	}

	public void push(Integer item) {

		if (point == 10) { // 배열이 꽉 차있으면
			return; // 호출한 곳으로 돌아가라
		}

		// 아직 남아있으면 스택에다가 String객체를 저장하고, 포인트를 증가시켜놓는다.
		stack[point] = item; // Integer클래스 타입의 item
		point++;

	}

	public Integer pop() {
		if (point == 0) {
			return null;
		}
		// 값이 있으면, 포인트를 내려놓고 값을 리턴해라
		point--;
		return (Integer) stack[point]; // 다운캐스팅해서 반환

	}

}

public class G2_Integer {

	public static void main(String[] args) {

		GStack2 st2 = new GStack2();

		st2.push(100);
		st2.push(200);
		st2.push(300);
		st2.push(400);
		for (int a = 0; a < 4; a++) {
			System.out.println(st2.pop());

		}

	}

}
