package Demo1;


//The big difference with the traditional new is that newInstance allows to instantiate 
//a class that you don't know until runtime, making your code more dynamic.

//A typical example is the JDBC API which loads, at runtime, 
//the exact driver required to perform the work. EJBs containers, 
//Servlet containers are other good examples: they use dynamic runtime loading to 
//load and create components they don't know anything before the runtime.

public class DynamicInstantiateClass {
	
	public DynamicInstantiateClass() {
        System.out.println("Hi!");
    }

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		Class clazz = Class.forName("Demo1.DynamicInstantiateClass");
		DynamicInstantiateClass demo = (DynamicInstantiateClass)clazz.newInstance();
	}

}

//links: https://stackoverflow.com/questions/2092659/what-is-the-difference-between-class-forname-and-class-forname-newinstanc