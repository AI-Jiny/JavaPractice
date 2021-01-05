package inputoutput;

import java.io.*;
import java.util.Scanner;

public class Io3_standardIO {

	public static void main(String[] args) {
		try {
			// 파일을 바이트 단위로 읽은 객체 생성 - 원본에 공백이 있으면 그 다음은 못 읽는다.

			FileInputStream fio = new FileInputStream(".\\File\\StandardIO1.txt");

			Scanner sc = new Scanner(fio);

			String str = sc.next();

			System.out.println(str);

			sc.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
