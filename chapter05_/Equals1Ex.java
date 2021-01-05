package object;

class Point3 {

	int x, y;

	public Point3(int x, int y) {
		this.x = x;
		this.y = y;

	}

	@Override
	public boolean equals(Object obj) {
		Point3 p = (Point3) obj;		//다운 캐스팅
		if (x == p.x && y == p.y) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {

		return "Point(" + x + ", " + y + ")";
	}

}

public class Equals1Ex {

	public static void main(String[] args) {

		Point3 a = new Point3(2, 3);
		Point3 b = new Point3(2, 3);
		Point3 c = a;

		if (a == b) {
			System.out.println("a==b"); // 서로 같은 객체인가?
		}

		if (a == c) {
			System.out.println("a==c");
		}

		if (a.equals(b)) {
			System.out.println("a와 b의 값이 같다."); // 내용 값이 같은가?
		}

		if (a.equals(c)) {
			System.out.println("a와 c의 값이 같다.");
		}

	}

}
