package GenericMake;

/*
일반적인 클리스이고 문자를 받아서 스택에 저장하고 꺼내서 사용하는 스택클래스
*/

class GStack1 {

	int point;
	Object[] stack; // 최상위 Object의 객체를 담는 배열 stack생성

	public GStack1() {
		point = 0;
		stack = new Object[10];

	}

	public void push(String item) {

		if (point == 10) { // 배열이 꽉 차있으면
			return; // 호출한 곳으로 돌아가라
		}

		// 아직 남아있으면 스택에다가 String객체를 저장하고, 포인트를 증가시켜놓는다.
		stack[point] = item; // String클래스 타입의 item
		point++;

	}

	public String pop() {
		if (point == 0) {
			return null;
		}
		// 값이 있으면, 포인트를 내려놓고 값을 리턴해라
		point--;
		return (String) stack[point]; // 다운캐스팅해서 반환

	}

}

public class G2_String {

	public static void main(String[] args) {

		GStack1 st = new GStack1();

		st.push("서울");
		st.push("부산");
		st.push("인천");
		st.push("광주");

		for (int a = 0; a < 4; a++) {
			System.out.println(st.pop());

		}

	}

}
