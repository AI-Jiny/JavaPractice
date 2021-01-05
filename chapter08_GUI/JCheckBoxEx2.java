package component;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JCheckBoxEx2 extends JFrame {

	int price;
	JCheckBox[] fruits;
	JLabel sum;
	

	public JCheckBoxEx2() {

		setTitle("CheckBox & Event");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.ORANGE);

		// 안내 문구 레이블
		JLabel la = new JLabel("사과 : 1000원, 배 : 5000원, 체리 : 1500원");
		c.add(la);

		// 과일이름 저장 배열
		String[] name = { "사과", "배", "체리" };

		// 체크박스 저장 배열
		fruits = new JCheckBox[3];

		
		// 배열 생성
		for (int i = 0; i < fruits.length; i++) {

			fruits[i] = new JCheckBox(name[i]); // 체크박스 생성
			c.add(fruits[i]); // 컨텐트팬에 붙임
			fruits[i].addItemListener(new MyCheckBox()); 	//리스너부착

		}

		
		// 구매합산액 출력 레이블 생성
		price = 0;
		sum = new JLabel("현재" + price + "원입니다.");
		c.add(sum);
		
		
		setSize(300, 200);
		setVisible(true);

	}

	class MyCheckBox implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {

			// 선택과 해제시 +,-부호 값 설정
			int selected;
			if (e.getStateChange() == ItemEvent.SELECTED) {
				selected = +1;
			} else {
				selected = -1;
			}
			
			//계산
			if(e.getItem()==fruits[0]) {
				price = price + (1000*(selected));
			}else if(e.getItem()==fruits[1]) {
				price = price + (5000*(selected));
			}else {
				price = price + (1500*(selected));
			}

			//계산결과 출력
			sum.setText("현재 구매 총액은 "+price+"원 입니다.");
			
		}

	}

	public static void main(String[] args) {
		new JCheckBoxEx2();
	}
}
