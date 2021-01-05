/*		while문
			.참인 동안만 실행
			.시작할때 참의 조건으로 시작
			.while문 안에서 거짓의 조건을 만들어서 반복을 중지시킨다.
*/
package c4_while;

public class While_SumTo10 {

	public static void main(String[] args) {

		int sum = 0, i = 1;

		while (i <= 10) {
			// 합구하기
			sum += i;
			// 출력하기
			System.out.println(i + "까지의 합은" + sum + "입니다.");
			i = i + 1;

		}
		System.out.println("10까지의 합은" + sum + "입니다.");
		
	}

}
