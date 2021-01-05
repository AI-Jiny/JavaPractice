/*
	이미지 그리기
		* JLabel에 이미지를 붙여서 출력하는 방법
			- 리스너 부착 가능, 동작 실행 가능
		* Graphic으로 그리는 방법
			- 리스너 부착 불가능
		
	ImageIcon Class --> Image Class : 이미지의 객체 정보를 추출
	
	메소드
		* 원본 크기로 그리기	:	drawImage(img, x, y, bgColor, this)
		* 크기 조정해서 그리기	:	drawImage(ing, x, y, w, h, bgColor, this)
		* 일부분 잘라서 그리기	:	drawImage(img, dx1, dy1, dx2, dy2, sx1, sy1, sx2, sy2, this) 
	
*/
package chapter09;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImagePaint extends JFrame {

	Container c;

	public ImagePaint() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();

		c.add(new MyPanel(), BorderLayout.CENTER);

		setSize(1900, 850);
		setVisible(true);

	}

	public static void main(String[] args) {
		new ImagePaint();

	}

	class MyPanel extends JPanel {

		@Override
		protected void paintComponent(Graphics g) {

			super.paintComponent(g);

			ImageIcon img = new ImageIcon(".\\Img\\pg.jpg");
			Image im = img.getImage(); // 객체 정보 추출

			int width = im.getWidth(this);
			int height = im.getHeight(this);
			

			// 원본 그대로 그리기
			g.drawImage(im, 0, 0, Color.blue, this);
			
			// 크기 조정해서 그리기
			g.drawImage(im, 0, 0, width/2, height/2, this);
			
			// 잘라서 그리기
			g.drawImage(im, 1000, 20, 1224, 340, 0,0, 224, 120, this);
			g.drawImage(im, 500,500, 900, 900, 50, 50, 250, 240, this);
			g.drawImage(im, 1000, 20, 1224, 340, 0,0, 224, 120, this);

			
			
			
			
		}

	}

}
