package inputoutput;

import java.io.FileWriter;
import java.io.IOException;

public class C2_FileWriter {
	public static void main(String[] args) {
		
		
		try {

			
			
			FileWriter fout = new FileWriter(".\\File\\Cs1.txt");
			
			
			fout.write("자~ 파일에 입력을 해볼까요?");
			fout.write('A');
			
			char [] buf = {'a', 'b', 'c'};
			fout.write(buf);
			
			fout.write(buf,1,2);
			
			
			System.out.println("정상 출력 되었습니다.");
			
			fout.close();
			
			
			
			
			
			
		} catch (IOException e) {

			
			
			
			
		}
		
		
		
		
	}

}
