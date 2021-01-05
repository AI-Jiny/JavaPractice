package step8_추상과인터페이스;

interface Phone {
	int TIMEOUT = 10000;

	void sendCall();

	void receiveCall();

	default void printLogo() {
		System.out.println("*******Phone*******");
		System.out.println(TIMEOUT);
	}
}

class LGPhone implements Phone {

	@Override
	public void sendCall() {
		System.out.println("LG폰으로 전화를 겁니다.");

	}

	@Override
	public void receiveCall() {
		System.out.println("LG폰으로 전화를 받습니다.");
		System.out.println("지정된 시간은" + TIMEOUT);

	}

	@Override
	public void printLogo() {
		System.out.println("*******LGPHONE*******");

	}

}

public class LGPhoneEx {

	public static void main(String[] args) {

		LGPhone lg = new LGPhone();
		lg.sendCall();
		lg.receiveCall();
		lg.printLogo();

	}

}
