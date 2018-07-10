package day7;
import java.util.*;
public class MapIntex 
{
	public static void main(String[] args)
	{
		Map<Integer,String> ma=new Hashtable<Integer,String>();
		ma.put(100, "Amit");
		ma.put(101, "Vijay");
		ma.put(102, "Rahul");
		for(Map.Entry m:ma.entrySet())
		{
			System.out.println(m.getKey()+"  "+m.getValue());
		}
		
	}

}
//Entry is the sub interface of map.
//Map.Entry name- It provides methods to get key and value
//entrySet()=used to return the set view containing all key and value