/*
	<<Math Class>>

		* java.lang 패키지에 포함
		* 기본적인 산술연산을 구행해주는 메소드를 제공한다.
		* 모든 멤버메소드들이 static으로 정의 되어 있어서 객체를 생성할 필요없다.
		* 정수와 실수타입의 메소드를 제공하는 대부분 실수연산으로 souble타입이 사용된다.


		* 주요 메소드

			* abs()		:	절대값
			* ceil()	:	올림
			* max()		:	최대값
			* min()		:	최소값
			* random()	:	0~1사이의 임의의 실수값 반환
			* round()	:	반올림
*/
package M;

public class Math1 {

	public static void main(String[] args) {

//		for (int x = 0; x < 10; x++) {
//			double num = Math.random() * 100;
//			int n = (int) (Math.round(num));
//			System.out.println(n + " ");
//		}

		double[] luck = new double[6];
		
		// 로또복권
		for (int i = 0; i < 6; i++) {

			luck[i] = Math.random() * 46 + 1;

			if (luck[i] != luck[i + 1]) {
				System.out.println((int) luck[i]);
				continue;

//			
//			int l = (int) (Math.round(luck));
//			System.out.print("(" + l + ")" + " ");
			} else {
				luck[i] = Math.random() * 46 + 1;
				System.out.println((int) luck[i]);

			}

		}
	}

}
