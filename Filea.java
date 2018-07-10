package day8;
import java.util.*;
import java.io.*;
public class Filea 
{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the file name");
		String fname=ob.nextLine();
		File f=new File(fname);
		System.out.println("file name: "+f.getName());
		System.out.println("file path: "+f.getPath());
		System.out.println("file absolute path: "+f.getAbsolutePath());
		System.out.println("file parent: "+f.getParent());
		System.out.println("does file exist: "+f.exists());
		if(f.exists())
		{
			System.out.println("is Writable: "+f.canWrite());
			System.out.println("is Readable: "+f.canRead());
			System.out.println("If has directory: "+f.isDirectory());
			System.out.println("length of file: "+f.length());
		}
		
	}

}
