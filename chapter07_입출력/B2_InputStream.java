package inputoutput;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class B2_InputStream {

	public static void main(String[] args) {

		try {

			FileInputStream my = new FileInputStream(".\\File\\Bs2.txt");

			InputStreamReader in = new InputStreamReader(my, "utf-8");
			int c;
			while ((c = in.read()) != -1) {
				System.out.print((char) c);

			}
			in.close();
			my.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
