package Collection;

import java.util.ArrayList;

class ArrayList1 {

	private ArrayList<Member> arrayList;
	// ArrayList<Member> arrayList = new ArrayList<>();

	public ArrayList1() {
		arrayList = new ArrayList<>();
	} // 객체 생성 분리 시킴

	public void addMember(Member member) {
		arrayList.add(member);
		// arrayList에 member객체 추가
	}

	// 찾는 아이디가 있으면 삭제
	public boolean removeMember(int memberId) {

		for (int i = 0; i < arrayList.size(); i++) {

			Member member = arrayList.get(i);
			// ArrayList속에 저장된 member객체를 꺼내서 변수에 담는다.
			int tempId = member.getMemberId();
			// 그 꺼내온 member객체 속에서 ID값을 꺼내 tempID에 저장.

			if (tempId == memberId) {
				arrayList.remove(i);
				return true;
			}

		}
		System.out.println(memberId + "는 존재하지 않습니다.");
		return false;

	}

	public void showAllMember() {
		for (Member m : arrayList) {
			System.out.println(m);
		}

		System.out.println();
	}

}

public class C2_ArrayListEx {

	public static void main(String[] args) {

		// 회원멤버 객체생성
		Member hong = new Member(1001, "홍예훈");
		Member kim = new Member(1002, "김효진");
		Member park = new Member(1003, "박유정");
		
		//	회원카드를 ArrayList에 담는다.
		ArrayList1 mlist = new ArrayList1();	//ArrayList<Member> 생성
		
		
		mlist.addMember(hong);
		mlist.addMember(kim);
		mlist.addMember(new Member(1003, "박유정"));
		
		
		//회원명부출력
		mlist.showAllMember();
		
		//회원삭제
		mlist.removeMember(1003);
		
		//삭제확인
		mlist.showAllMember();
		
		
		

	}

}
