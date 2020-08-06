package InnerClass;


interface Showable{  
	  void show();  
	  interface Message{  
		  void msg();  
	  }  
}


public class StaticNestedInterface implements Showable.Message{
	
	public void msg(){System.out.println("Hello nested interface");}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Showable.Message message=new StaticNestedInterface();//upcasting here  
		message.msg();
		
	}

}

//The java compiler internally creates public and static interface as displayed below:.
//public static interface Showable$Message{  
//	public abstract void msg();  
//}


//Example of nested interface which is declared within the class
//Let's see how can we define an interface inside the class and how can we access it.
//
//    class A{  
//      interface Message{  
//       void msg();  
//      }  
//    }  
//      
//    class TestNestedInterface2 implements A.Message{  
//     public void msg(){System.out.println("Hello nested interface");}  
//      
//     public static void main(String args[]){  
//      A.Message message=new TestNestedInterface2();//upcasting here  
//      message.msg();  
//    }  
// }

//class inside the interface
//interface M{  
//	  class A{}  
//}