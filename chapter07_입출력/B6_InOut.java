package inputoutput;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class B6_InOut {

	public static void main(String[] args) {

		try {
			// 데이터를 저장 : .//File//Bs6.txt
			// 10, 9, 8, 7, ..., 1 (for)문으로 저장

			FileOutputStream foss = new FileOutputStream(".\\File\\Bs6.txt");

			for (int i = 0; i < 10; i++) {
				int n = 10 - i;
				foss.write(n);

			}

			// ***********************************
			// 데이터 읽어오기
			FileReader fos = new FileReader(".\\File\\Bs6.txt");
			
			
			int c;
			while ((c = fos.read()) != -1) {

				System.out.print(c);
			}

			fos.close();

		} catch (IOException e) {
			System.out.println("데이터 입출력에 실패하셨습니다.");
		}

	}

}
