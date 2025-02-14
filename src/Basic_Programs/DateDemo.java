package Basic_Programs;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateDemo {

	public static void main(String[] args) {
		
		Date d=new Date();
		System.out.println(d.toString());
		SimpleDateFormat sdf=new SimpleDateFormat("M/D/YYY");
		System.out.println(sdf.format(d));
		SimpleDateFormat sdf1=new SimpleDateFormat("M/D/YYY hh:mm:ss");
		System.out.println(sdf1.format(d));
		
	}
	
}
