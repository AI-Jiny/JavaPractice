package Collection;

import java.util.Vector;

public class C3_VectorEx1 {

	public static void main(String[] args) {

		// 벡터 생성
		Vector <Integer> v = new Vector<>();

		// 자료 입력
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(4);

		// 벡터의 중간에 삽입하기
		v.add(2, 1000);


		for (int i = 0; i < v.size(); i++) {

			int n = v.get(i);
			System.out.println(n);

		}

		System.out.println("벡터내의 요소 객체의 수 : " + v.size());
		System.out.println("벡터의 현재용량 : " + v.capacity());

		// 벡터의 모든 정수를 더하시오.
		// 벡터속의 총합을 출력하시오.

		int sum = 0;
		for (int i = 0; i < v.size(); i++) {
			int n = v.get(i);
			sum += n;
		}
		System.out.println("벡터 안에 있는 정수의 합 : " + sum);

		///////////////////////////////////////////////////////////

		Vector<Member> m = new Vector<>();

		m.add(new Member(1001, "김효진"));

		Member t = m.get(0);
		System.out.println(m.get(0));

		
		
		t.setMemberId(1004);
		t.setMemberName("홍예훈");
		System.out.println(m.get(0));

	}

}
