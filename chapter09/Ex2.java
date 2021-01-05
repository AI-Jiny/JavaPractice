package chapter09;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//입력창에 이름을 입력하면, 옆에 콤보박스에 이름이 저장되는 화면

public class Ex2 extends JFrame {

	JLabel la = new JLabel("이름 입력");
	JTextField text = new JTextField(5);
	JComboBox<String> strName = new JComboBox<String>();
	Container c;

	public Ex2() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.black);
		
		la.setForeground(Color.WHITE);
		
		text.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				strName.addItem(t.getText());
			}
		});
			
		c.add(la);
		c.add(text);
		c.add(strName);
		
		setSize(300,150);
		setVisible(true);
		

	}

	public static void main(String[] args) {
		new Ex2();
	}

}
