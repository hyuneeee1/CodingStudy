import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {	
public static void main(String[] args) {
				
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
		Date date = new Date();
		String now = sdf.format(date);
		
		System.out.println(now);
				
			}
    }