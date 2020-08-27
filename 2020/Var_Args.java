// var_arg methods:
// var-arg parameter implemented by using single dimensional array
public class Var_Args {

  public static void sum(int... x) {
    int total = 0;
    for (int i = 0; i < x.length; i++) {
      total = total + x[i];
    }
    // for (int x1 : x) {
    // total = total + x1;
    // }
    System.out.println("The sum :" + total);
  }

  // In general var-arg method will have least priority that is if no other method
  // matched then only var-arg method will get the chance
  public static void methodOne(int i) {
    System.out.println("general method");
  }

  // low priority
  public static void methodOne(char... x) {
    System.out.println("var-arg method");
  }

  // We can mix var-arg parameter with general parameters also.
  // If we mix var-arg parameter with general parameter then var-arg parameter
  // should be the last parameter
  // methodOne(int a,int... b) //valid
  // methodOne(String s,int... x) //valid
  // methodOne(int... a,int b) //(invalid)

  // more than one var-arg parameters not allowed with in a method
  // methodOne(int... a,int... b) //(invalid)

  // single dimensional array present we can replace with var-arg parameter
  // methodeOne(int[] i) ==> methodeOne(int... i)(valid)
  // methodeOne(int... i) ==> methodeOne(int[] i)(invalid)

  public static void methodOne(int[]... x) {
    for (int[] a : x) {
      System.out.println(a[0]);
    }
  }

  public static void main(String[] args) {
    // methodOne();
    methodOne(10);
    methodOne('a', 'b', 'c');

    sum();
    sum(10);
    sum(10, 20);
    sum(10, 20, 30, 40);

    methodOne(new int[] { 10, 20, 30 });// we can provide the corresponding type array as argument.

    int[] l = { 10, 20, 30 };
    int[] m = { 40, 50 };
    methodOne(l, m);
  }
}