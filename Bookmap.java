package day7;
import java.util.*;
public class Bookmap 
{
	public static void main(String[] args)
	{
	Map<Integer,book> map=new HashMap<Integer,book>();
	
	book b1=new book(1,"That Kiss in The Rain","Anirban Chakrabarty","BBW",1);
	book b2=new book(2,"Buffy the Vampire Slayer","Many","BBW",1);
	book b3=new book(3,"Sherlock Holmes","Sir Arthur Conan Doyle","Bantam Classics",1);
	book b4=new book(4,"The Nine Unknown","Don't Remember","BBW",1);
	
	map.put(1,b1);
	map.put(2,b2);
	map.put(3,b3);
	map.put(4,b4);
	
	for(Map.Entry<Integer,book>entry:map.entrySet())
	{
		int key=entry.getKey();
		book b=entry.getValue();
		System.out.println(key+" Details: ");
		System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
	}
	}
}
