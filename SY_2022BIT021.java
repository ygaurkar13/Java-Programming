+public class SY_2022BIT021{
	public static void main(String[] args){
	int arr[]={1,2,3,4,5,6};
	
	int x=firstElement(arr);
	System.out.println(x);   
	int y=lastElement(arr);
	 System.out.println(y); 
	int z=sumOfElementsOfArray(arr);
	 System.out.println(z);
	int w=secondLastElement(arr);
	 System.out.println(w);
	
	}
	public static int firstElement(int[] args){
		if(args.length==0)
		return 0;	
		return args[0];
	}
	
	public static int lastElement(int[] args){
		for(int i=0;i<=args.length;i++){
			
		return args[args.length-1];
	}
       return 1;	
	}
 
	
	public static int sumOfElementsOfArray(int[] args){
		int sum=0;
		for(int i=0;i<args.length;i++){
			sum=sum+args[i];
	}
	return sum;
	}
	
	public static int secondLastElement(int[] args){
	for(int i=0;i<args.length;i++)
	return args[args.length-2];
	return 1;        
	}

}     //char class
