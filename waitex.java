package day5;

class waitex implements Runnable
{
	synchronized public void run()
	{
		try
		{
			Thread t=Thread.currentThread();
			String name=t.getName();
			for(int i=0;i<10;i++)
			{
				System.out.println(name+"="+i);
				Thread.sleep(500);
				if(name.equals("raj")&&(i==4))
				{
					wait();
				}
				if(name.equals("geeta")&&(i==4))
				{
					wait();
				}
				if(name.equals("seeta")&&(i==6))
				{
					System.out.println("raj and geeta woke up");
					notifyAll();
				}
				if(name.equals("raj")&&(i==9))
				{
					notify();
				}
			}
		}catch(Exception e){}
	}
	public static void main(String args[]) throws Exception
	{
		waitex ob = new waitex();
		Thread t1=new Thread(ob,"raj");
		Thread t2=new Thread(ob,"seeta");
		Thread t3=new Thread (ob,"geeta");
		t1.start();
		t2.start();
		t3.start();
	}

}
