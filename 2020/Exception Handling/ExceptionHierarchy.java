// Throwable acts as a root for exception hierarchy.
// Throwable class contains Exception and Error two child classes.

// Exception:
// Most of the cases exceptions are caused by our program and these are
// recoverable.
// Eg : If FileNotFoundException occurs then we can use local file and we can
// continue rest of the program execution normally.

// Error:
// Most of the cases errors are not caused by our program these are due to lack
// of system resources and these are non-recoverable.
// Eg :If OutOfMemoryError occurs being a programmer we can't do anything the
// program will be terminated abnormally.System Admin or Server Admin is
// responsible to raise/increase heap memory.

// Fully checked Vs Partially checked :
// A checked exception is said to be fully checked if and only if all its child
// classes are also checked.
// Example:
// 1) IOException
// 2) InterruptedException
// A checked exception is said to be partially checked if and only if some of
// its child classes
// are unchecked.
// Example:
// Exception
// Note :The only possible partially checked exceptions in java are:
// 1. Throwable.
// 2. Exception.

// try-catch:
// It is highly recommended to handle exceptions.
// In our program the code which may raise exception is called risky code, we
// have to place risky code inside try block and the corresponding handling code
// inside catch block.
package pack1;

class Test {
  public static void main(String[] args) {
    System.out.println("statement1");
    try {
      System.out.println(10 / 0);
    } catch (ArithmeticException e) {
      System.out.println(10 / 2);
    }
    System.out.println("statement3");
  }
}

// Throwable class defines the following methods to print exception information
// to the console.
// printStackTrace(): This method prints exception information in the following
// format. Name of the exception: description of exception Stack trace

// toString(): This method prints exception information in the following format.
// Name of the exception: description of exception

// getMessage(): This method returns only description of the exception.
// Description.

class Test1 {
  public static void main(String[] args) {
    System.out.println("statement1");
    try {
      System.out.println(10 / 0);
    } catch (ArithmeticException e) {
      e.printStackTrace();
      System.out.println(e);
      System.out.println(e.getMessage());
      System.out.println(10 / 2);
    }
    System.out.println("statement3");
  }
}

// try with multiple catch
// The way of handling an exception is varied from exception to exception. Hence
// for every exception type it is recommended to take a separate catch block.
// That is try with multiple catch blocks is possible and recommended to use.

// If try with multiple catch blocks present then order of catch blocks is very
// important. It should be from child to parent by mistake if we are taking from
// parent to child then we will get Compile time error saying
// "exception xxx has already been caught"

class Test2 {
  public static void main(String[] args) {
    try {
      System.out.println(10 / 0);
    } catch (ArithmeticException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

// finally block: the main objective of finally block is to maintain cleanup
// code.

// Case-1: If there is no Exception:
class Test3 {
  public static void main(String[] args) {
    try {
      System.out.println("try block executed");
    } catch (ArithmeticException e) {
      System.out.println("catch block executed");
    } finally {
      System.out.println("finally block executed");
    }
  }
}

// Case-2: If an exception raised but the corresponding catch
// block matched:
class Test4 {
  public static void main(String[] args) {
    try {
      System.out.println("try block executed");
      System.out.println(10 / 0);
    } catch (ArithmeticException e) {
      System.out.println("catch block executed");
    } finally {
      System.out.println("finally block executed");
    }
  }
}

// Case-3: If an exception raised but the corresponding catch
// block not matched:

class Test5 {
  public static void main(String[] args) {
    try {
      System.out.println("try block executed");
      System.out.println(10 / 0);
    } catch (NullPointerException e) {
      System.out.println("catch block executed");
    } finally {
      System.out.println("finally block executed");
    }
  }
}

// return Vs finally:
// Even though return statement present in try or catch blocks first finally
// will be executed and after that only return statement will be considered.
// i.e finally block dominates return statement.
// Example:
class Test6 {
  public static void main(String[] args) {
    try {
      System.out.println("try block executed");
      return;
    } catch (ArithmeticException e) {
      System.out.println("catch block executed");
    } finally {
      System.out.println("finally block executed");
    }
  }
}

// If return statement present try, catch and finally blocks then finally block
// return statement will be considered.
// Example:
class Test7 {
  public static void main(String[] args) {
    System.out.println(m1());
  }

  public static int m1() {
    try {
      System.out.println(10 / 0);
      return 777;
    } catch (ArithmeticException e) {
      return 888;
    } finally {
      return 999;
    }
  }
}

// finally vs System.exit(0):
// There is only one situation where the finally block won't be executed is
// whenever we are using System.exit(0) method.
// When ever we are using System.exit(0) then JVM itself will be shutdown , in
// this case finally block won't be executed.
// i.e., System.exit(0) dominates finally block.

// Note:
// 1.if we are not entering into the try block then the finally block won't be
// executed. Once we entered into the try block without executing finally block
// we can't come out.
// 2. We can take try-catch inside try i.e., nested try-catch is possible
// 3. The most specific exceptions can be handled by using inner try-catch and
// generalized exceptions can be handle by using outer try-catch.

// Various possible combinations of try catch finally:
// 1. Whenever we are writing try block compulsory we should write either catch
// or finally. i.e., try without catch or finally is invalid.

// 2. Whenever we are writing catch block compulsory we should write try.
// i.e., catch without try is invalid.

// 3. Whenever we are writing finally block compulsory we should write try.
// i.e., finally without try is invalid.

// 4. In try-catch-finally order is important.

// 5. With in the try-catch -finally blocks we can take try-catch-finally. i.e.,
// nesting of try-catch-finally is possible.

// 6. For try-catch-finally blocks curly braces are mandatory.
