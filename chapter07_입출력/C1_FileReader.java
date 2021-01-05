/*
		Reader					Writer
		  \						  \
	InputStreamReader		OutputStreamReader
	  FileReader				FileWriter		<가장많이 사용>			
	
	BufferReader
	FliterReader
	CharArrayReader
	PipedReader
	StringReader


*/
package inputoutput;

import java.io.FileReader;
import java.io.IOException;

public class C1_FileReader {

	public static void main(String[] args) {

		try {

			FileReader in = new FileReader("C:\\Windows\\system.ini");

			int c;
			while ((c = in.read()) != -1) {

				System.out.print((char) c);

			}
			in.close();

		} catch (IOException e) {
			System.out.println("데이터 읽어오기에 실패하였습니다.");
		}

	}

}
