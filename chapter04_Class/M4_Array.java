package step5_Method;

class Array {

	void print(int[] at) {

		for (int i = 0; i < at.length; i++) {
			at[i] = at[i] + i;
			System.out.print(at[i] + " ");
		}

		System.out.println();

	}

}

public class M4_Array {

	public static void main(String[] args) {

		Array ar = new Array();

		int [] arr = {10, 20, 30, 40, 50};
		
		ar.print(arr);
		
		
	}

}
