/*
	* 생성자
	* 정렬 (hAlignement)
		* SwingContents.Left/Right/Center

	* JLabel에 담을 수 있는 이미지는 png, gif, jpg 세가지 뿐이다.
*/

package component;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JLabelEx extends JFrame{

	//전역변수 선언
	Container c;
	JLabel textLabel, imgLabel, la;
	
	public JLabelEx() {
		
		setTitle("레이블 학습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//문자열 LABEL
		textLabel = new JLabel("자바기반 안드로이드 개발과정");
		textLabel.setFont(new Font("굴림체", Font.BOLD, 20));
		
		//이미지 LABEL
		ImageIcon beauty = new ImageIcon(".\\IMG\\hearts.jpg");
		imgLabel = new JLabel(beauty);	//사이즈는 그림 사이즈에 맞춰진다
		
		//문자열 + 이미지 LABEL
		ImageIcon normalIcon = new ImageIcon(".\\IMG\\telred1.gif");
		JLabel label = new JLabel("궁금한게 있으면 전화주세요.", normalIcon, SwingConstants.CENTER);
		
		//숨겨진 이미지 레이블 생성
		la = new JLabel(new ImageIcon(".\\IMG\\chery.jpg"));
		la.setVisible(false);	//처음에 보이지 않게
		
		c.add(textLabel);
		c.add(imgLabel);
		c.add(la);
		c.add(label);
		
		label.addMouseListener(new MyMouse());
		
		setSize(400,800);
		setVisible(true);
		
	}
	
	class MyMouse extends MouseAdapter{

		@Override
		public void mouseClicked(MouseEvent e) {
			
			if(imgLabel.isVisible()) {
				imgLabel.setVisible(false);
				la.setVisible(true);
				
			}else {
				imgLabel.setVisible(true);
				la.setVisible(false);
			}
			
		}
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		new JLabelEx();
		
	}
	
}
