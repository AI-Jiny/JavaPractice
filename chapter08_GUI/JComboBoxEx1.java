/*
	ComboBox<E>
		* = JTextField + JButton + JList
		* 주요 메소드
			* addItem()		:	아이템을 리스트와 다르게 직접 ComboBox에 추가할 수 있다.
			* remove()		:	삭제
			* removeItemAt():	지정한 인덱스번호에 해당하는 아이템을 삭제
			* removeAll()	:	전체삭제
			* getIndex()	:	인덱스 번호 불러오기
*/
package component;

import java.awt.*;
import javax.swing.*;

public class JComboBoxEx1 extends JFrame {

	//멤버변수, 필드
	Container c = getContentPane();
	String[] fruits = {"사과", "바나나", "망고", "배", "체리"};
	
	
	//생성자
	public JComboBoxEx1() {
	
		setTitle("ComboBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c.setLayout(new FlowLayout());
		
		//방법1 - 생성자 이용
		JComboBox<String> strCombo1 = new JComboBox<>(fruits);

		//방법2 - addItem()이용
		JComboBox<String> strCombo2 = new JComboBox();
		
		for(int i=0; i<fruits.length; i++) {
			strCombo2.addItem(fruits[i]);
		}
		
		c.add(strCombo1);
		c.add(strCombo2);

		setSize(300,300);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new JComboBoxEx1();
	}
	
	
}
