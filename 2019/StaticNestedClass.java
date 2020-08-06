package Demo1;

//access static data members of outer class including private.
//Static nested class cannot access non-static (instance) data member or method.
public class StaticNestedClass {
	
	static int data=30;  
	static class Inner{  
		void msg(){System.out.println("data is "+data);}  
	}
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticNestedClass.Inner obj=new StaticNestedClass.Inner(); 
		
		obj.msg(); 
	}

}
