/*
	배열을 활용해서 합계와 평균을 구하는 연습
	출력모양 		합계: 455
				과목수: 5
				평균 : 89
*/
package c1_array;

public class Array2 {

	public static void main(String[] args) {

		// 1.배열선언
		int[] a = new int[] { 85, 90, 75, 100, 95 };
		// 2.활용한 변수선언
		int sum = 0, avg;
		// 3.합계선언
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}

		
		avg = sum/a.length;
		System.out.println("합계 : "+sum);
		System.out.println("과목수 : "+a.length);
		System.out.println("평균 : "+avg);
		
	}

}
