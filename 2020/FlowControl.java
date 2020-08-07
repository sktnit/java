public class FlowControl {
  public static void main(String[] args) {

    // 1. if(boolean_condition)

    // Argument to the if statement should be Boolean

    // int x = 0;

    // if (x) { //Compile time error Argument must be a boolean
    // System.out.println("hello");
    // } else {
    // System.out.println("hi");
    // }

    // if (x = 20) { //Compile time error Argument is an integer must be a boolean
    // System.out.println("hello");
    // } else {
    // System.out.println("hi");
    // }

    // if (x == 20) {
    // System.out.println("hello");
    // } else {
    // System.out.println("hi"); // output: hi
    // }

    // boolean b = false;
    // if (b = true) {
    // System.out.println("hello"); // output: hello
    // } else {
    // System.out.println("hi");
    // }

    // b = false;
    // if (b == true) {
    // System.out.println("hello");
    // } else {
    // System.out.println("hi"); // output: hi
    // }

    // Without curly braces we can take only one statement under if, but it should
    // not be declarative statement.

    // if (true) ; // no output but executed successfully

    // invalid case
    // if(true)
    // int x=10; //Compile time error

    // valid case
    // if (true) {
    // int x = 10;
    // }

    // 2. switch(options)

    // switch argument are byte, short, char, int and wrapper classes (Byte, Short,
    // Character, Integer) and "enum" types are also allowed.
    // string types are also allowed
    // x = 10;
    // switch (x) { // Curly braces are mandatory

    // Both case and default are optional.
    // Statements inside switch must be under some case (or) default
    // Case labels should be "compile time constant" otherwise we will get compile
    // time error
    // Duplicate case labels are not allowed.
    // if any case is matched from that case onwards all statements will be executed
    // until end of the switch (or) break.
    // case 10:
    // System.out.println("10");
    // case 20:
    // System.out.println("20");
    // default:
    // System.out.println("default case");
    // }

    // invalid case
    // int y = 20;
    // switch (x) {
    // case 10:
    // System.out.println("10");
    // case y: // Case label constant expression required
    // System.out.println("20");
    // }

    // valid case: If we declare y as final we won't get any compile time error
    // x=10;
    // final int y = 20;
    // switch (x) {
    // case 10:
    // System.out.println("10");
    // case y:
    // System.out.println("20");
    // }
    // output:
    // 10
    // 20

    // invalid case
    // byte b=10;
    // switch(b)
    // {
    // case 10:
    // System.out.println("10");
    // case 100:
    // System.out.println("100");
    // case 1000: //byte required
    // System.out.println("1000");
    // }

    // valid case
    // byte b=10;
    // switch(b+1) // byte convert into integer
    // {
    // case 10:
    // System.out.println("10");
    // case 100:
    // System.out.println("100");
    // case 1000:
    // System.out.println("1000");
    // } //Output:

    // Invalid Duplicate cases
    // switch (x) {
    // case 97:
    // System.out.println("97");
    // case 99:
    // System.out.println("99");
    // case 'a':
    // System.out.println("100");
    // }

    // 3. while loop
    // while loop is used when we don't know the no of iterations in advance.

    // examples
    // while (rs.next()) {
    // }

    // while(e.hasMoreElements())
    // ----------
    // ----------
    // ----------
    // }

    // while(itr.hasNext())
    // {
    // ----------
    // ----------
    // ----------
    // }

    // rules:
    // argument to the while statement should be Boolean type
    // Curly braces are optional and without curly braces we can take only one
    // statement which should not be declarative statement.

    // invalid case
    // while(true)
    // int x=10;

    // valid case
    // while(true)
    // {
    // int x=10;
    // }

    // Unreachable statement cause error
    // while(true/false)
    // {
    // System.out.println("hello");
    // }
    // System.out.println("hi"); // unreachable statement
    // }

    // a=10;
    // b=20;
    // while(a<b)
    // {
    // System.out.println("hello"); // Output:hello(infinite times)
    // }
    // System.out.println("hi");
    // }

    // {
    // final int a=10,b=20;
    // while(a<b)
    // {
    // System.out.println("hello");
    // }
    // System.out.println("hi");
    // } OUTPUT: Compile time error

    // no error: Compiler won't check unreachability in the case of if-else it will
    // check only in loops
    if (true) {
      System.out.println("hello");
    } else {
      System.out.println("hi");
    }
  }
}