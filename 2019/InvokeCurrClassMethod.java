package ThisKey;

class Test{
	void display() {
		System.out.println("Invoked by this keyword");
	}
	void call() {
		this.display();
	}
}

public class InvokeCurrClassMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.call();
	}

}
