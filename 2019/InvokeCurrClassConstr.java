package ThisKey;

class ClassConst{
	ClassConst(){
		System.out.println("Current class constructer called by this");
	}
	ClassConst(int x) {
		this(); //this method should be the first method
	}
}
public class InvokeCurrClassConstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassConst t= new ClassConst(10);
	}
}
