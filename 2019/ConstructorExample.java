package Demo1;

public class ConstructorExample {
	
	ConstructorExample(){
		System.out.println("ConstructerExample1 is called");
	}
	ConstructorExample(int a, int b){
		System.out.println("ConstructerExample is called");
	}
	ConstructorExample(float a, float b){
		System.out.println("Float is called");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorExample b=new ConstructorExample();
		ConstructorExample a=new ConstructorExample(7,8);
		ConstructorExample c = new ConstructorExample(7f, 8f);
	}

}
