package inputoutput;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class B3_InputStream {

	public static void main(String[] args) {

		try {

			FileInputStream fis = new FileInputStream("C:\\Windows\\system.ini");

			int c;
			while ((c = fis.read()) != -1) {

				System.out.print((char) c);

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
