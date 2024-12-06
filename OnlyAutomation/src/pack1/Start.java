package pack1;



public class Start {
	
	
	public static void main(String[] args) {
		Start s1=new Start();
		System.out.println("Pattern 1 :");
		s1.pattern1();
		
		System.out.println("===================================================================");
		
		System.out.println("Pattern 2 :");
		s1.pattern2();

		
	}
	
	
	public void pattern1()
	{
		
		for(int i=0;i<=5;i++)
		{
			
			for (int j=5;j>=i;j--)
				
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		
}
	
	public void pattern2()
	{
		
		for(int a=0;a<=5;a++)	
		{
			for (int b=0;b<=a;b++)
				
			{
				
				System.out.print("*");
			}
			System.out.println("");
			
		}
			}
	

}
