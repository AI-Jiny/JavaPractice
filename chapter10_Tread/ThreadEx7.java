package Thread;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

class Timer extends Thread{
	
	JLabel timerLabel;
	
	public Timer(JLabel timerLabel) {
	
		this.timerLabel = timerLabel;
		
	}
	
	public void run() {
		
		String second = JOptionPane.showInputDialog("Enter", "최소 10초 이상입니다.");
		int t = Integer.parseInt(second);
		
		for(int i=t; i>0; i--) {
			
			timerLabel.setText(Integer.toString(i));
			
			try {
			sleep(1000);	
			
			} catch (Exception e) {
				
				return;
			}
			
		}
		
			timerLabel.setFont(new Font("Gothic", Font.ITALIC, 30));
			timerLabel.setText("Rrrrrrrr");
			Thread.interrupted();
			
			
			
			
		//3초 있다가 다시 이 파일이 실행되도록 하기
			
			
			try {
				sleep(3000);
			} catch (Exception e) {

				return;
				
			}
			new ThreadEx7();
			
	}
	
}

public class ThreadEx7 extends JFrame {

	public ThreadEx7() {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.BLACK);
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		timerLabel.setForeground(Color.WHITE);
	
		
		//스레드 구현
		Timer t = new Timer(timerLabel);
		
		
		c.add(timerLabel);
		
		setSize(300,300);
		setVisible(true);
		
		
		//스레드 JVM에 전달
		t.start();
		
	}
	
	public static void main(String[] args) {
		
		new ThreadEx7();
		
	}
	
}
