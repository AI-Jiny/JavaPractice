/*
		JSlider
			* 슬라이드 바를 출력하여 마우스로 값을 선택하도록 하는 컴포넌트
			* 이벤트 : changeEvent
			* 종류(Orientation) : JSlider.HORIZONTAL, JSlider.VERTICAL
			* 구성
				* knob
				* MajorTickSpacing
				* MinorTIckSpacing
				* label
				* track
				* value
			* 메소드
				* setOrientation()	:	방향설정
				* setMinimum()/Maximum()
				* setPaintTick(t/f)	
				* setPaintTrack(t/f)
				* setPaintLabels(t/f)
				* setMajorTickSpacing()
				* setMinorTickSpacing()
				* setValue()
				* getValue()

*/
package component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class JSliderEx1 extends JFrame {

	public JSliderEx1() {

		setTitle("Slide Component");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		//1. 슬라이드를 붙일 판넬
		SliderPane sp = new SliderPane();
		
		
		//2. 기본 슬라이드
		JSlider s1 = new JSlider(0,100,50);//최소, 최대, 간격
		s1.setPaintTrack(true);
		s1.setBackground(Color.MAGENTA);
		sp.add(s1);
		
		//3. min, max, value 지정 슬라이드
		JSlider s2 = new JSlider(0,100,50);
		s2.setOrientation(JSlider.VERTICAL);
		s2.setPaintTrack(true);
		s2.setPaintTicks(true);
		s2.setMajorTickSpacing(10);
		s2.setMinorTickSpacing(5);
		s2.setPaintLabels(true);
		
		//4. 수평
		JSlider s3 = new JSlider(JSlider.HORIZONTAL,0,100,50);
		s3.setPaintTicks(true);
		s3.setMajorTickSpacing(20);
		s3.setPaintLabels(true);
		
		
		
		c.add(s2, BorderLayout.CENTER);
		c.add(sp, BorderLayout.NORTH);
		c.add(s3, BorderLayout.SOUTH);
		
		setSize(700,700);
		setVisible(true);
		
	}
	
	class SliderPane extends JPanel{
		
		public SliderPane() {
		
			setBackground(Color.pink);

		}
		
	}

	public static void main(String[] args) {
		new JSliderEx1();
	}

}
