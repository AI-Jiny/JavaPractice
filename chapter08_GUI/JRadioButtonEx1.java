/*
	JRadioButton
		* 기본적으로 JCheckBox와 생성자, 메소드, 이벤트 처리가 동일하다.
		* 차이점
			* 체크박스는 독립적으로 선택/해제 가능
			* 라디오버튼은 여러개가 버튼그룹으로 묶여 생성되어 하나만 선택가능
		* 생성방법
			* ButtonGroup 객체 생성
			* JRadioButton들을 생성
			* ButtonGroup속에 JRadioButton을 등록
			* 컨텐트팬에 부착
		* 재선택 되는 경우 Item이벤트가 발생되지 않는다.
*/
package component;
import javax.swing.*;
public class JRadioButtonEx1 extends JFrame {
	public JRadioButtonEx1() {
		
		setTitle("JRadioButton Learning");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel c = new JPanel();
		setContentPane(c);
		
		ImageIcon img = new ImageIcon(".\\IMG\\chery.jpg");
		ImageIcon selectedImg = new ImageIcon(".\\IMG\\cheryCheck.jpg");
		
		//ButtonGroup 생성
		ButtonGroup br = new ButtonGroup();
		
		//라디오 버튼 생성
		JRadioButton apple = new JRadioButton("사과");
		JRadioButton pear = new JRadioButton("배");
		
		
		JRadioButton cherry = new JRadioButton("체리", img);
		cherry.setSelectedIcon(selectedImg);
		cherry.setBorderPainted(true);
		
		
		//등록
		br.add(apple);
		br.add(pear);
		br.add(cherry);
		
		
		//컨텐트팬에 부착
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		
		setSize(300,250);
		setVisible(true);
		
		
	}

	public static void main(String[] args) {
		new JRadioButtonEx1();
	}

}
