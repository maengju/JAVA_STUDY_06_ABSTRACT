/*
 ����޷�
 -�⵵�� ���� �Է��Ͽ� �޷��� ����Ͻÿ�
 -�ſ� �����ϴ� ������ ���ؾ� ��. = �޼ҵ�
 -�ſ� ������ ��(30,28,29,31) = �޼ҵ�
 -Ŭ���� : CalendarTest
  �ʵ� : year,month, week, lastDay
  ������ : ��� ���� �Է¹ޱ�
  �޼ҵ� : calc()
  		display()
  		
 
 [������]
 �⵵ �Է� : 2002
 �� �Է� : 10
 
 ��	��	ȭ	��	��	��	��
 		1	2	3	4	5
 
 */

package abstract_;

import java.util.Calendar;
import java.util.Scanner;

class CalendarTest{
	Scanner scan = new Scanner(System.in);
	int year,month,week,lastDay;
	
	
	public CalendarTest() {
		System.out.print("�⵵ �Է� : ");
		this.year = scan.nextInt();
		System.out.print("�� �Է� : ");
		this.month = scan.nextInt();
		
	}//������
	
	public void calc() {
		Calendar day = Calendar.getInstance(); //���� �ý��� ��¥�� �ð�
		day.set(year, month-1,1); // 1���� 0���� ���� �ϱ⶧���� month -1 ������� �ش� ���� �����´�.
		this.lastDay = day.getActualMaximum(day.DAY_OF_MONTH); //28,29,30,31
		this.week = day.get(day.DAY_OF_WEEK); // ������ �����´�.
	}//calc
	
	public void display() {
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
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
