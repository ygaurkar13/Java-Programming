public class Demo{
	public static void main(String[] args){
		int i=0;
		int n=3;
		try{
			
			int j=18/i;	
		}
		catch(Exception e){
			System.out.println("Cannot divide by zero!");	
		}
		try{
			int m =9/n;
		}
		finally{
			System.out.println("Finally :BYE");
		}	
		
	}
}
