package component;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class JListEx2 extends JFrame {
	
	public JListEx2() {
	
		setTitle("Image List");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		String [] fruits = {"Apple", "Banana", "Mango", "WaterMelon", "Melon", "Orange", "Pear", "Strawberry", "Grape"
		};
		
		ImageIcon [] img = {new ImageIcon(".\\IMG\\banana.jpg"), 
				new ImageIcon(".\\IMG\\kiwi.jpg"),
				new ImageIcon(".\\IMG\\pear.jpg"), 
				new ImageIcon(".\\IMG\\chery.jpg"), 
				new ImageIcon(".\\IMG\\cheryCheck.jpg")};
		
		JList<ImageIcon> imgList = new JList<>(img);
//		imgList.setListData(img);
		
		JScrollPane scroll = new JScrollPane(imgList);
		c.add(scroll);
		
		
		//String List 생성
		JList<String> textList = new JList<String>(fruits);
		JScrollPane sc = new JScrollPane();
		c.add(textList);
		
		
		
		
		
		
		
		
		
		setSize(500,500);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new JListEx2();
	}
}
