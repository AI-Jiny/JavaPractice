package c1_array;

public class Array8 {
	
	public static void main(String[] args) {
		
	//비정방형 도형
		/*
		[][][][]
		[]
		[][][]
		[][][][][][]
		*/
		int [][] arr = new int[4][];
		arr[0]=new int[4];
		arr[1]=new int[1];
		arr[2]=new int[3];
		arr[3]=new int[6];
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				
				arr[i][j]=(i+1)*10+j;
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("["+arr[i][j]+"] ");				
			}
			System.out.println();
		}
		
		/*
		 * 가 나 다 라 마
		 * 가 나
		 * 가 나 다
		 * 가 나 다 라 
		*/
		/*
		 * char [][] arr1 = new char[4][];
		 * arr1[0]=new char[5];
		 * .....
		*/
		
		char [][] arr1 = {{'가','나', '다', '라','마'},{'가','나'},{'가','나','다'},{'가','나','다','라'}};
		for(int i =0;i<arr1.length;i++) {
			for(int j =0; j<arr1[i].length;j++) {
				System.out.print("["+arr1[i][j]+"] ");
			}
			System.out.println();
		}
		
		
	}

}
