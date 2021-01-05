package c1_array;

public class Array5 {

	public static void main(String[] args) {
		// 배열속에 있는 값을 오른차순으로 정렬하시오.

		int[] num = { 95, 84, 12, 65, 48, 29, 1 };
		int changeRoom = 0;

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					changeRoom = num[i]; 	// cr값을 i값으로 대체
					num[i] = num[j]; 		// i값을 j값으로 대체
					num[j] = changeRoom; 	// j값을 cr값으로 대체

				}
			}
		}

		System.out.println("정렬된 값은 : ");
		for (int k : num) {
			System.out.print(k + " ");
		}

	}

}
