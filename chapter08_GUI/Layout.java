/*
	* 배치 관리자란?
		* 컨테이너 속의 컴포넌트들을 크기과 위치를 결정해주는 역할을 한다.
		* 컨테이너 크기가 변경되면 컨테이너 내부의 모든 컴포넌트들의 위치과 크기를 재조정한다.
		* 컨테이너당 1개의 배피관리자를 꼭 갖는다.
		
		* 종류와 특성
			* Flow Layout	:	왼쪽에서 오른쪽으로 배치, 컴포넌트의 위치와 크기 설정 가능
			* Border Layout	:	동,서,남,북,중앙으로 구분하여배치, 컴포넌트 크기 설정 불가, 기본 레이아웃
			* Grid Layout	:	2차원의 평면구조로 왼쪽에서 오른쪽으로 배치하다가 아래쪽으로 순서대로 배치시킴, 
								컴포넌트 크기 설정 불가
			* Card Layout	:	카드를 쌓아놓듯이 앞에서 뒤로 겹쳐서 뒤로 배치, 컴포넌트 크기 설정 불가
		
		* 레이아웃의 디폴드 배치관리자
			* JFrame	-	BorderLayout
			* JPanel	-	FlowLayout
		
		* FLowLayout
			* FlowLayout(정렬방식 : 중앙 기본, 옆간격 : 픽셀단위(기본 5), 위아래간격)
			* FlowLayout.LEFT/RIGHT/CENTER(DEFAULT)
	
		* BorderLayout
			 			North
			  West		Center		East
			 			South
			* add()활용시 반드시 위치를 명기해 주어야 한다.
			* 생성자	:	BorderLayout(int hGap, int vGap) // 디폴트 0
		
		* GridLayout
			* 컨테이너 공간을 각자 사각형의 격자모양으로 분할한다.
			* 각 셀에는 오직 하나의 컴포넌트를 배치한다.
			* 셀보다 많은 컴포넌트가 추가되면 행, 수가 지켜지지않고 적당히 변경된다.
			* FlowLayout과 크게 다르지 않다.
			* 생성자	:	GridLayout(int row, int cols, int hGap, int vGap)
						GridLayout(int row, int cols) gap=0
						GridLayout()
						
		* 배치 관리자가 없는 컨테이너
			* 개발자가 임의의 크기나 위치에 설정하고 싶을때
			* 위치와 크기가 수시로 변할때	/ 변하게 하고 싶을때
			* 겹치는 효과를 연출하고싶을때
			* 메소드
				* setSize(width x, heihgt y)
				* setLocation
				* set
*/

package GUI_Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layout extends JFrame {
	
	public Layout() {
		
		setTitle("FlowLayout 1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//완전 실행종료시
		
		Container contentPane = getContentPane();
		
//		FlowLayout f = new FlowLayout();
		FlowLayout f = new FlowLayout(FlowLayout.RIGHT, 50, 50);
		contentPane.setLayout(f);
		
		contentPane.setBackground(Color.PINK);
		JButton btn1 = new JButton("add");
		contentPane.add(btn1);
		contentPane.add(new JButton("sub"));
		contentPane.add(new JButton("mul"));
		contentPane.add(new JButton("div"));
		contentPane.add(new JButton("Calculator"));
		
		
		
		
		
		setSize(300, 300);
		setVisible(true);
		
	
	}
	
	
	
	public static void main(String[] args) {
		
		
		Layout l = new Layout();
		
		
		
	}
	
	

}
