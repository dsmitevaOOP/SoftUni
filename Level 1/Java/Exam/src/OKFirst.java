import java.sql.Date;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class OKFirst {

	public static void main(String[] args) throws ParseException {
		
		Scanner input = new Scanner(System.in);
		String next = "";
		SimpleDateFormat format = new SimpleDateFormat("HH:mm");
		int hour = 0;
		int min = 0;
		int temp = 0;
		int sumH = 0;
		int sumM = 0;
		Calendar calendar = GregorianCalendar.getInstance(); // creates a new calendar instance
		
		while (!next.equals("End")) {
			next = input.nextLine();
			if (!next.equals("End")) {
				java.util.Date date = format.parse(next);
				calendar.setTime(date); 
				hour = date.getHours();
				min = date.getMinutes();
				sumH = sumH + hour;
				sumM = sumM + min;
			}
			
		}
		
		temp = sumM / 60;
		sumH = sumH + temp;
		sumM = sumM % 60;
		if (sumM < 10 ){
			System.out.println(sumH + ":0" + sumM);
		}
		else {
			System.out.println(sumH + ":" + sumM);
		}

	}

}
