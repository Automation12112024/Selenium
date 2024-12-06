package pack1;

public class ContructorTest {
	
	int a=10;
	int b=20;
	int c=30;
	

public static void main(String[] args)
{
	
	int a=10;
	int b=20;
	int c=30;
	
	System.out.println(a+" "+b+" "+c);
	
	ContructorTest con = new ContructorTest();
	ContructorTest pcon = new ContructorTest(10);
	ContructorTest pcon2 = new ContructorTest(20,'A');
	}



ContructorTest()
{
	System.out.println("non paramerterised constructor is executedddddddddddddddddddddd");

}

ContructorTest(int value)
{
	
	System.out.println("paramerterised constructor is executed:"+ value);
}

ContructorTest(int value, char value2)
{
	System.out.println("paramerterised constructor is executed value 1: "+ value +" | value2: "+ value2);
}



}


