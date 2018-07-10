package day7;
import java.util.*;
public class Mapex2 
{
	public static void main(String[] args)
	{
		int s = 5;
		Map map=new HashMap();
		map.put(1, "Amit");
		map.put(s, "Rahul");
		map.put(2, "Jail");
		map.put(6, "Anmol");
		Set set=map.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			Map.Entry entry=(Map.Entry)itr.next();
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
	}

}
