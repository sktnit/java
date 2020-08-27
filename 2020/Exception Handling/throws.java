// throws

// In our program if there is any chance of raising checked exception then compulsory we
// should handle either by try catch or by throws keyword otherwise the code won't
// compile.

import java.io.*;

class Test {
  public static void main(String[] args) {
    PrinterWriter out = new PrintWriter("abc.txt");// CE :Unreported exception java.io.FileNotFoundException; must be
    // caught or declared to be thrown
    out.println("hello");
  }
}

class Test1 {
  public static void main(String[] args) {
    Thread.sleep(5000);
    // Unreported exception java.lang.InterruptedException; must be caught or
    // declared to be thrown.
  }
}

// We can handle this compile time error by using the following 2 ways.
// By using try catch
class Test2 {
  public static void main(String[] args) {
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
    }
  }
}

// By using throws keyboard
// We can use throws keyword to delegate the responsibility of exception
// handling to the caller method. Then caller method is responsible to handle
// that exception.
class Test3 {
  public static void main(String[] args) throws InterruptedException {
    Thread.sleep(5000);
  }
}

// Note :
// Hence the main objective of "throws" keyword is to delegate the
// responsibility of exception handling to the caller method.
// "throws" keyword required only checked exceptions. Usage of throws for
// unchecked exception there is no use.
// "throws" keyword required only to convince complier. Usage of throws
// keyword doesn't prevent abnormal termination of the program.

// Hence recommended to use try-catch over throws keyword.

class Test4 {
  public static void main(String[] args) throws InterruptedException {
    doStuff();
  }

  public static void doStuff() throws InterruptedException {
    doMoreStuff();
  }

  public static void doMoreStuff() throws InterruptedException {
    Thread.sleep(5000);
  }
}

// Case 1:
// we can use throws keyword only for Throwable types otherwise we will get
// compile time error saying incompatible types.

class Test5 {
  public static void main(String[] args) throws Test5 {
    // Compile time error
  }
}

class Test6 extends RuntimeException {
  public static void main(String[] args) throws Test6 {
    // Compile and running successfully.
  }
}

// Case 2:Example:
class Test7 {
  public static void main(String[] args) {
    throw new Exception();
  }
}
// Output: Compile time error. Test3.java:3: unreported exception
// java.lang.Exception; must be caught or declared to be thrown

class Test8 {
  public static void main(String[] args) {
    throw new Error();
  }
}
// Output: Runtime error Exception in thread "main" java.lang.Error

// Case 3:
// In our program with in the try block, if there is no chance of rising an
// exception then we can't right catch block for that exception otherwise we
// will get compile time error saying exception XXX is never thrown in body of
// corresponding try statement. But this rule is applicable only for fully
// checked exception.
class Test9 {
  public static void main(String[] args) {
    try {
      System.out.println("hello");//
    } catch (Exception e) {// partially checked
      // TODO: handle exception
    }
  }
}
// Output: hello

class Test10 {
  public static void main(String[] args) {
    try {
      System.out.println("hello");//
    } catch (ArithmeticException e) {// unchecked
      // TODO: handle exception
    }
  }
}
// output: hello

class Test11 {
  public static void main(String[] args) {
    try {
      System.out.println("hello");//
    } catch (java.io.IOException e) {// fully checked
      // TODO: handle exception
    }
  }
}
// output: compile time error

// Exception handling keywords summary:
// 1. try: To maintain risky code.
// 2. catch: To maintain handling code.
// 3. finally: To maintain cleanup code.
// 4. throw: To handover our created exception object to the JVM manually.
// 5. throws: To delegate responsibility of exception handling to the caller
// method.

// Various possible compile time errors in exception handling:
// 1. Exception XXX has already been caught.
// 2. Unreported exception XXX must be caught or declared to be thrown.
// 3. Exception XXX is never thrown in body of corresponding try statement.
// 4. Try without catch or finally.
// 5. Catch without try.
// 6. Finally without try.
// 7. Incompatible types.
// 8. Unreachable statement.