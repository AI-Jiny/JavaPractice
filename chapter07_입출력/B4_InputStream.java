package inputoutput;

import java.io.FileInputStream;
import java.io.IOException;

public class B4_InputStream {

	public static void main(String[] args) {

		FileInputStream fis;

		try {
			fis = new FileInputStream(".\\File\\Bs4.txt");

			byte[] bs = new byte[10];
			int i;

			while ((i = fis.read(bs)) != -1) {
				for (byte b : bs) {
					System.out.print((char) b);
				}

				System.out.println(":" + i + "바이트 읽음");
			}

			fis.close();

		} catch (

		IOException e) {
			System.out.println("입출력 에러입니다.");
		}

	}

}
