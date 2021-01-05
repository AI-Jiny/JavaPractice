package step7_Extends;

class Point {
	int x, y;

	void set(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void showPoint() {
		System.out.println("( " + x + ", " + y + " )");
	}

}

class ColorPoint extends Point {
	String color;

	void setColor(String color) {
		this.color = color;
	}

	void showColorPoint() {
		System.out.println(color);
		showPoint();		//부모에 있는 메소드
	}
}

public class E2_ColorPointEx {
	
	public static void main(String[] args) {
		
		ColorPoint c = new ColorPoint();
		
		c.set(3, 4);			//부모 메소드	
		c.setColor("Pink");		//자식 메소드
		c.showPoint();			//부모 메소드
		c.showColorPoint();		//자식메소드
		
		
		
		
	}

}
