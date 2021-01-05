package step8_추상과인터페이스;

interface volume {

	void volumeUp();

	void volumeDown();

}

class Tv implements volume {

	@Override
	public void volumeUp() {
		System.out.println("Tv 소리를 키웁니다.");
	}

	@Override
	public void volumeDown() {
		System.out.println("Tv 소리를 줄입니다.");
	}

	void changeT() {
		System.out.println("Tv 채널을 변경합니다.");
	}

}

class Audio implements volume {

	@Override
	public void volumeUp() {
		System.out.println("Audio 소리를 키웁니다.");
	}

	@Override
	public void volumeDown() {
		System.out.println("Audio 소리를 줄입니다.");
	}

	void changeA() {
		System.out.println("라디오 채널을 변경합니다.");
	}

}

class Speaker implements volume {

	@Override
	public void volumeUp() {
		System.out.println("Speaker 소리를 키웁니다.");
	}

	@Override
	public void volumeDown() {
		System.out.println("Speaker 소리를 줄입니다.");
	}

	void changeS() {
		System.out.println("Speaker 출력 방식을 변경합니다.");
	}

}

public class T3_Volume {

	public static void main(String[] args) {

		Tv tv = new Tv();

		tv.changeT();
	}

}
