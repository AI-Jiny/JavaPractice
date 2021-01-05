package inputoutput;

/*
	Enter = CR + LF
			13	 10
			\r	 \n
			
*/
import java.io.IOException;

public class Io2_standardIO {

	public static void main(String[] args) {

		System.out.println("알파벳을 여러개 쓰고 [ENTER]키를 누르세요>>");

		int i;

		try {
					//문장의 끝까지 반복해라(-1)
			while((i=System.in.read())!=-1) {
				
				System.out.print((char)i+" ");
				System.out.println(i);
				
			}
			

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}
