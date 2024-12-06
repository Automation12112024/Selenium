package StringPrograme;

public class ReverseString {
	
	public static void main(String[] args) {
		
		
		String name ="Ganesh Kadam";
		String rev="";
		String rev1=" ";
		String[] str=name.split(" ");
	
	
		
	
		
	
		for (int i= str[0].length()-1;i>=0;i--)
		{
			
		rev= rev + str[0].charAt(i);
		}
		
		System.out.print(rev);
	
		
		for (int i= str[1].length()-1;i>=0;i--)
		{
			
		rev1= rev1 + str[1].charAt(i);
		}
		
		
		
		
		
		System.out.print(rev1);
		
		
		
	}

}
