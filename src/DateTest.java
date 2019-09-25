import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



public class DateTest {
	public static final DateFormat DATE_FORMAT2 = new SimpleDateFormat("yyyy-MMM-dd hh:mm:ss");
	public static void main(String[] args) {
				
		Date d = new Date();
		
		String da = formatDate(d, DATE_FORMAT2);
		
		System.out.println(da);
	}
	
	public static String formatDate(Date inputDate, DateFormat format){
		String formatedDate = format.format(inputDate);
		return formatedDate;
	}
}
