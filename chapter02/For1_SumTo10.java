/*
		for(시작점; 조건식; 증감식){
			실행문;
		}
	-조건식이 맞는 동안 반복한다.
	-시작점, 조건식, 증감식은 모두 생략 가능하다.

*/
package c3_for;

public class For1_SumTo10 {

	public static void main(String[] args) {

		int sum = 0;
		int i = 0;

		for (i = 0; i < 10; i++) {
			// i=0, 1
			// i=1, 1+2
			// i=2, 1+2+3
			// ...
			// i=9, 1+...+10
			sum += i + 1;
			// sum = sum + i;
		}

		System.out.println((i) + "까지의 합은" + sum + "입니다.");
		
		
		int j=0;
		for(;;) {
			if(j>10) {
				break;		//반복문을 빠져나가게 하는 예약어
			}
			
			sum +=j;
			System.out.println(j+"까지의 합은"+sum+"입니다.");
			j++;
			
		}

	}

}
