package pack1;

// Binding of data and corresponding methods into a single unit is called Encapsulation .
// If any java class follows data hiding and abstraction such type of class is said to be encapsulated class.
// Encapsulation=Datahiding+Abstraction

class Class {
  private String name;
  private int roll;

  public void setName(String name) {
    this.name = name;
  }

  public void setRoll(int roll) {
    this.roll = roll;
  }

  public String getName() {
    return name;
  }

  public int getRoll() {
    return roll;
  }

  public void print() {
    System.out.println("Information of Student is:");
    System.out.println(this.name);
    System.out.println(this.roll);
    return;
  }
}

// Tightly encapsulated class:every variable of that class declared as private.
// Note: if the parent class is not tightly encapsulated then no child class is
// tightly encapsulated.
public class Encapsulation {
  public static void main(String[] args) {
    Class obj = new Class();
    obj.setName("Shailesh");
    obj.setRoll(1821122);
    obj.print();
  }
}

// The main advantages of encapsulation are :
// 1. We can achieve security.
// 2. Enhancement will become very easy.
// 3. It improves maintainability and modularity of the application.
// 4. It provides flexibility to the user to use system very easily.