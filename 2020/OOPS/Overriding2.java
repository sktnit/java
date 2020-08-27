package pack1;

import java.io.EOFException;
import java.io.IOException;

// Checked Vs Un-checked Exceptions :
// The exceptions which are checked by the compiler for smooth execution of the
// program at runtime are called checked exceptions.
// The exceptions which are not checked by the compiler are called un-checked
// exceptions.
// RuntimeException and its child classes, Error and its child classes are
// unchecked except these the remaining are checked exceptions

// Rule: While overriding if the child class method throws any checked exception
// compulsory the parent class method should throw the same checked exception or its
// parent otherwise we will get compile time error.
// But there are no restrictions for un-checked exceptions

class Parent {
  public void methodOne() throws IOException {
    // Compile time error :
    // methodOne() in Child cannot override methodOne() in Parent;
    // overridden method does not throw java.lang.Exception
  }
}

class Child extends Parent {
  public void methodOne() throws ArithmeticException {
  }

  public static void main(String[] args) {

  }
}

// More Examples:
// Parent: public void methodOne() throws Exception
// Child: publc void methodOne() (valid)

// Parent: public void methodOne()
// Child: public void methodOne() throws Exception (invalid)

// Parent: public void methodOne() throws Exception
// Child: public void methodOne() throws Exception (valid)

// Parent: public void methodOne() throws IOException
// Child: public void methodOne() throws Exception (invalid)

// Parent: public void methodOne() throws IOException
// Child: public void methodOne() throws EOFException, FileNotFoundException
// (valid)

// Parent: public void methodOne() throws IOException
// Child: public void methodOne() throws EOFException, InterruptedException
// (valid)

// Parent: public void methodOne() throws IOException
// Child: public void methodOne() throws EOFException, ArithmeticException
// (valid)

// Parent: public void methodOne()
// Child: public void methodOne() throws ArithmeticException,
// NullPointerException, ClassNotFoundException,RuntimeException
// (valid)

// Overriding with respect to static methods:
// We can't override a static method as non static.

class P {
  public static void methodOne() {
  }
  // here static methodOne() method is a class level
}

class C extends P {
  // public void methodOne() {
  // }
  // here methodOne() method is a object level hence
  // we can't override methodOne() method
}

// Similarly we can't override a non static method as static.

class Par {
  public static void methodOne() {
    System.out.println("parent class");
  }
}

class Ch extends Par {
  public static void methodOne() {
    System.out.println("child class");
  }
}

// Method hiding is also considered as compile time polymorphism (or) static
// polymorphism (or) early biding.
class Test {
  public static void main(String[] args) {
    Par p = new Par();
    p.methodOne();// parent class
    Ch c = new Ch();
    c.methodOne();// child class
    Par p1 = new Ch();
    p1.methodOne();// parent class
  }
}
// It is valid. It seems to be overriding concept is applicable for static
// methods but it is not overriding it is method hiding.

// Difference between overrinding and hiding:
// In overriding, both Parent and Child class methods should be non static.
// whereas in method hiding, Both Parent and Child class methods should be
// static.

// In overriding, Method resolution is always takes care by JVM based on runtime
// object whereas in hiding, Method resolution is always takes care by compiler
// based on reference type.

// Overriding is also considered as runtime polymorphism (or) dynamic
// polymorphism (or) late binding whereas Method hiding is also considered as
// compile time polymorphism (or) static polymorphism (or) early biding.

// Overriding with respect to Var-arg methods:
// A var-arg method should be overridden with var-arg method only. If we are
// trying to override with normal method then it will become overloading but not
// overriding.
class Parents {
  public void methodOne(int... i) {
    System.out.println("parent class");
  }
}

class Childs extends Parents { // overloading but not overriding.
  public void methodOne(int i) {
    System.out.println("child class");
  }
}

// if we replace child class method with var arg then it will become overriding
class Tests {
  public static void main(String[] args) {
    Parents p = new Parents();
    p.methodOne(10);// parent class
    Childs c = new Childs();
    c.methodOne(10);// child class
    Parents p1 = new Childs();
    p1.methodOne(10);// parent class
    p1.methodOne(new int[] { 10, 20 });// parent class
  }
}

// Overriding with respect to variables:
// Overriding concept is not applicable for variables.
// Variable resolution is always takes care by compiler based on reference type.
// Example:
class Papa {
  int x = 888;
}

class Bachche extends Papa {
  int x = 999;
}

class Check {
  public static void main(String[] args) {
    Papa p = new Papa();
    System.out.println(p.x);// 888
    Bachche c = new Bachche();
    System.out.println(c.x);// 999
    Papa p1 = new Bachche();
    System.out.println(p1.x);// 888
  }
}