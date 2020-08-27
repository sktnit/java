// Overriding :
// Whatever the Parent has by default available to the Child through inheritance, if the Child is not satisfied with Parent class method implementation then Child is allow to redefine that Parent class method in Child class in its own way this process is called overriding.

// The Parent class method which is overridden is called overridden method.

// The Child class method which is overriding is called overriding method

// In overriding method resolution is always takes care by JVM based on runtime object hence overriding is also considered as runtime polymorphism or dynamic polymorphism or late binding.

// The process of overriding method resolution is also known as dynamic method dispatch.
package pack1;

class Parent {
  public void property() {
    System.out.println("cash+land+gold");
  }

  public void marry() {
    System.out.println("subbalakshmi"); // overridden method
  }
}

class Child extends Parent { // overriding
  public void marry() {
    System.out.println("Trisha/nayanatara/anushka");
    // overriding method
  }
}

// In overriding method names and arguments must be same.
// Until 1.4 version the return types must be same but from 1.5 version onwards
// covariant return types are allowed.
// Co-variant return type concept is applicable only for object types but not
// for
// primitives.
// (parent method return type)Object <== (Child method return type)String
// (valid)
// (parent method return type)Number <== (Child method return type)Integer
// (valid)
// (parent method return type)String <== (Child method return type)Object
// (invalid)
// (parent method return type)double <== (Child method return type)int (invalid)

// Private methods are not visible in the Child classes hence overriding concept
// is not applicable for private methods. Based on own requirement we can
// declare the same Parent class private method in child class also. It is valid
// but not overriding.

// Parent class final methods we can't override in the Child class

// Parent class non final methods we can override as final in child class. We
// can override native methods in the child classes.

// We should override Parent class abstract methods in Child classes to provide
// implementation.
abstract class P {
  public abstract void methodOne();
}

class C extends P {
  public void methodOne() {
  }
}

class A {
  public Object methodOne() {
    return null;
  }

  private void X() {
    // not possible to override
  }

  public final void Y() {
    // Parent class final methods we can't override in the Child class.
  }
}

class B extends A {
  public String methodOne() {
    return null;
  }

  private void X() {
    // it is valid but not overriding
  }

  // public void Y() {
  // Compile time error: methodOne() in Child cannot override methodOne() in
  // Parent; overridden method is final
  // }
}

class Test {
  public static void main(String[] args) {
    Parent p = new Parent();
    p.marry();// subbalakshmi(parent method)
    p = new Child();
    p.marry();// Trisha/nayanatara/anushka(child method)
    Child c = new Child();
    c.marry();// Trisha/nayanatara/anushka(child method)
    // c = new Parent();//error: incompatible types
  }
}

// We can override a non-abstract method as abstract this approach is helpful to
// stop availability of Parent method implementation to
// the next level child classes.

// While overriding we can't reduce the scope of access modifier.

// Synchronized, strictfp, modifiers won't keep any restrictions on overriding.
class Par {
  public void methodOne() {
  }
}

// final to nonfinal (invalid)
// nonfinal to final (valid)
// native to nonnative or viceversa(valid)
// abstract to nonabstract or vice versa(valid)
// Synchronized to non Synchronized or vice versa(valid)
// strictfp to nonstrictfp or vice versa(valid)

abstract class Ch extends Par {
  public abstract void methodOne();
}
