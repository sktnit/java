// Interface Methods:
// Every method present inside interface is always public and abstract whether we are
// declaring or not. Hence inside interface the following method declarations are equal.

// public: To make this method available for every implementation class.
// abstract: Implementation class is responsible to provide implementation . 

// we can't use the following modifiers for interface methods.
// Private, protected, final, static, synchronized, native, strictfp.

interface Branch {
  public void setCourses(); // Interface method with public modifiers

  public String[] getCourses();

  public int getCourseFees(String course);
}

class ComputerBranch implements Branch {

  public void setCourses() {
    return;
  }

  public String[] getCourses() {
    return new String[] { "IS", "CN", "AC" };
  }

  public int getCourseFees(String course) {
    return 1_20_000;
  }

}

public class Methods {

}