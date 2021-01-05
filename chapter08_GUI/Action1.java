package listener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Action1 extends JFrame {

	public Action1() {

		setTitle("Action Listener");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentpane = getContentPane();
		contentpane.setLayout(new FlowLayout());

		
		JButton b = new JButton("**Action**");
		
		//리스노 부착
		b.addActionListener(new MyActionListener1());
		contentpane.add(b);
		
		
		setSize(300, 200);
		setVisible(true);

	}

	public static void main(String[] args) {

		new Action1();

	}

}


//리스너 생성

class MyActionListener1 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {	//누를때 객체 생성됨
		
		JButton btn =(JButton)e.getSource();
		
		if(btn.getText().equals("**Action**")) {
			btn.setText("액션");
			btn.setBackground(Color.magenta);

		} else {
			btn.setText("Action");
			btn.setBackground(Color.CYAN);
		}
		
	}
	
}

