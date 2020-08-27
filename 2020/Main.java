public class Main {
  // Overloading of the main() method is possible but JVM always calls string[]
  // argument main() method only.
  public static void main(int[] args) {
    System.out.println("int[] array main method");// overloaded methods
  }

  public static void main(String[] args) {
    System.out.println("String[] array main method"); // overloaded methods
  }
}

// Inheritance concept is applicable for static methods including main() method
// hence while executing child class if the child class doesn't contain main()
// method then the parent class main() method will be executed.
class Parent {
  public static void main(String[] args) {
    System.out.println("parent main"); // Parent.java
  }
}

class Child1 extends Parent {
}

class Child2 extends Parent {
  // It seems to be overriding concept is applicable for static methods but it is
  // not overriding it is method hiding.
  public static void main(String[] args) {
    System.out.println("child main"); // Parent.java
  }
}