package 직렬화;

import java.io.*;

class Goods implements Serializable{
	
	private static final long serialVersionUID = 2149726148327381846L;
	
	String item;
	int price;
	String shop;

	Goods(String item, int price, String shop) {
		this.item = item;
		this.price = price;
		this.shop = shop;

	}

	@Override
	public String toString() {
		return "상품명 : " + item + ", 가격 : " + price;
	}

}

public class SerializationEx2 {

	public static void main(String[] args) {
		// 제품명과 제품 가격, 제조사를 입력해 주세요.
		// 직렬화할 클래스 객체 생성
		Goods g1 = new Goods("거울", 3000, "mirror");
		Goods g2 = new Goods("핸드폰", 100000, "샘송");

		// 직렬화
		try {
			FileOutputStream fos = new FileOutputStream(".\\File\\serialization2.out");
			ObjectOutputStream obs = new ObjectOutputStream(fos);

			obs.writeObject(g1);
			obs.writeObject(g2);

		} catch (IOException e) {
			e.printStackTrace();
		}

		// 역직렬화
		try {
			FileInputStream fis = new FileInputStream(".\\File\\serialization2.out");
			ObjectInputStream ois = new ObjectInputStream(fis);

			Goods gg1 = (Goods) ois.readObject();
			Goods gg2 = (Goods) ois.readObject();

			System.out.println(gg1);
			System.out.println(gg2);

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();

		}

	}

}
