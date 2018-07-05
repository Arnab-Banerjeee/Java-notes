package day5;

class a3 implements Runnable 
{
  synchronized public void run()
  {
	  try
	  {
		  Thread t=Thread.currentThread();
		  String name=t.getName();
		  for(int i=0;i<11;i++)
		  {
			  System.out.println("n= "+name+"i= "+i);
			  Thread.sleep(500);
		  }
	  }catch(Exception e){}
  }
}
class Bik
{
	public static void main(String args[]) throws Exception
	{
		a3 ob=new a3();
		Thread t1=new Thread(ob,"1st Bike");
		Thread t2=new Thread(ob,"2nd Bike");
		Thread t3=new Thread(ob,"3rd Bike");
		t1.start();
		t2.start();
		t3.start();
	}
}