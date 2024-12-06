package pack1;

public class StaticDemo {
	int  a=10;
	static int b=20;
	
	public static void main(String[] args) {
		StaticDemo s= new StaticDemo();
		
	s.meth1();
	StaticDemo.meth2();
	}
	
	
	public void meth1()
	{
		 int c=20;
		System.out.println(b);
		System.out.println(c);
		
	}
	
	static public void meth2()
	{
		
		int c=40;
		System.out.println(b);
		System.out.println(c);
		
	}
	
	

}
