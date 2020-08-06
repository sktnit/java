package InnerClass;

//1. Java static nested class example with instance method

class StaticNestedEx{
	static int data=30;  
	static class Inner{
		void msg(){
			System.out.println("data is "+data);
		}
	  
	}
	
	public static void main(String args[]){
		
		StaticNestedEx.Inner obj=new StaticNestedEx.Inner();  
		obj.msg();  
		
	}  
	
}