package step9_포함관계;

class Seller {
	String name;
	int apple = 20; // 사과 보유 갯수
	int money = 0;
	final int PRICE = 1000;

	public Seller(String name, int apple, int money) {
		this.name = name;
		this.apple = apple;
		this.money = money;

	}

	int sell(String buyer, int amt) {
		int num = amt / PRICE;
		apple = num;
		money += amt;
		System.out.printf("%s가 %s에게 %d원어치 1개에 %d원인 사과를 구매하였습니다.", buyer, name, amt, PRICE);

		return num;
	}

	void showSellResult() {
		System.out.println("-----------------------------------------");
		System.out.println(name + " 사과갯수 : " + apple);
		System.out.println(name + " 현재금액 : " + money);

	}
}

class Buyer {
	String name;
	int apple = 0;
	int money = 10000;

	public Buyer(String name, int apple, int money) {
		this.name = name;
		this.apple = apple;
		this.money = money;
	}

	void buy(Seller fs, int amt) { // seller클래스를 포함시킴
		int num = fs.sell(name, amt); // 포함관계 활용
		apple -= num;
		money -= amt;

	}

	void showBuyResult() {
		System.out.println("-----------------------------------------");
		System.out.println(name + " 사과갯수 : " + apple);
		System.out.println(name + " 현재현금 : " + money);

	}
}

public class FruitsEx {

	public static void main(String[] args) {

		Seller fs1 = new Seller("유재석", 100, 0);
		Seller fs2 = new Seller("박명수", 8, 1000);

		Buyer fb1 = new Buyer("아이유", 0, 20000);
		Buyer fb2 = new Buyer("유인나", 10, 10000);
		Buyer fb3 = new Buyer("아이린", 0, 50000);

		fs1.showSellResult();
		fs2.showSellResult();

		fb1.showBuyResult();
		fb2.showBuyResult();
		fb3.showBuyResult();

	}

}
