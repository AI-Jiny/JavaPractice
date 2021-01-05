/*
	Adapter
		* 리스너 인터페이스의 불편함을 개선하기 위해 제공되는 클래스이다.
		* 메소드가 하나뿐인 리스너인터페이스는 제공되지 않는다.
			* ActionListener, ItemListener, TextListener, AdjustListener에는 없다
		* XXXListner 대신에  XXXAdapter로 작성하면 된다.

*/
package listener;


import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;


public class Adapter extends JFrame{
	
	JLabel la;
	
	public Adapter() {
		
		setTitle("Adapter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel contentpane = new JPanel();
		setContentPane(contentpane);	//JFRAME의 컨텐트팬을 JPANEL로 변경해서 세팅
		
		contentpane.setLayout(null);
		contentpane.setBackground(Color.BLACK);
		
		//////////////////////////////////////////////////////////////

		contentpane.addMouseListener(new MyMouseListener1());
		
		la = new JLabel("Hi there :D");
		la.setSize(100,20);
		la.setLocation(30,30);
		contentpane.add(la);
		
		//////////////////////////////////////////////////////////////
	
		setSize(500,300);
		setVisible(true);
		
	}
	
	class MyMouseListener1 extends MouseAdapter{

		@Override
		public void mousePressed(MouseEvent e) {
			
			super.mousePressed(e);
			
			int x = e.getX();
			int y = e.getY();
			
			la.setLocation(x, y);
			
			
			
		}	//불필요한 것 없애기 위한 Adapter 상속
				
	}
	
	
	
	public static void main(String[] args) {
		
		new Adapter();
	}
	

}
