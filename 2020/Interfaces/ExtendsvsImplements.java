package pack1;

class One {
  public void methodOne() {

  }
}

// A class can extends only one class at a time.
class Two extends One {

}

interface First {
  public void methodOne();
}

interface Second {
  public void methodTwo();
}

// A class can implements any no. Of interfaces at a time.
class Third implements First, Second {
  public void methodOne() {
    // methodOne Definition
  }

  public void methodTwo() {

  }
}

// X extends Y, Z ?
// X, Y, Z should be interfaces.

// X extends Y implements Z ?
// X, Y should be classes.

// Z should be interface.
// X implements Y, Z ?

// X should be class.
// Y, Z should be interfaces.

// X implements Y extend Z ?
// No

public class ExtendsvsImplements {
  public static void main(String[] args) {

  }

}