package pack1;

// Hide internal implementation and just highlight the set of services, is called abstraction.
// By using abstract classes and interfaces we can implement abstraction.
interface A {
  int a = 10;

  public void print();
}

abstract class B implements A {

}

public class Abstraction extends B {
  public void print() {
    System.out.println("The value of a is " + a);
  }

  public static void main(String[] args) {
    Abstraction obj = new Abstraction();
    obj.print();
  }
}

// Advantages of abstraction:
// We can achieve security as we are not highlighting our internal
// implementation.(i.e., outside person doesn't aware our internal
// implementation.)
// Enhancement will become very easy because without effecting end user we
// can able to perform any type of changes in our internal system.
// It provides more flexibility to the end user to use system very easily.
// It improves maintainability of the application.
// It improves modularity of the application.
// It improves easyness to use our system.