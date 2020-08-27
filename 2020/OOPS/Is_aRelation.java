// IS-A Relationship(inheritance):
// By using "extends" keywords we can implement IS-A relationship.
// The main advantage of IS-A relationship is reusability
package pack1;

class Parent {
  public void methodOne() {
  }
}

class Child extends Parent {
  public void methodTwo() {
  }
}

public class Is_aRelation {
  public static void main(String[] args) {
    Parent p = new Parent();
    p.methodOne();
    // p.methodTwo();//error: cannot find symbol

    Child c = new Child();
    c.methodOne();
    c.methodTwo();

    Parent p1 = new Child();
    p1.methodOne();
    // p1.methodTwo();// error: cannot find symbol

    // Child c1 = new Parent();// error: incompatible types: Parent cannot be
    // converted to Child
  }
}

// For all java classes the most commonly required functionality is define
// inside object class hence object class acts as a root for all java classes.
// For all java exceptions and errors the most common required functionality
// defines inside Throwable class hence Throwable class acts as a root for
// exception hierarchy.

class Loan {
  // common methods which are required for any type of loan.
}

class HousingLoan extends Loan {
  // Housing loan specific methods.
}

class EducationLoan extends Loan {
  // Education Loan specific methods.
}

// Object is inherited by String, Number, Throwable etc

// Multiple Inheritance
// Any class can extends only one class at a time and can't extends more than
// one class
// simultaneously hence java won't provide support for multiple inheritance

// But an interface can extends any no. Of interfaces at a time hence java
// provides support
// for multiple inheritance through interfaces.

// Cyclic inheritance is not allowed in java.