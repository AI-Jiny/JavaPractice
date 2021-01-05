/*
	이벤트 : ActionEvent, ItemEvent 두종류가 동시에 발생한다.
		* ActionEvent는 아이템 선택할 때 무조건 한개 발생
		* ItemEvent는 새로운 아이템을 선택한 경우에만 발생

		* 메소드
			* getSelectedIndex()	:	선택한 상태인 아이템의 인덱스번호를 리턴
			* getSelectedItem()		:	선택상태인 아이템의 객체 리턴
*/
package component;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JComboBoxEx2 extends JFrame {

	Container c = getContentPane();
	String[] f = { "사과", "바나나", "배", "키위" };
	ImageIcon[] img = { new ImageIcon(".\\IMG\\apple.jpg"), 
						new ImageIcon(".\\IMG\\banana.jpg"),
						new ImageIcon(".\\IMG\\pear.jpg"),
						new ImageIcon(".\\IMG\\kiwi.jpg") };
	JLabel la;

	public JComboBoxEx2() {

		setTitle("ComboBox Listener");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		c.setLayout(new FlowLayout());

		JComboBox<String> strcombo = new JComboBox();
		for (int i = 0; i < f.length; i++) {
			strcombo.addItem(f[i]);
		}
		
		//	리스너 등록
		strcombo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
		
				JComboBox<String> b =(JComboBox)e.getSource();
				
				int index = b.getSelectedIndex();
				la.setIcon(img[index]);
				
			}
		});
		
		
		la = new JLabel();
		la.setSize(150,150);
		
		c.add(strcombo);
		c.add(la);
		
		setSize(300,300);
		setVisible(true);
		

	}

	public static void main(String[] args) {
		new JComboBoxEx2();
	}

}
