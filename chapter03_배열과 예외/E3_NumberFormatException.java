/*
정수가 아닌 문자열을 정수로 변환할때...
실수가 아닌 문자열을 실수로 변환할때...

	. 정수문자-->정수	:	Integer.parseInt("숫자문자")
	. 실수문자-->실수	:	Float.parseInt("실수문자")
	 					Double.parseInt("실수문자")
	. 정수문자-->문자	:	Integer.toString(정수문자)
	. 실수문자-->문자	:	Float.toString(실수문자)				
*/
package c2_Exception;

public class E3_NumberFormatException {

	public static void main(String[] args) {

		// 문자열을 저장하는 strNum이라는 배열을 생성
		String[] strNum = { "23", "12", "998", "3.141592" };

		try {

			for (int i = 0; i < strNum.length; i++) {

				// 배열에 있는 문자를 정수타입으로 변환해서 j방에다가 저장
				int j = Integer.parseInt(strNum[i]);
				System.out.println("숫자로 변환된 값은 : " + j);

			}

		} catch (NumberFormatException e) {
			
			System.out.println("배열 안에 실수가 존재합니다. ");
		
		}

	}

}
