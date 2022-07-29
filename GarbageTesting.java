public class GarbageTesting
{
	public void finalize()
	{
		System.out.println("objected collected by garbage collector");
	}
	public static void main(String args[])
	{
		GarbageTesting s1=new GarbageTesting();
		GarbageTesting s2=new GarbageTesting();
		s1=null;
		s2=null;
		System.gc();
	}
}