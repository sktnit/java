package Demo1;
class A{
	int a;
	public void show() {
		System.out.println(a);
	}
}
class B extends A{
	public void show() {
		System.out.println("Child class"+a);
	}
}
public class Demo {
	public static void main(String args[]) {
		A b=new A();
		b.a=10;
		b.show();
	}
}
