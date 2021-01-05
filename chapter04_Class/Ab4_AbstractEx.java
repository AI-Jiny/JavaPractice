package step8_추상과인터페이스;

abstract class MyCalculator {

	abstract public int add(int a, int b);

	abstract public int substract(int a, int b);

	abstract public double average(int[] a);

}

class GoodCal extends MyCalculator {

	@Override
	public int add(int a, int b) {

		return a + b;
	}

	@Override
	public int substract(int a, int b) {

		return a - b;
	}

	@Override
	public double average(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}

		return sum / (float) a.length;
	}

}

public class Ab4_AbstractEx {

	public static void main(String[] args) {

		// 업캐스팅

		MyCalculator myCal = new GoodCal();
		System.out.println(myCal.add(2, 3));
		System.out.println(myCal.substract(2, 3));
		System.out.println(myCal.average(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }));

	}

}
