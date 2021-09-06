package abstract_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Today {

	public static void main(String[] args) throws ParseException {

		Date date = new Date();
		System.out.println("���ó�¥ : "+date);
		System.out.println();
		
		SimpleDateFormat sdf = new SimpleDateFormat("y�� MM�� dd�� E���� HH:mm:ss");
		
		System.out.println("���ó�¥ : "+ sdf.format(date));
		
		
		
		//�Է�
		SimpleDateFormat input = new SimpleDateFormat("yyyyMMddHHmmSS");
		Date birth = input.parse("19940817112011");  // String -> Date ����ȯ
		System.out.println("������ : "+birth);
		System.out.println("������ : "+sdf.format(birth));
		System.out.println();
		
		
		//������ �ý��� ��¥�� �ð�.
		Calendar cal = new GregorianCalendar();  //Calendar�� �߻�Ŭ���� �׷��Ƿ� �ڽ�Ŭ������ ȣ��
		//Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;  // ���� 0���� �����ϱ� ������ �׻� +1�� ���ش�.
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		String dayOfWeek = null;
		switch(week) {
		case 1 : dayOfWeek = "�Ͽ���"; break;
		case 2 : dayOfWeek = "������"; break;
		case 3 : dayOfWeek = "ȭ����"; break;
		case 4 : dayOfWeek = "������"; break;
		case 5 : dayOfWeek = "�����"; break;
		case 6 : dayOfWeek = "�ݿ���"; break;
		case 7 : dayOfWeek = "�����"; break;
		}
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.printf("���� ��¥ : %d�� %d�� %d�� %s %d�� %d�� %d��\n",year,month,day,dayOfWeek,hour,minute,second);
		
		
		
		
	}//end

}
