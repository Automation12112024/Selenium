package pack1;

public class RecursionClass {
	
	int i=1;
	
	public static void main(String[] args) {
	
		RecursionClass rec= new RecursionClass();
		rec.meth();
	}
	
	public void meth() {
		
		
	
		if(i<=10)
		{
		
		System.out.println(i);
		i++;
		meth();
	
		}
		
	}
	
	

	
	
	

}
