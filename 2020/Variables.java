// Based on type of values:
// Primitive Var
// Reference Var
public class Variables {
  public static void main(String[] args) {
    int x = 10;
    System.out.println("Value of primitive var x is " + x);
    Variables s = new Variables();
  }
}

// Based on the behaviour and position of declaration
// Instance variables:
// value of a variable is varied from object to object
// every object has a separate copy of instance variables
// scope of instance variables is exactly same as scope of objects
// stored on the heap as the part of object
// Instance variables should be declared with in the class directly but outside
// of any method or block or constructor
// Instance variables can be accessed directly from Instance area. But cannot be
// accessed directly from static area.
// But by using object reference we can access instance variables from static
// area.
// For the instance variables it is not required to perform initialization JVM
// will always provide default values.

class Test {
  int i = 10; // Instance varable
  static int j = 20; // Static var

  public static void main(String[] args) {
    // System.out.println(i); // C.E:non-static variable i cannot be referenced from
    // a static context(invalid)
    Test t = new Test();
    System.out.println(t.i);// 10(valid)
    t.methodOne();

    System.out.println(t.j);// 10
    System.out.println(Test.j);// 10
    System.out.println(j);// 10

    Test t1 = new Test();
    t1.i = 888;
    t1.j = 999;
    Test t2 = new Test();

    System.out.println(t1.i + "----" + t1.j);// 888----999
    System.out.println(t2.i + "----" + t2.j);// 10----999
  }

  public void methodOne() {
    System.out.println(i);// 10(valid)
  }
}

// Static variables:
// value of a variable is not varied from object to object
// class level variable by using static modifier.
// In the case of static variables, for entire class only one copy will be
// created and shared by every object of that class.
// scope of the static variable is exactly same as the scope of the .class file.
// Static variables will be stored in method area.
// Static variables should be declared with in the class directly but outside of
// any method or block or constructor.
// Static variables can be accessed from both instance and static areas
// directly.
// We can access static variables either by class name or by object reference
// but usage of class name is recommended.
// But within the same class it is not required to use class name we can access
// directly.

// .class scope
// when we run java TEST
// 1. Start JVM.
// 2. Create and start Main Thread by JVM.
// 3. Locate(find) Test.class by main Thread.
// 4. Load Test.class by main Thread. // static variable creation
// 5. Execution of main() method.
// 6. Unload Test.class // static variable destruction
// 7. Terminate main Thread.
// 8. Shutdown JVM.

// Local variables:
// variables inside a method or block or constructors
// stored inside stack
// scope of the local variables is exactly same as scope of the block in which
// we declared
// For the local variables JVM won't provide any default values
// The only applicable modifier for local variables is final.
// Example 1
class Example1 {
  public static void main(String[] args) {
    // int a;
    // System.out.println(a);// error: variable a might not have been initialized
    int i = 0; // local variable
    for (int j = 0; j < 3; j++) {
      i = i + j;
    }
    // System.out.println(i + "-----" + j); // error: cannot find symbol
  }
}

// Example2
class Example2 {
  public static void main(String[] args) {
    int x;
    if (args.length > 0) {
      x = 10;
    }
    // System.out.println(x); // error: variable x might not have been initialized
  }
}

// Example3
class Example3 {
  public static void main(String[] args) {
    int x;
    if (args.length > 0) {
      x = 10;
    } else {
      x = 20;
    }
    System.out.println(x);
  }
}

// Example4
class Example4 {
  public static void main(String[] args) {
    // public int x = 10; // (invalid)
    // private int x = 10; // (invalid)
    // protected int x = 10; // (invalid) C.E: illegal start of expression
    // static int x = 10; // (invalid)
    // volatile int x = 10; // (invalid)
    // transient int x = 10; // (invalid)
    final int x = 10;// (valid)
  }
}
// Note: If we are not declaring any modifier explicitly then it means default
// modifier but this rule is applicable only for static and instance variables
// but not local variable.