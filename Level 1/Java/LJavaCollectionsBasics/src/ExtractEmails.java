import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ExtractEmails {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String text = input.nextLine();

		Pattern emailPatter = Pattern.compile("[a-zA-Z]+[.-_]*[a-zA-Z]+@[a-zA-Z]+[-]*[a-zA-Z]+(\\.[a-zA-Z]{2,10})+");
		Matcher matcher = emailPatter.matcher(text);

		while (matcher.find()) {
			System.out.println(matcher.group());
		}

	}

}
