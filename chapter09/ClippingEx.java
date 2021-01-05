/*
	클리핑
		* 지정된 부분만 보이도록 하는 기능
		* 사각형만 된다.
		
		* setClip(x, y, w, h) / clipRect(x, y, w, h)

*/
package chapter09;

import java.awt.*;
import javax.swing.*;

public class ClippingEx extends JFrame {
	
	public ClippingEx() {
	 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		MyPanel panel = new MyPanel();
		c.add(panel, BorderLayout.CENTER);
		
		setSize(900,900);
		setVisible(true);
	}

	
	
	public static void main(String[] args) {
		new ClippingEx();
	}
	
	
	
	
	class MyPanel extends JPanel{
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			ImageIcon img = new ImageIcon(".\\Img\\Flower.jpg");
			Image im = img.getImage();
			
			int w = im.getWidth(this);	//this에는 객체의 주소값이 들어있음
			
			//new ClippingEx()을 this자리에 넣을경우 무한생성
			
			
			int h = im.getHeight(this);
			
			//클리핑 설정
			g.setClip(10, 10, 200, 300);
			
			//이미지 그리기
			g.drawImage(im, 0, 0, this.getWidth(), this.getHeight(), this);
			
			
			//이미지 위에 글자 작성
			g.setColor(new Color(223,215,131));
			g.setFont(new Font("돋움체", Font.BOLD, 30));
			g.drawString("Flower", 100, 200);
			
			
		}
		
	}
	
}
