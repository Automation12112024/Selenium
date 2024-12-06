package StringPrograme;

public class StringOccurence {
	
	public static void main(String[] args) {
		
		
		
		
		String str="Ganeaash";
	
		
		for(int i=0;i<=str.length()-1;i++)
		{
			int count =0;
			//char c=str.charAt(i);
			
			System.out.println(str.charAt(i));
//			count++;
//			System.out.println("Count of :"+str.charAt(i)+"="+ count);
			
			for(int j=0;j<=str.length()-1;j++)
			{
			
			
				if(str.charAt(i)==str.charAt(j))
					{  
					
					count++;
					
			      }
				
			}
			System.out.println("Count of :"+str.charAt(i)+"="+ count);
			
		}
		
	}

}
