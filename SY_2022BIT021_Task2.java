public class SY_2022BIT021_Task2{
	public static void main(String[] args){
	Character B[]={'2','0','2','2','B','I','T','0','2','1'};
	boolean result=verifyRegistrationNumber(B);
	System.out.println(result);
	}
	
	static boolean verifyRegistrationNumber(Character[] args){
		for(int i=0;i<=args.length;i++){
		if(i<=3||i>=7 && i<args.length){
			boolean a=Character.isDigit(args[i]);
				if(!a){
				return false;
				}
			}
		if(i>3 && i<7){
			boolean b=Character.isAlphabetic(args[i]);
				if(!b){
				return false;
				}
			}
		}
		return true;
	}
}
