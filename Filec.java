package day8;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;
public class Filec 
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fis=new FileInputStream("Penguins.jpg");
		FileOutputStream fos=new FileOutputStream("demo2.jpg");
		int ch;
		while((ch=fis.read())!=-1)
		{
			fos.write(ch);
		}
		fis.close();
		fos.close();
		System.out.println("File copied");
	}

}
