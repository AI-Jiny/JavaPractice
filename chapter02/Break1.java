/*
		Break문을 만나면 반복문을 빠져나간다.
*/
package c5_continue;

public class Break1 {

	public static void main(String[] args) {

		int num = 0, sum = 0;
		while (true) {
			num++; // 계속증가
			sum += num; // 계속더하기
			if (num == 100) {
				break;		//해당 반복문을 빠져나감(while)
			}
		}
		System.out.println("합계: " + sum);
	}

}
