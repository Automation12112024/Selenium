package pack1;

public class GradeTest {
	
	public static void main(String[] args) {
		int grade=55;
		
		if(grade>=90) 
		{
			
			System.out.println("A");
		}
		else if(grade>=80 && grade<=89)
		{
			
			System.out.println("B");
		}
		
		else if(grade>=70 && grade<=79)
		{
			
			System.out.println("C");
		}
		else if(grade>=60 && grade<=69)
		{
			
			System.out.println("D");
		}
		
		else if(grade<60)
		{
			
			System.out.println("F");
			System.out.println("F");
		}
		
		
	}

}
