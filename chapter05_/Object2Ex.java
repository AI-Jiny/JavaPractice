package object;

class Point2 {
	int x, y;

	public Point2(int x, int y) {
		this.x = x;
		this.y = y;

	}

	@Override
	public String toString() {

		return "Point(" + x + ", " + y + ")";
	}

}

public class Object2Ex {

	public static void main(String[] args) {

		Point2 p = new Point2(2, 3);
		System.out.println(p.toString());
		System.out.println(p);
	}

}
//객체를 호출하면 toString이 자동으로 호출된다.