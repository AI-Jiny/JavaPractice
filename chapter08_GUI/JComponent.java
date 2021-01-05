/*
	Swing이 GUI화면을 만드는 두가지 방법
		* 컴포넌트 기반 GUI프로그래밍
			* JAVA에서 제공하는 GUI컴포넌트를 이용해서 쉽게 GUI프로그래밍 작성

		* 그래픽 기반 GUI프로그래밍
			* 선, 원, 도형 등 직접 화면에 그린다.
			* 게임 제작 등에 주로 사용된다.
			* 단, 개발자의 부담이 크다.
		
		* 상속관계
						JComponent
							\
	----------------------------------------------------
		JLabel, JScroll, JMenuBar, JList, JPanel,
		JComboBox, JSlider, JButton, JMenuItem(JMenu),
	JToggleButton(JCheckBox, JRadioButton), JTextField,
				JPasswordField, JTextArea
	
	
		* 공통 메소드
			* 모양관련
				* setForeground(Color)	:	글자색, 전경색
				* setBackGround(Color)	:	배경색
				* setOpaque()	:	불투명
				* setFont()		:	폰트설정
				* getFont()		:	폰트리턴
	
			* 위치와 크기
				* getWidth()	:	폭
				* getHeight()	:	높이
				* getX(), getY()
				* setLocation(x,y)	:	위치
				* setSize(width, height)
				 
			* 상태관련
				* setEnable()	:	컴포넌트 활성화 여부
				* setVisible()		
				* inVisible()	:	보이는 상태라면 true

			* 컨테이너를 위한 메소드
				* add()	:	자식컴포넌트 추가
				* remove()	:	자식컴포넌트 제거
				* removeAll()	:	
				* getComponents()	:	자식 컴포넌트 배열리턴
				* getParent()	:	부모 컨테이너 리턴
				* getTopLevelAncestor()	:	최상위 부모 컨테이너 리턴

*/
package component;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JComponent extends JFrame {

	public JComponent() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel c = new JPanel();
		setContentPane(c);
		c.setLayout(null);
		
		JLabel la = new JLabel("모양 메소드", JLabel.CENTER);
		la.setSize(150,50); //라벨은 항상 사이즈가 있어야함
		la.setLocation(60,100);
		
		
		la.setOpaque(true);
		la.setBackground(Color.black);
		la.setForeground(Color.CYAN);
		la.setFont(new Font("고딕체", Font.BOLD, 20));
		
		c.add(la);
		
		
		
		
		setSize(300,300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new JComponent();
	}

}
