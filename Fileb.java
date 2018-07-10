package day8;
import java.io.*;
public class Fileb 
{
	public static void main(String[] args) throws Exception
	{
		DataInputStream dis=new DataInputStream(System.in);
		FileOutputStream fos=new FileOutputStream("pqr.doc");
		System.out.println("enter the text");
		int ch;
		while((ch=dis.read())!='\n')
		{
			fos.write(ch);
		}
		fos.close();
	}

}
