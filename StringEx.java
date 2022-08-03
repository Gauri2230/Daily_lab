class StringEx
{
	public static void main(String[] args)
	{
		String a="Hello";          //literal
		String b="Hello";
		String c=new String("Hello");        //object
		String d=new String("Hello");
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(a==d);
		System.out.println(c.equals(b));
		System.out.println(c.equals(d));
		System.out.println(b.equals(d));
	}
}