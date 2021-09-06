package abstract_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Today {

	public static void main(String[] args) throws ParseException {

		Date date = new Date();
		System.out.println("오늘날짜 : "+date);
		System.out.println();
		
		SimpleDateFormat sdf = new SimpleDateFormat("y년 MM월 dd일 E요일 HH:mm:ss");
		
		System.out.println("오늘날짜 : "+ sdf.format(date));
		
		
		
		//입력
		SimpleDateFormat input = new SimpleDateFormat("yyyyMMddHHmmSS");
		Date birth = input.parse("19940817112011");  // String -> Date 형변환
		System.out.println("내생일 : "+birth);
		System.out.println("내생일 : "+sdf.format(birth));
		System.out.println();
		
		
		//기준은 시스템 날짜와 시간.
		Calendar cal = new GregorianCalendar();  //Calendar는 추상클래스 그러므로 자식클래스로 호출
		//Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;  // 월은 0부터 시작하기 때문에 항상 +1을 해준다.
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		String dayOfWeek = null;
		switch(week) {
		case 1 : dayOfWeek = "일요일"; break;
		case 2 : dayOfWeek = "월요일"; break;
		case 3 : dayOfWeek = "화요일"; break;
		case 4 : dayOfWeek = "수요일"; break;
		case 5 : dayOfWeek = "목요일"; break;
		case 6 : dayOfWeek = "금요일"; break;
		case 7 : dayOfWeek = "토요일"; break;
		}
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.printf("오늘 날짜 : %d년 %d월 %d일 %s %d시 %d분 %d초\n",year,month,day,dayOfWeek,hour,minute,second);
		
		
		
		
	}//end

}
