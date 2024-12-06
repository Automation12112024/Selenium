package StringPrograme;

public class PrimeNumber {
	
	
	public static void main(String[] args) {
		
		int count=0;
		
		
		for(int i=2;i<=100;i++)
		{
			if(i==2 || i==3 || i==5 || i==7)
			{
			System.out.println(i+" :number is prime");
			count++;
			}
		
			
			
			
			else if(i%2 !=0 && i%3 != 0 && i%5 !=0 && i%7 !=0)
			{
				
				
				System.out.println(i+" :number is prime");
				count++;
				
				
			}
			
			
	
		}
		
		System.out.println("Total number of prime number:"+count);
		
	}
	


}
