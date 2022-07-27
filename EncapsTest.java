class Encaps
{
	private long Aadhar;
	private String EmpName;
	private int EmpAge;
	public long getEmpAadhar()
	{
		return Aadhar;
	}
	public String getEmpName()
	{
		return EmpName;
	}
		public int getEmpAge()
	{
		return EmpAge;
	}
	public void setEmpAge(int newValue)
	{
		EmpAge = newValue;
	}
	public void setEmpName(String newValue)
	{
		EmpName = newValue;
	}
	public void setEmpAadhar(long newValue)
	{
		Aadhar = newValue;
	}
}
public class EncapsTest
{
	public static void main(String args[])
	{
		Encaps obj = new Encaps ();	
		obj.setEmpName("Ramu");
		obj.setEmpAge(26);
		obj.setEmpAadhar(122212221222L);
		Encaps obj1 = new Encaps();	
		obj1.setEmpName("Ganesh");
		obj1.setEmpAge(22);
		obj1.setEmpAadhar(444444444444L);
		System.out.println("Employee Name: " + obj.getEmpName());
		System.out.println("Employee Aadhar: " + obj.getEmpAadhar());
		System.out.println("Employee Age: " + obj.getEmpAge());
		System.out.println("Employee Name: " + obj1.getEmpName());
		System.out.println("Employee Aadhar: " + obj1.getEmpAadhar());
		System.out.println("Employee Age: " + obj1.getEmpAge());
	}
}