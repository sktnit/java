package Demo1;

public class ClassLoaderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class c = ClassLoaderExample.class;
		System.out.println(c);
		System.out.println(c.getClassLoader());
		System.out.println(String.class.getClassLoader());
		System.out.print(c.getCanonicalName());
		
	}

}
