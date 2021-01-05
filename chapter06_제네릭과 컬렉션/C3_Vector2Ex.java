package Collection;

import java.util.Vector;

class Point {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;

	}
@Override
	public String toString() {
		return "(" + x + ", " + y + ")";

	}

}

public class C3_Vector2Ex {
	public static void main(String[] args) {

		Vector<Point> v = new Vector<>();

		v.add(new Point(0, 0));
		v.add(new Point(1, 1));
		v.add(new Point(2, 2));

		v.remove(1);

		for (int i = 0; i < v.size(); i++) {
			Point p = v.get(i);
			System.out.println(p);
			System.out.println(v.get(i).toString());
							//v[i].toString(), v[i].memberID;
							//객체명.메소드			객체명.필드
		}
		
		System.out.println(v.capacity());

	}

}
