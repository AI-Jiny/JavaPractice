package step8_추상과인터페이스;

interface MobilePhone extends Phone {

	void sendSMS();

	void receiveSMS();

}

interface MP3Interface {

	void play();

	void stop();

}

interface MusicPhone extends Phone, MP3Interface {
	void playMP3RingTone();

}

class MyPhone implements AllInterface, MusicPhone, MobilePhone {

	@Override
	public void sendCall() {

		System.out.println("내폰은 전화를 걸 수 있습니다.");
	}

	@Override
	public void receiveCall() {

		System.out.println("내 폰은 전화를 받을 수 있습니다.");
	}

	@Override
	public void play() {

		System.out.println("내 폰은 음악을 틀 수 있습니다.");
	}

	@Override
	public void stop() {

		System.out.println("내폰은 음악을 끌 수 있습니다.");
	}

	@Override
	public void sendSMS() {

		System.out.println("내 폰은 문자를 발신할 수 있습니다.");
	}

	@Override
	public void receiveSMS() {

		System.out.println("내 폰은 문자를 수신할 수 있습니다.");
	}

	@Override
	public void playMP3RingTone() {

	}

	@Override
	public void recognizeSpeech() {
		// TODO Auto-generated method stub
		System.out.println("인공지능 1");
	}

	@Override
	public void systhesizeSpeech() {
		// TODO Auto-generated method stub
		System.out.println("인공지능 2");
	}

}

interface AllInterface {
	void recognizeSpeech();

	void systhesizeSpeech();
}

public class MyPhoneEx {

	public static void main(String[] args) {

		MyPhone mp = new MyPhone();
		mp.sendCall();
		mp.receiveCall();
		mp.play();
		mp.stop();
		mp.sendSMS();
		mp.receiveSMS();
		mp.recognizeSpeech();
		mp.systhesizeSpeech();

	}

}
