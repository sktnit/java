// Same name with different forms is the concept of polymorphism.
package pack1;

class Test {
  public int abs(int x) {
    return (x < 0) ? -x : x;
  }

  public long abs(long x) {
    return (x < 0) ? -x : x;
  }

  public float abs(float x) {
    return (x < 0) ? -x : x;
  }
}

class Test2 {
  // compile time polymorphism(or) static polymorphism (or)early biding.
  public void methodOne() {
    System.out.println("no-arg method");
  }

  public void methodOne(int i) {
    System.out.println("int-arg method"); // overloaded methods
  }

  public void methodOne(double d) {
    System.out.println("double-arg method");
  }

  public static void main(String[] args) {
    Test2 t = new Test2();
    t.methodOne();// no-arg method
    t.methodOne(10);// int-arg method
    t.methodOne(10.5);// double-arg method
  }
}

class Example1 {
  public void methodOne(int i) {
    System.out.println("int-arg method");
  }

  public void methodOne(float f) // overloaded methods
  {
    System.out.println("float-arg method");
  }

  public static void main(String[] args) {
    Example1 t = new Example1();
    t.methodOne('a');// int-arg method
    t.methodOne(10l);// float-arg method
    // t.methodOne(10.5);// C.E:cannot find symbol
  }
}

class Example2 {
  public void methodOne(String s) {
    System.out.println("String version");
  }

  public void methodOne(Object o) // Both methods are said to be overloaded methods.
  {
    System.out.println("Object version");
  }

  // Note :
  // While resolving overloaded methods exact match will always get high priority,
  // While resolving overloaded methods child class will get the more priority
  // than parent class
  public static void main(String[] args) {
    Example2 t = new Example2();
    t.methodOne("arun");// String version
    t.methodOne(new Object());// Object version
    t.methodOne(null);// String version
  }
}

class Example3 {
  public void methodOne(String s) {
    System.out.println("String version");
  }

  public void methodOne(StringBuffer s) {
    System.out.println("StringBuffer version");
  }

  public static void main(String[] args) {
    Example3 t = new Example3();
    t.methodOne("arun");// String version
    t.methodOne(new StringBuffer("sai"));// StringBuffer version
    // t.methodOne(null);// CE : reference to m1() is ambiquous
  }
}

class Example4 {
  public void methodOne(int i, float f) {
    System.out.println("int-float method");
  }

  public void methodOne(float f, int i) {
    System.out.println("float-int method");
  }

  public static void main(String[] args) {
    Example4 t = new Example4();
    t.methodOne(10, 10.5f);// int-float method
    t.methodOne(10.5f, 10);// float-int method
    // t.methodOne(10, 10); // C.E:
    // CE:reference to methodOne is ambiguous,
    // both method methodOne(int,float) in Test
    // and method methodOne(float,int) in Test match
    // t.methodOne(10.5f, 10.5f);// C.E: cannot find symbol
    // symbol : methodOne(float, float)
    // location : class Test
  }
}

class Example5 {
  public void methodOne(int i) {
    System.out.println("general method");
  }

  public void methodOne(int... i) {
    System.out.println("var-arg method");
  }

  // var-arg method will get less priority that is if no other method matched then
  // only var-arg method will get chance for execution it is almost same as
  // default case inside switch.
  public static void main(String[] args) {
    Example5 t = new Example5();
    t.methodOne();// var-arg method
    t.methodOne(10, 20);// var-arg method
    t.methodOne(10);// general method
  }
}

class Animal {
}

class Monkey extends Animal {
}

class Example6 {
  public void methodOne(Animal a) {
    System.out.println("Animal version");
  }

  public void methodOne(Monkey m) {
    System.out.println("Monkey version");
  }

  public static void main(String[] args) {
    Example6 t = new Example6();
    Animal a = new Animal();
    t.methodOne(a);// Animal version
    Monkey m = new Monkey();
    t.methodOne(m);// Monkey version
    Animal a1 = new Monkey();
    t.methodOne(a1);// Animal version
  }
}
// In overloading method resolution is always based on reference type and
// runtime object won't play any role in overloading.