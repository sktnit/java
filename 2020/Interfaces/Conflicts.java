package pack1;

// If two interfaces contain a method with same signature and same return type in the
// implementation class only one method implementation is enough.

// If two interfaces contain a method with same name but different arguments in the
// implementation class we have to provide implementation for both methods and these
// methods acts as a overloaded methods

// If two interfaces contain a method with same signature but different return types then it
// is not possible to implement both interfaces simultaneously

// Two interfaces can contain a variable with the same name and there may be a chance
// variable naming conflicts but we can resolve variable naming conflicts by using
// interface names

interface Interf1 {
  public void methodOne();

  public void methodTwo();

  int x = 999;
}

interface Interf2 {
  public void methodOne();

  public void methodTwo(int a);

  int x = 888;
}

public class Conflicts implements Interf1, Interf2 {
  public void methodOne() {
    System.out.println("methodeOne implemented");
  }

  public void methodTwo() {
    System.out.println("methodeTwo implemented");
  }

  public void methodTwo(int a) {
    System.out.println("methodeTwo overloaded");
  }

  public static void main(String[] args) {
    Conflicts obj = new Conflicts();
    obj.methodOne();
    obj.methodTwo(20);

    System.out.println(Interf1.x);
    System.out.println(Interf2.x);
  }
}