package day8;
import java.io.*;
public class Filed 
{
	public static void main(String[] args) throws Exception
	{
		FileReader fr=new FileReader("Anmol1.txt");
		BufferedReader br=new BufferedReader(fr);
		String name;
		while((name=br.readLine())!=null)
		{
			System.out.println(name);
		}
		fr.close();
		br.close();
		System.out.println("file copied");
		
	}

}
