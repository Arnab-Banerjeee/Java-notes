package day5;



	class second extends Thread
	{
		public void run()
		{
			try
			{
				for(int i=1;i<=10;i++)
				{
					System.out.println(i);
					//sleep(1000);
				}
			}catch (Exception ae){}
		}
	}
	class third extends Thread
	{
		public void run()
		{
			try
			{
				for(int i=0;i<=10;i++)
				{
					System.out.println(i);
					//sleep(1000);
				}
			}catch(Exception ae){}
		}
	}


class Tex
{
	public static void main(String[] args)
	{
		second ob=new second();
		second ob1=new second();
		third ob2=new third();
		ob.start();
		ob1.start();
		ob2.start();
	}
}
