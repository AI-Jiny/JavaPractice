/*
		직렬화와 역직렬화
			
			* 객체가 생성된 후 객체의 변수값은 생명체처럼 지속적으로 변경된다.
			* 객체가 생성된 후 어느 순간 그대로 저장하거나 네트워크를 통해 어느 시점의 데이터를 전송하는것을 말한다.
			* 객체내용을 연속스트림으로 만드는 것을 말한다.
			* 이렇게만 해야 파일에도 쓸 수 있고, 네트워크로 전송도 할 수 있다.
			* 
			* 
			* 문법구조
				* 임의의 자료구조 클래스 생성
					- serialversionUID생성
					
				* 출력 - 직렬화
				 	- (기반스트림) : FileOutputStream으로 저장할  파일을 생성한다.
					- (보조스트림) : ObjectOutStream으로 Object형으로 출력시킨다.
						  \
					  출력(저장,전송)
					  	  \	
				* 입력 - 역직렬화
					- serivalversionUID를 확인하고 변경되었으면 에러발생
					- 
					- 

*/
package 직렬화;

import java.io.*;

class Person implements Serializable {

	private static final long serialVersionUID = 1L;

	String name;
	String job;

	public Person() {
	};

	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}

	public String toString() {
		return name + ", " + job;
	}

}

public class SerializationEx1 {

	public static void main(String[] args) {

		Person ahn = new Person("안재웅", "대표이사");
		Person kim = new Person("김철수", "상무이사");

		try {
			FileOutputStream fos = new FileOutputStream(".\\File\\serialization1.out");
			ObjectOutputStream obs = new ObjectOutputStream(fos);

			obs.writeObject(ahn); // 자동 업캐스팅
			obs.writeObject(kim);

			// 저장 완료 : 여기까지가 *****직렬화*****

		} catch (IOException e) {
			e.printStackTrace();
		}

		// *****역직렬화*****

		try {
			FileInputStream fis = new FileInputStream(".\\File\\serialization1.out");

			ObjectInputStream ois = new ObjectInputStream(fis);

			Person p1 = (Person) ois.readObject(); // 다운캐스팅
			Person p2 = (Person) ois.readObject();

			System.out.println(p1);
			System.out.println(p2);

		} catch (IOException e) {
			e.printStackTrace();
			
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
			
		}

	}

}
