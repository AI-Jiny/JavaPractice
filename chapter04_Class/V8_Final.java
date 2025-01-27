package step2_Variable;

import java.io.IOException;

public class V8_Final {
	public static void main(String[] args) throws IOException {

		final int TRIANGLE = 1;
		final int RECTANGLE = 2;
		final int CIRCLE = 3;

		
		System.out.println("1~3사이의 숫자를 입력해주세요>>");
		int num = System.in.read() - '0';
		// '0'아스키값 80 --> 만약 3을 입력하면 아스키 코드 값으로는 83 --> 83-80('0') = 3

		
		if (num == TRIANGLE) {
			System.out.println("삼각형을 그린다.");
		} else if (num == RECTANGLE) {
			System.out.println("사각형을 그린다.");
		} else if (num == CIRCLE) {
			System.out.println("원을 그린다.");
		} else {
			System.out.println("숫자를 잘못 입력하셨습니다.");
		}

	}

}
