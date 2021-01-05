package 직렬화;

import java.io.*;

public class serializationEx3_역직렬화 {

	public static void main(String[] args) throws ClassNotFoundException {

		// 역직렬화
		try {

			FileInputStream fis = new FileInputStream(".\\File\\serialization3.out");
			ObjectInputStream ois = new ObjectInputStream(fis);
			

			Parr pin = (Parr) ois.readObject();

			for (int i = 0; i < pin.arr.length; i++) {

				if (pin.arr[i] == null) {
					break;

				} else {

					System.out.println(pin.arr[i].getName());
					System.out.println(pin.arr[i].getAge());
					System.out.println(pin.arr[i].getAdd());
					System.out.println();
					
				}

			}
			System.out.println("모두 출력되었습니다.");
			ois.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
