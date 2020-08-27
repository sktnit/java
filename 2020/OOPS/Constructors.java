// Whenever we are creating an object some piece of the code will be executed
// automatically to perform initialization of an object this piece of the code
// is nothing but constructor.

// Hence the main objective of constructor is to perform initialization of an
// object.
package pack1;

class Student {
  String name;
  int rollno;

  Student() {
  }

  Student(String name, int rollno) // Constructor
  {
    this.name = name;
    this.rollno = rollno;
  }

  public void show() {
    System.out.println(this.name);
    System.out.println(this.rollno);
  }

  public static void main(String[] args) {
    Student s = new Student();
    Student s1 = new Student("vijayabhaskar", 101);
    Student s2 = new Student("bhaskar", 102);
    s.show();
    s1.show();
    s2.show();
  }
}

// Constructor Vs instance block:
// 1. Both instance block and constructor will be executed automatically for
// every object creation but instance block 1st followed by constructor.

// 2. The main objective of constructor is to perform initialization of an
// object.

// 3. Other than initialization if we want to perform any activity for every
// object creation we have to define that activity inside instance block.

// 4. Both concepts having different purposes hence replacing one concept with
// another concept is not possible.

// 5. Constructor can take arguments but instance block can't take any arguments
// hence we can't replace constructor concept with instance block.

// 6. Similarly we can't replace instance block purpose with constructor.

class Test {
  static int count = 0;

  Test() {
  }

  {
    count++; // instance block
  }

  Test(int i) {
  }

  public static void main(String[] args) {
    Test t1 = new Test();
    Test t2 = new Test(10);
    Test t3 = new Test();
    System.out.println(count);// 3
  }
}

// Rules to write constructors:
// 1. Name of the constructor and name of the class must be same.
// 2. Return type concept is not applicable for constructor even void also by
// mistake if we are declaring the return type for the constructor we won't get
// any compile time error and runtime error compiler simply treats it as a
// method.
// It is legal (but stupid) to have a method whose name is exactly same as class
// name.
// 3. The only applicable modifiers for the constructors are public, default,
// private, protected.
// 4. If we are using any other modifier we will get compile time error.

// Default Constructor
// 1. For every class in java including abstract classes also constructor
// concept is applicable.
// 2. If we are not writing at least one constructor then compiler will generate
// default constructor.
// 3. If we are writing at least one constructor then compiler won't generate
// any default constructor. Hence every class contains either compiler generated
// constructor (or) programmer written constructor but not both simultaneously.

// Prototype of default constructor:
// 1. It is always no argument constructor.
// 2. The access modifier of the default constructor is same as class modifier.
// (This rule is applicable only for public and default).
// 3. Default constructor contains only one line. super(); it is a no argument
// call to super class constructor.

// Eg.
// public class Test { } ==>public class Test { public Test() { super();} }
// (Compiler Generated Code)

// Another example:
// class Test {
// Test(int i) {
// this();
// }
// Test() {
// }
// }

// Complier generate this code into following code internally:
// class Test {
// Test(int i) {
// this();
// }
// Test() {
// super();
// }
// }

// Overloaded constructors :
// A class can contain more than one constructor and all these constructors
// having the same name but different arguments and hence these constructors are
// considered as overloaded constructors

class Test1 {
  Test1(double d) {
    System.out.println("double-argument constructor");
  }

  Test1(int i) {
    this(10.5);
    System.out.println("int-argument constructor");
  }

  Test1() {
    this(10);
    System.out.println("no-argument constructor");
  }

  public static void main(String[] args) {
    Test1 t1 = new Test1(); // no-argument constructor/int-argument
    // constructor/double-argument constructor
    Test1 t2 = new Test1(10);
    // int-argument constructor/double-argument constructor
    Test1 t3 = new Test1(10.5);// double-argument constructor
  }
}
// Parent class constructor by default won't available to the Child. Hence
// Inheritance concept is not applicable for constructors and hence overriding
// concept also not applicable to the constructors. But constructors can be
// overloaded.
// We can take constructor in any java class including abstract class also but
// we can't take constructor inside interface.

// Abstract class constructor will be executed for every child class object
// creation to perform initialization of child class object only
abstract class P {
  String s;

  P() {
    s = "Shailesh";
    System.out.println(this.s);
    System.out.println(this.hashCode());
    // 366712642//here this means child class object
  }
}

class C extends P {
  // String s = "Sunny";

  C() {
    System.out.println(this.s);
    System.out.println(this.hashCode());// 366712642
  }
}

class Tests {
  public static void main(String[] args) {
    C c = new C();
    System.out.println(c.hashCode());// 11394033
    System.out.println(c.s);
  }
}

// We can't create object for abstract class but abstract class can contain
// constructor what is the need ?
// Abstract class constructor will be executed for every child class object
// creation to perform initialization of child class object only.

// If the Parent class contains any argument constructors while writing Child
// classes we should takes special care with respect to constructors.
// Whenever we are writing any argument constructor it is highly recommended to
// write no argument constructor also.
// class Parent {
// Parent(int i) {
// }
// }
// class Child extends Parent {
// Child(){
// super();// error:
// }
// }

// If Parent class constructor throws some checked exception compulsory Child
// class constructor should throw the same checked exception (or) its Parent
// class Parent
// {
// Parent()throws java.io.IOException
// {}
// }
// class Child extends Parent
// {}
// Output:
// Compile time error
// Unreported exception java.io.IOException in default constructor.
// Example:
// class Parent
// {
// Parent()throws java.io.IOException
// {}
// }
// class Child extends Parent
// {
// Child()throws Exception
// {
// super();
// }
// }