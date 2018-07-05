package day3;

public class encap 
{
	public static void main(String[] args)
	{
		variabletest ob= new variabletest();
		ob.setEmpno(101);
		ob.setEmpname("Anmol");
		ob.setAddress("Pune");
		ob.setSal(4500.50f);
		System.out.println("Empno is "+ob.getEmpno());
		System.out.println("Empname is "+ob.getEmpname());
		System.out.println("Empaddress is "+ob.getAddress());
		System.out.println("Empsal is "+ob.getSal());
	}

}
