package InnerClass;

public class MemberInnerClass {
	
	private int data=30;  
	class Inner{ 
		int value=40;
		void msg(){System.out.println("data is "+data);}  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberInnerClass obj=new MemberInnerClass();  
		MemberInnerClass.Inner in=obj.new Inner();
		in.msg();
		System.out.println(in.getClass());
	}

}


//Internal code generated by the compiler
//
//The java compiler creates a class file named Outer$Inner in this case. The Member inner class have the reference of Outer class that is why it can access all the data members of Outer class including private.
//
//    import java.io.PrintStream;  
//    class Outer$Inner  
//    {  
//        final Outer this$0;  
//        Outer$Inner()  
//        {   super();  
//            this$0 = Outer.this;  
//        }  
//        void msg()  
//        {  
//            System.out.println((new StringBuilder()).append("data is ")  
//                        .append(Outer.access$000(Outer.this)).toString());  
//        }  
//    }