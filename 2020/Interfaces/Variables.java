// The main purpose of interface variables is to define requirement level constants.
// Every interface variable is always public static and final whether we are declaring or not.

// public: To make it available for every implementation class.
// static: Without existing object also we have to access this variable.
// final: Implementation class can access this value but cannot modify.

// For the interface variables compulsory we should perform initialization at the time of declaration only otherwise we will get compile time error.

interface Variable {
  int x = 10; // by default public static final
}

public class Variables implements Variable {
  public static void main(String[] args) {
    // x = 20; reassinging the value to interface variable leads to error: cannot
    // assign a value to final variable x.

    int x = 20;
    System.out.println(x);
  }
}