/*
	버퍼입출력 스트림
	
		* 입력과 출력던에 버터를 두어서 다 채워지면 한번에 입출력하게 함으로써 컴퓨터의 효율을 높인것
		* 내부에 버퍼를 가진다는 것뿐이고, 개발자에게 보이는 형식은 동일하다
		
		* FileReader ---> BufferReader0 ---> read()

*/


package inputoutput;

import java.io.*;

public class C3_Buffer {
	
public static void main(String[] args) throws IOException{
	
	//기반 스트림
	FileReader fin = new FileReader("C:\\Windows\\system.ini");		//읽어오기
	
	//보조스트림(버퍼)
	BufferedReader in = new BufferedReader(fin, 20);		//20글자씩 
	
	//화면에 출력해주세요 :)
	BufferedOutputStream out = new BufferedOutputStream(System.out, 20);
	
	//읽어오기
	int c;
	while((c=in.read())!=-1) {
		out.write((char)c);
		
	}
	
	
	//나머지 전부 출력 (20칸이 다 안차도)
	out.flush();
	in.close();
		
	
}


}
