package c1_array;

public class Array3 {

	public static void main(String[] args) {

		// 문자열 배열선언 및 생설
		String[] str = new String[] { "산토끼", "집토끼", "알카리토끼" };

		for (int i = 0; i < str.length; i++) {

			System.out.print(str[i] + " ");

		}
		System.out.println();
		
		

		// 확장된 for문
		for(String k: str) {
			System.out.print(k+" ");
		}
	}

}
