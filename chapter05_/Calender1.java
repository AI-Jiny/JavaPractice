/*
	<<Calender Class>>
		
		* static멤버, 메소드들로 구성되어있다.
		* 컴퓨터의 시간을 가져와서 설정한다.

*/

package Calender;

import java.util.Calendar;

import javax.xml.transform.sax.SAXTransformerFactory;

public class Calender1 {

	public static void printCalender(String msg, Calendar cal) {

		Calendar now = Calendar.getInstance();

		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK);
		int hour = now.get(Calendar.HOUR);
		int hourOfDay = now.get(Calendar.HOUR_OF_DAY);
		int ampm = now.get(Calendar.AM_PM);
		int min = now.get(Calendar.MINUTE);
		int sec = now.get(Calendar.SECOND);
		int mill = now.get(Calendar.MILLISECOND);

		System.out.println(msg + "/" + month + "/" + day + "/");

		switch (week) {
		case Calendar.SUNDAY:
			System.out.println("일요일");
			break;
		case Calendar.MONDAY:
			System.out.println("월요일");
			break;
		case Calendar.TUESDAY:
			System.out.println("화요일");
			break;
		case Calendar.WEDNESDAY:
			System.out.println("수요일");
			break;
		case Calendar.THURSDAY:
			System.out.println("목요일");
			break;
		case Calendar.FRIDAY:
			System.out.println("금요일");
			break;
		case Calendar.SATURDAY:
			System.out.println("토요일");
			break;
		}

		if (ampm == Calendar.AM) {
			System.out.println("오전");
		} else {
			System.out.println("오후");
		}
		System.out.println(hour + "시" + min + "분" + sec + "초" + mill + "밀리초 입니다");
	}

	public static void main(String[] args) {

		Calendar now = Calendar.getInstance();
		printCalender("지금 시각은...", now);

		Calendar dateTime = Calendar.getInstance();
		dateTime.clear();

		dateTime.set(2020, 8, 30);
		dateTime.set(Calendar.HOUR_OF_DAY, 20);
		dateTime.set(Calendar.MINUTE, 30);

		printCalender("데이트 약속시간", dateTime);

	}

}
