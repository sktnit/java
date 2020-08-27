// Our internal data should not go out directly that is outside person can't access our internal data directly.
// By using private modifier we can implement data hiding.

package pack1;

class Test {
  // balance instance var of test class not accessible from outside
  private double balance;

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public double getBalance() {
    return this.balance;
  }

}

public class DataHiding {

  public static void main(String[] args) {
    Test obj = new Test();
    // obj.balance; // error: not a statement
    obj.setBalance(20.00);
    System.out.println(obj.getBalance());
  }
}