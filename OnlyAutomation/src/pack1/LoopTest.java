package pack1;

public class LoopTest {
	
	public static void main(String[] args) {
		
		int age=80;
		
		if(age<=13)
		{
			
			System.out.println("child");
			
		}
		else if(age>= 13 && age<=19)
		{
			System.out.println("Teenager");
			
		}
		else if(age>= 20 && age<=64)
		{
			System.out.println("Adult");
			
		}
		else if(age>=65)
		{
			System.out.println("Senior Citizen");
			
		}
	}

}