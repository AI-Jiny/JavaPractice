package chapter09;

import java.awt.*;
import javax.swing.*;

public class ImageQaurter extends JFrame {

	public ImageQaurter() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyCanvas());

		setSize(300, 300);
		setVisible(true);

	}

	public static void main(String[] args) {
		new ImageQaurter();
	}

	class MyCanvas extends JPanel {
		
		//멤버변수, 전역변수, 필드
		ImageIcon icon = new ImageIcon(".\\Img\\Flower.jpg");
		Image img = icon.getImage();
		
		int imgWidth = img.getWidth(this);
		int imgHeight = img.getHeight(this);
		
		
		//기본생성자
		public MyCanvas() {}

		
		//메소드
		@Override
		protected void paintComponent(Graphics g) {

			super.paintComponent(g);

			//판넬크기
			int panelWidth = this.getWidth();
			int panelHeight = this.getHeight();
			
			//사진 일부분을 잘라서 판넬에 붙임
			g.drawImage(img, 0, 0, panelWidth/2-5, panelHeight/2-5, 0, 0, imgWidth/2, imgHeight/2, this);
			g.drawImage(img, panelWidth/2+5, 0, panelWidth, panelHeight/2-5, imgWidth/2, 0, imgWidth, imgHeight/2, this);
			g.drawImage(img, 0, panelHeight/2+5, panelWidth/2-5, panelHeight, 0, imgHeight/2, imgWidth/2, imgHeight, this);
			g.drawImage(img, panelWidth/2+5, panelHeight/2+5, panelWidth, panelHeight, imgWidth/2, imgHeight/2, imgWidth, imgHeight, this);
			
		
		}

	}

}
