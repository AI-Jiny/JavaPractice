package step8_추상과인터페이스;

public class SAMSUNGPhone implements Phone {

	@Override
	public void sendCall() {
		System.out.println("SAMSUNG폰으로 전화를 겁니다.");
	}

	@Override
	public void receiveCall() {
		System.out.println("SAMSUNG폰으로 전화를 받습니다.");

	}

	public void flash() {
		System.out.println("화면이 켜졌습니다.");
	}

	public static void main(String[] args) {

		SAMSUNGPhone ss = new SAMSUNGPhone();
		ss.sendCall();
		ss.receiveCall();
		ss.printLogo();
		ss.flash();

	}
}
