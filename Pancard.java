import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pancard {

	public static void main(String[] args) {

		String input = "fghd356AHJKIU2675K@#$5sjhsakj267";

		String regex="[A-Z]{5}[0-9]{4}[A-Z]";
		
		Pattern pat=Pattern.compile(regex);
		Matcher match=pat.matcher(input);
		
		if(match.find())
		{
			System.out.println("pan number    "+match.group());
		}	
		else
			{
			System.out.println("no pan number");
			}
		}

}
