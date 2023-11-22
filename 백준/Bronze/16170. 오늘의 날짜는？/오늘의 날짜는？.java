import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
				
				SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
				
				LocalDateTime datetime = LocalDateTime.now(ZoneId.of("UTC"));
				
				System.out.println(datetime.getYear());
				System.out.println(datetime.getMonthValue());
				System.out.println(datetime.getDayOfMonth());
				
			}
}