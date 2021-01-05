/*			Try~Catch와 Throws의 차이
 * 
 * 		. try~catch : 예외가 발생한 매소드에서 그 예외를 바로 처리
 * 		. throws	: 예외처리를  미루면서 그 메소드를 호출하여 사용하는 부분에서 처리
*/
package c2_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex5_Throws {

	public static void main(String[] args) throws FileNotFoundException,IOException//exception
	{

		FileInputStream fis = new FileInputStream("./file/a.txt");
		int c;
		while ((c = fis.read()) != -1) {
			System.out.print((char) c);
		}
		fis.close();

	}

}
