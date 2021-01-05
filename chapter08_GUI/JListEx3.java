package component;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class JListEx3 extends JFrame{

	JTextField tf = new JTextField(10);
	Vector<String> v = new Vector<>();
	JList<String> nameList = new JList<String>(v);
	
	public JListEx3() {
	
		setTitle("리스트 항목 변경");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
	
		c.add(new Label("*****<ENTER>*****"));
		c.add(tf);
		
		v.add("홍예훈");
		v.add("이재욱");
		v.add("임택균");
		
		nameList.setVisibleRowCount(5); //5개 까지만 보여주는 메소드
		nameList.setFixedCellHeight(30);//리스트의 높이
		
		
		
		c.add(new JScrollPane(nameList));

		
		tf.addActionListener(new ActionListener() {
			
			
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
			JTextField t = (JTextField)e.getSource();
			v.add(t.getText());
			nameList.setListData(v);
				
				
			}
		});
		
		setSize(300,300);
		setVisible(true);
	
	}
	
	public static void main(String[] args) {
		new JListEx3();
	}
	
	
}
