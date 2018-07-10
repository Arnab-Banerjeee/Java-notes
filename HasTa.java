package day7;
import java.util.*;
public class HasTa 
{
	public static void main(String[] args)
	{
		HashMap<Integer,String> ht=new HashMap<Integer,String>();
		ht.put(102, "sandip");
		ht.put(105, "Anmol");
		ht.put(104, "Rishab");
		ht.put(103, "Aditya");
		ht.put(101, "Thakur");
		System.out.println(ht);
		ht.remove(103);
		System.out.println(ht);
	}

}
