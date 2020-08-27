//An empty source file is a valid java Program

// Java source file structure 
// Atmost one package statement
// any number of import statement
// any numver of class/interface/enum declarations

// Package:
// Encapsulation mechanism to group related classes and interfaces into a single module.
// The main objectives of packages are:
// To resolve name confects.
// To improve modularity of the application.
// To provide security.
// There is one universally accepted naming conversion for packages that is to use internet domain name in reverse.
// Eg. (domain_name, module, submodule, class)

package com.sktnit.demo.Modifiers;

import java.sql.*;
import java.util.Date;

import static java.lang.Integer.MAX_VALUE;// explicit static import
import static java.lang.Byte.*;// implicit static import
import static java.lang.Math.sqrt;

// Java source file structure:
// A java Program can contain any no. Of classes but at most one class can be
// declared as public. "If there is a public class the name of the Program and
// name of the public class must be matched otherwise we will get compile time
// error".
// If there is no public class then any name we gives for java source file.
class A {
  public static void main(String args[]) {
    System.out.println("A class main method is executed");
  }
}

class B {
  public static void main(String args[]) {
    System.out.println("B class main method is executed");
  }
}

class C {
  public static void main(String args[]) {
    System.out.println("C class main method is executed");
  }
}

// public class D {} //If class B declared as public then the name of the
// Program should be D.java otherwise we will get compile time error
// No more than one class declared as public
public class Modifiers {
  public static void main(String[] args) {
    System.out.println("Inside public class");
  }
}

// import statement: "dynamic loading" or "load-on -demand" or "load-on-fly"
// Whenever we are importing a package all classes and interfaces present in
// that package are by default available but not sub package classes.

// In any java Program the following 2 packages are not require to import
// because these are available by default to every java Program.
// 1. java.lang package
// 2. default package(current working directory)

// two types of import statements: Explicit(recommended) and Implicit import.
// import java.util.ArrayList;// explicit import
// import java.util.*;// imlicit import

// class Test {
// public static void main(String args[]) {
// java.util.ArrayList l = new java.util.ArrayList();// we can use fully
// qualified name every time otherwise import statement
// ArrayList l = new ArrayList();
// }
// }

class Test {
  public static void main(String[] args) {
    // import java.util.*;
    // import java.sql.*;
    // error: reference to Date is ambiguous
    // While resolving class names compiler will always gives the importance in the
    // following order.
    // 1. Explicit class import
    // 2. Classes present in current working directory.
    // 3. Implicit class import
    Date d = new Date();
  }
}

// Static import:

// Usually we can access static members by using class name but whenever we are
// using static import it is not require to use class name we can access
// directly

// While resolving static members compiler will give the precedence in the
// following order.
// 1. Current class static members
// 2. Explicit static import
// 3. implict static import.

class Test1 {
  static int MAX_VALUE = 999;// current class static members

  public static void main(String[] args) {
    System.out.println(MAX_VALUE);
    System.out.println(sqrt(6));
  }
}

// class modifiers: default, public, final, Abstract, Strictfp

// Inner class modifiers: default, public, final, Abstract, Strictfp, private,
// protected, static
// If a class declared as public then we can access that class from anywhere.
// With in the package or outside the package

// Public class: we can access that class from anywhere
// Program1:
// package pack1;
// public class Test {
// public void methodOne() {
// System.out.println("test class methodone is executed");
// }
// }
// Compile the above Program:javac-d . Test.java

// Program2:
// package pack2;
// import pack1.Test;
// class Test1 {
// public static void main(String args[]) {
// Test t = new Test();
// t.methodOne();
// }
// }
// OUTPUT:
// D:\Java>javac -d . Test1.java
// D:\Java>java pack2.Test1
// Test class methodone is executed.

// If class Test is not public then while compiling Test1 class we will get
// compile time error saying pack1.Test is not public in pack1; cannot be
// accessed from outside package.

// Default class: we can access that class only within the current package
// package level access
// Program 1:
// package pack1;
// class Test {
// public void methodOne() {
// System.out.println("test class methodone is executed");
// }
// }

// Program 2:
// package pack1;
// import pack1.Test;
// class Test1 {
// public static void main(String args[]) {
// Test t = new Test();
// t.methodOne();
// }
// }
// OUTPUT:
// D:\Java>javac -d . Test.java
// D:\Java>javac -d . Test1.java
// D:\Java>java pack1.Test1
// Test class methodone is executed

// Final Modifiers
// Final is the modifier applicable for classes, methods and variables

// Final Methods: final methods cannot overriddenin child class

// Final class: We can't inherit the final class
// Every method present inside a final class is always final by default whether
// we are declaring or not. But every variable present inside a final class need
// not be final

// Abstract Modifiers
// Abstract is the modifier applicable only for methods and classes but not for
// variables.

// Abstract Methods:abstract methods have only declaration but not
// implementation. public abstract void methodname();
// Hence abstract method declaration should compulsory ends with semicolon.
// Child classes are responsible to provide implementation for parent class
// abstract methods.
// The main advantage of abstract methods is , by declaring abstract method in
// parent class we can provide guide lines to the child class such that which
// methods they should compulsory implement.

// If a class contain at least on abstract method then compulsory the
// corresponding class should be declare with abstract modifier. Because
// implementation is not complete and hence we can't create object of that
// class.

// Abstract with final, static, synchronised, native, strictfp or private are
// illegal combination.

// Abstract class:
// For any java class if we are not allow to create an object such type of class
// we have to declare with abstract modifier that is for abstract class
// instantiation is not possible

// Even though class doesn't contain any abstract methods still we can declare
// the class as abstract that is an abstract class can contain zero no of
// abstract methods also.

// If a class extends any abstract class then compulsory we should provide
// implementation for every abstract method of the parent class otherwise we
// have to declare child class as abstract.

// Eg.
// abstract class Parent {
// public abstract void methodOne();
// public abstract void methodTwo();
// }

// class child extends Parent {
// public void methodOne() {
// }
// }
// Output:
// Compile time error.
// D:\Java>javac Parent.java
// Parent.java:6: child is not abstract and does not
// override abstract method methodTwo() in Parent
// class child extends Parent

// strictfp:
// the modifier applicable for methods and classes but not for variables.
// Strictfp modifier introduced in 1.2 versions.
// Usually the result of floating point of arithmetic is varing from platform to
// platform , to overcome this problem we should use strictfp modifier. If a
// method declare as the Strictfp then all the floating point calculations
// in that method has to follow IEEE754 standard, So that we will get platform
// independent results.