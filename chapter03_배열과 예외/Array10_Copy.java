package c1_array;

public class Array10_Copy {

	public static void main(String[] args) {
		
		char[] arr = { '가', '나', '다', '라', '마' };
		
		char[] arrCopy = new char[5];
		
		for (int i = 0; i < arr.length; i++) {
			arrCopy[i] = arr[i];
		}

		for(char k:arrCopy) {
			
			System.out.print( k + " ");
		}
		
		
		System.out.println("\n"+"-----------------");
		
		//배열을 복사해주는 기능을 가진 메소드 활용
		for(int i=0;i<arrCopy.length;i++) {
			arrCopy[i]='*';
		}
		
		System.arraycopy(arr, 1, arrCopy, 1, 2);
		//(원본배열, 원본 시작점, 복사될배열, 복사배열 시작위치, 복사개수)
		for(char k:arrCopy) {
			System.out.print(k+" ");
		}
	}

}
