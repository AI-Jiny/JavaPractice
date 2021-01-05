package window;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;
class InputDialog extends JDialog{
	
	JTextField tf;
	
	public InputDialog(JFrame frame, String title, boolean modal) {
		
		super(frame, title, modal);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.MAGENTA);
		
		tf = new JTextField(20);
		JButton btn = new JButton("OK");
		c.add(tf);
		c.add(btn);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		
		setSize(400,100);
		setLocation(100,100);
		
	}
	
	String getInput() {
		
		if(tf.getText().length()==0) {
			return null;
			
		}else {
			
			return tf.getText();
		}
		
	}
	
}

public class DialogEx2 extends JFrame{
	
	
	public DialogEx2() {
	
		setTitle("데이터 입력받기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		InputDialog id = new InputDialog(this, "입력창", true);
		JButton btn = new JButton("모달 다이얼로그 보기");
		btn.setFont(new Font("고딕체", Font.BOLD, 20));
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				id.setVisible(true);
				
				String str =  id.getInput();
				
				if(str==null) {
					return;
				}else {
					JButton btn = (JButton)e.getSource();
					btn.setText(str);
					btn.setForeground(Color.MAGENTA);
				}
				
			}
		});
		
		
		c.add(btn);
		setSize(500,500);
		setLocation(400,150);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new DialogEx2();
	}
}
