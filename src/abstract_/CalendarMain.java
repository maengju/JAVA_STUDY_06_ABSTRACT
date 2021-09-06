/*
 만년달력
 -년도와 월을 입력하여 달력을 출력하시오
 -매월 시작하는 요일을 구해야 됨. = 메소드
 -매월 끝나는 일(30,28,29,31) = 메소드
 -클래스 : CalendarTest
  필드 : year,month, week, lastDay
  생성자 : 년과 월을 입력받기
  메소드 : calc()
  		display()
  		
 
 [실행결과]
 년도 입력 : 2002
 월 입력 : 10
 
 일	월	화	수	목	금	토
 		1	2	3	4	5
 
 */

package abstract_;

import java.util.Calendar;
import java.util.Scanner;

class CalendarTest{
	Scanner scan = new Scanner(System.in);
	int year,month,week,lastDay;
	
	
	public CalendarTest() {
		System.out.print("년도 입력 : ");
		this.year = scan.nextInt();
		System.out.print("월 입력 : ");
		this.month = scan.nextInt();
		
	}//생성자
	
	public void calc() {
		Calendar day = Calendar.getInstance(); //기준 시스템 날짜와 시간
		day.set(year, month-1,1); // 1월을 0으로 생각 하기때문에 month -1 을해줘야 해당 월을 가져온다.
		this.lastDay = day.getActualMaximum(day.DAY_OF_MONTH); //28,29,30,31
		this.week = day.get(day.DAY_OF_WEEK); // 요일을 가져온다.
	}//calc
	
	public void display() {
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		int day = 1;
		switch(week) {
			case 7: System.out.print(" \t");
			case 6: System.out.print(" \t");
			case 5: System.out.print(" \t");
			case 4: System.out.print(" \t");
			case 3: System.out.print(" \t");
			case 2: System.out.print(" \t");	
		}
		
		int startDay = week;
		for(int i = 1; i<=lastDay; i++) {
			System.out.print(i+"\t");
			if(startDay%7==0) {
				System.out.println();
			}
			startDay++;
		}
	
	
	}//disp
	
	
	
	
}//class end






//======================================================================
public class CalendarMain {

	public static void main(String[] args) {
		CalendarTest clt = new CalendarTest();
		
		clt.calc();
		clt.display();

	}

}
