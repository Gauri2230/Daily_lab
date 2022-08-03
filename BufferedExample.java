import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
class BufferedExample
{
	public static void main(String[] args) throws IOException
{
            FileWriter fw=new FileWriter("hello.txt");
	System.out.println("Created Hello File Sucessfully....");
            BufferedWriter bw=new BufferedWriter(fw);
            bw.write("HELLO GOOD EVENING");	
            bw.close();
	FileReader fr = new FileReader("hello.txt");
            BufferedReader br=new BufferedReader(fr);		
            int i;
	while((i=br.read()) >0)
	{	
		 System.out.print((char)i);
	}
	 fw.close();	
}
}