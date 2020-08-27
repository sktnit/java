// throws statement:

// Sometimes we can create Exception object explicitly and we can hand over to
// the JVM manually by using throw keyword.

class Test {
  public static void main(String[] args) {
    System.out.println(10 / 0);
    // In this case creation of ArithmeticException object and handover to the jvm
    // will be performed automatically by the main() method.
  }
}

class Test1 {
  public static void main(String[] args) {
    throw new ArithmeticException("/by zero");
    // In this case we are creating exception object explicitly and handover to the
    // JVM manually.
  }
}

// Note: In general we can use throw keyword for customized exceptions but not
// for predefined exceptions.

// Case 1: throw e;
// If e refers null then we will get NullPointerException.
class Test2 {
  static ArithmeticException e = new ArithmeticException();

  public static void main(String[] args) {
    throw e;
  }
}
// Output:
// Runtime exception

class Test3 {
  static ArithmeticException e;

  public static void main(String[] args) {
    throw e; // NullPointerException
  }
}

// Case 2:
// After throw statement we can't take any statement directly otherwise we will
// get compile time error saying unreachable statement.

class Test3 {
  public static void main(String[] args) {
    System.out.println(10 / 0);// ArithmeticException
    System.out.println("hello");
  }

}

class Test4 {
  public static void main(String[] args) {
    throw new ArithmeticException("/by zero");
    System.out.println("hello");// Compile time error: unreachable statement
  }
}

// Case 3:
// We can use throw keyword only for Throwable types otherwise we will get
// compile time error saying incomputable types.

class Test5 {
  public static void main(String[] args) {
    throw new Test3();
  }
}
// Output:
// Compile time error.
// Test3.java:4: incompatible types found : Test3

class Test6 extends RuntimeException {
  public static void main(String[] args) {
    throw new Test3();
  }
}
// Output:
// Runtime error