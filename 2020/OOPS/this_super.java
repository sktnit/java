// super() vs this():
// The 1st line inside every constructor should be either super() or this() if
// we are not writing anything compiler will always generate super().

// We have to take super() (or) this() only in the 1st line of constructor. If
// we are taking anywhere else we will get compile time error.

class Test {
  Test() {
    super();
    System.out.println("constructor");
    // super();//error: Call to super must be first statement
  }
}

// We can use either super() (or) this() but not both simultaneously
class Test2 {
  Test2() {
    super();
    // this();// error: Call to this must be first statement
  }
}

// We can use super() (or) this() only inside constructor. If we are using
// anywhere else we will get compile time error.

class Test3 {
  public void methodOne() {
    // super();// error: Call to super must be first statement in constructor
    // That is we can call a constructor directly from another constructor only.
  }
}

// super(), this() are constructors calls and super, this are keywords to refers
// current and parent class instance members.

// super(), this() are used these to invoke super class & current constructors
// directly.

// super(), this() use only inside constructors as
// first line whereas super, this used anywhere (i.e., instance area)
// except static area.