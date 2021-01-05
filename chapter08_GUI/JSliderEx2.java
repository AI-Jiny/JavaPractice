package component;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSliderEx2 extends JFrame {

	Container c;
	JSlider[] colorSlider = new JSlider[3];
	JLabel colorLabel;

	public JSliderEx2() {

		setTitle("Making Color");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		c = getContentPane();
		c.setLayout(new FlowLayout());
		

		for (int i = 0; i < colorSlider.length; i++) {
			colorSlider[i] = new JSlider(0, 255, 0);
			colorSlider[i].setPaintTrack(true);
			colorSlider[i].setPaintTicks(true);
			colorSlider[i].setMinorTickSpacing(5);
			colorSlider[i].setMajorTickSpacing(50);
			colorSlider[i].setPaintLabels(true);

			colorSlider[i].addChangeListener(new ChangeListener() {

				@Override
				public void stateChanged(ChangeEvent e) {

					int r = colorSlider[0].getValue();
					int g = colorSlider[1].getValue();
					int b = colorSlider[2].getValue();

					colorLabel.setText("Red : " + r + ", Green : " + g + ", Blue : " + b);
					colorLabel.setBackground(new Color(r, g, b));

				}
			});
			
			c.add(colorSlider[i]);
		}

		colorLabel = new JLabel(new ImageIcon(".\\IMG\\home.png"), SwingConstants.CENTER);
		colorLabel.setSize(300,300);
		colorLabel.setOpaque(true);
		
		colorSlider[0].setForeground(Color.RED);
		colorSlider[0].setBackground(Color.WHITE);
		colorSlider[1].setForeground(Color.GREEN);
		colorSlider[1].setBackground(Color.WHITE);
		colorSlider[2].setForeground(Color.BLUE);
		colorSlider[2].setBackground(Color.WHITE);
		
		c.add(colorLabel);
		
		setSize(250, 300);
		setVisible(true);

	}

	public static void main(String[] args) {
		new JSliderEx2();
	}

}
