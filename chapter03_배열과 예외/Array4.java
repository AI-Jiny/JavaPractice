package c1_array;

//정수 배욜에 8개의 값을 지정해 놓고, 최대값과 최소값을 찾아내는 프로그램을 작성하시오.

public class Array4 {

	public static void main(String[] args) {

		// int num[]=new int[] {10,20,30,40,50,60,70,80};
		int num[] = { 10, 20, 30, 40, 50, 60, 70, 80 };

		int min = 120, max = 0, sum = 0; // min은 충분히 적은수, max는 충분히 큰 수를 가정해서 넣어둔다.

		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];

			if (num[i] > max) {
				max = num[i];
			}

			if (num[i] < min) {
				min = num[i];
			}

		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum / num.length);
		System.out.println("최소값 : " + min);
		System.out.println("최댓값 : " + max);

	}

}
