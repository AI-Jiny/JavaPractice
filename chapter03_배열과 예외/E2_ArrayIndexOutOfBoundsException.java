package c2_Exception;

public class E2_ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {

		int[] arr = new int[5];

		try {
			arr[3] = 0;
			arr[6] = 5;
			System.out.println(arr[6]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 범위를 벗어났습니다.");
		}

	}

}
