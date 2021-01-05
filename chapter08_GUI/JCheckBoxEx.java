/*
	JCheckBox
		* 선택(selected), 해제(unselected)두 상태만 존재한다.
		* 복수체크 가능
		* ItemEvent가 주로 발생된다.

	* 생성자
	* 메소드
		* setSelectedIcon()	:	선택되었을때 변경될 이미지 등록
		* setBorderPainted()	:	체크박스의 외곽선이 보이게
		* setSelected()	:	체크박스에 체크 처리
		* isSelected()	:	체크 되어있으면 true
		* setIcon()

*/
package component;
import java.awt.*;
import javax.swing.*;

public class JCheckBoxEx extends JFrame{

	public JCheckBoxEx() {
	
		setTitle("CheckBox Learning");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.PINK);
		
		
		JCheckBox apple = new JCheckBox("Apple");
		JCheckBox pear = new JCheckBox("Pear", true);

		
		ImageIcon img = new ImageIcon(".\\IMG\\chery.jpg");
		ImageIcon selectedImg = new ImageIcon(".\\IMG\\cheryCheck.jpg");
		
		
		
		JCheckBox cherry = new JCheckBox("Cherry", img);
		cherry.setSelectedIcon(selectedImg);
		cherry.setBorderPainted(true);
		
		
		
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		
		setSize(500,200);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new JCheckBoxEx();
	}
}
