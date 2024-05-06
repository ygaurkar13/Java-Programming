class Exam{
	public static void main(String ...args)throws InterruptedException{
		try{
			
			Thread.sleep(1000);
			System.out.println("Inside Try 1");
			Thread.sleep(2000);
			System.out.println("Inside Try 2");
			System.out.println(args[0]);
			System.out.println(args[1]);

		}
		
		catch(InterruptedException m){
			System.out.println("Inside InterruptedException ");
		}
		catch(ArrayIndexOutOfBoundsException n){
			System.out.println("Inside ArrayIndexOutOfBoundsException");
		}
		
		catch(Exception e){
			System.out.println("Inside Exception");
		}
		
		finally{
			System.out.println("Inside Finally");
		}
	} 
}
