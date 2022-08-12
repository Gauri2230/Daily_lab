import java.util.regex.*;
import java.util.*;
public class RegexExample2 
{
 	public static void main( String args[] ) 
	{	
		String r="^[a-zA-Z0-9]*$";
		
      		System.out.println("Enter input string: ");
      		Scanner sc = new Scanner(System.in);
      		String input = sc.nextLine();

      		Pattern p = Pattern.compile(r);
      		Matcher m= p.matcher(input);
		boolean b = m.matches();

		System.out.println(b);
   	}
}

