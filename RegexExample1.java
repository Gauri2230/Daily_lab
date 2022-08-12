import java.util.regex.*;
import java.util.*;
public class RegexExample1 
{
 	public static void main( String args[] ) 
	{
      		String regex = "[aeiouAEIOU]";
      		System.out.println("Enter input string: ");
      		Scanner sc = new Scanner(System.in);
      		String input = sc.nextLine();
      		Pattern pattern = Pattern.compile(regex);
      		Matcher matcher = pattern.matcher(input);

      		if(matcher.find()) 
		{
      			System.out.println("The input string contains vowels");
      		} 
		else 
		{
		            System.out.println("The input string does not contain vowels");
      		}
   	}
}