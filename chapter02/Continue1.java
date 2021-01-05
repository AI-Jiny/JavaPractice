/*
	for분에서 continue
		.continue를 만나면 그 지점에서 바로 조건문의 증감으로 이동해서 반복한다.
*/
package c5_continue;

public class Continue1 {

	public static void main(String[] args) {

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {

				System.out.println(j);

				if (j > 2) {
					continue;
				}
				System.out.println("대박");
			}
			System.out.println("쪽박! 현재 i=" + i);
		}

	}

}
