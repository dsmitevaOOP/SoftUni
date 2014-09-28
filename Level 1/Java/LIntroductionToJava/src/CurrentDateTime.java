import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class CurrentDateTime {

	public static void main(String[] args) {
		DateFormat dateFormat = new SimpleDateFormat("dd MMMM, yyyy HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));

	}

}
