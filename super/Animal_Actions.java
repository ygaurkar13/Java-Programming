class Animal_Actions{  
	public void eat(){
		System.out.println("eating...");
	}  
	
	public static void main(String args[]){  
		Dog d=new Dog();  
		d.work();  
	}
}  
class Dog1 extends Animal{  
	void eat(){
		System.out.println("eating bread...");
		
	}  
	void bark(){
		System.out.println("barking...");
	}  
	
	public void work(){  
		super.eat();  
		bark();  
	}  
}  
  
