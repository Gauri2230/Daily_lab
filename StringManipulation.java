import java.util.Scanner;
public class StringManipulation
{
	public static void main(String args[]) 
	{	
		boolean b1=true;  
        		byte b2=11;    
       		short sh = 12;  
      		int i = 13;  
        		long l = 14L;  
        		float f = 15.5f;  
        		double d = 16.5d;  
        		char chr[]={'j','a','v','a'}; 
		String g1 ="Gauri";
		String g2 ="GAURI";
		String g3 ="IRUAG";
		String g4 ="good bye!!";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String:");
		String s = sc.nextLine();
		char result = s.charAt(4);
		System.out.println(result);
		String sLower =s.toLowerCase();
		System.out.println(sLower);
		String sUpper =s.toUpperCase();
		System.out.println(sUpper);
		int size = s.length();  
		System.out.println(size);
		System.out.println(s.substring(2,5));
		System.out.println(s.concat(" Good evening!!"));
		System.out.println(s.replace('i','a'));
		System.out.println(s.indexOf('u'));
		String s1 = String.valueOf(b1);    
       		String s2 = String.valueOf(b2);    
        		String s3 = String.valueOf(sh);    
        		String s4 = String.valueOf(i);    
        		String s5 = String.valueOf(l);    
        		String s6 = String.valueOf(f);    
        		String s7 = String.valueOf(d);    
        		String s8 = String.valueOf(chr);    
		System.out.println(s1);  
        		System.out.println(s2);  
        		System.out.println(s3);  
        		System.out.println(s4);  
        		System.out.println(s5);  
        		System.out.println(s6);  
        		System.out.println(s7);  
        		System.out.println(s8); 
		System.out.println(s.trim()); 
		System.out.println(g1.equalsIgnoreCase(g2));
		System.out.println(g1.equalsIgnoreCase(g3));
		System.out.println(g2.equalsIgnoreCase(g3));
		System.out.println(g4.contains("bye"));
	}
}
