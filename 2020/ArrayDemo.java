// 1. array

// indexed collection of fixed number of homogeneous data elements
// Fixed in size. We can resolve this problem by using collections.

// 1. 1D Arrays
// Array Declaration int[] a
// Array Construction int[] a=new int[3];
class ArrayDemo {
  public static void main(String[] args) {
    int[] a = new int[3];
    // int[] a=new int[];//Compile time error: array dimension missing

    int[] b = new int[0];
    System.out.println(b.length);// 0

    // int[] c = new int[-3];// R.E
    // int[] a=new int['a']; //valid

    // The maximum allowed array size in java is maximum value of int size.
    // long l = 10L;
    // int[] arr = new int[l]; //possible lossy conversion from long to int
    // int[] a2 = new int[2147483648]; // error: integer number too large:
    // 2147483648

    System.out.println(a);// Output: [I + @3e25a5(Hash value)
    System.out.println(a[0]);// 0

    // Array Initialization

  }
}

// 2. Multidimensional Array
class ArrayDemo2 {
  public static void main(String[] args) {
    int[][] a = { { 1, 2, 3 }, { 90, 127, 30 }, { 29, 15, 30 } };
    for (int[] i : a) {
      for (int j : i) {
        System.out.println(j);
      }
    }

    int[][] b = new int[2][];
    System.out.println(b);// [[I@3e25a5
    System.out.println(b[0]);// null
    // System.out.println(b[0][0]);// R.E:NullPointerException
    b[0] = new int[3];
    b[1] = new int[2];
    System.out.println(b[0][0]);// 0

    int[][][] c = new int[2][][];
    c[0] = new int[3][];
    c[0][0] = new int[1];
    c[0][1] = new int[2];
    c[0][2] = new int[3];
    c[1] = new int[2][2];

    // int[][] a=new int[][4]; //Compile Time Error
    // int[][][] a=new int[3][][5]; // Compile time error

  }
}

// length vs length()

// length: final variable represents the size of the array and applicable only
// for arrays

// length(): final method applicable for String objects and returns the no of
// characters present in the String.

class Test {
  public static void main(String[] args) {
    int[] x = new int[3];
    // System.out.println(x.length());// C.E: cannot find symbol
    System.out.println(x.length);// 3

    String s = new String("Shailesh");
    // System.out.println(s.length);// C.E:cannot find symbol
    System.out.println(s.length());// 8

    int[][] a = new int[6][3];
    System.out.println(a.length);// 6
    System.out.println(a[0].length);// 3
    System.out.println("Total number of elements in array are: " + a.length * a[0].length);
  }
}

// Anonymous arrays: array without name
class Demo {
  public static void main(String[] args) {
    System.out.println(sum(new int[] { 10, 20, 30, 40 }));// 100
  }

  public static int sum(int[] x) {
    int total = 0;
    for (int x1 : x) {
      total = total + x1;
    }
    return total;
  }
}

// Object type arrays: we can provide either declared type
// objects or its child class objects.

class Demo2 {
  public static void main(String[] args) {
    Object[] a = new Object[10];
    a[0] = new Integer(10);// (valid)
    a[1] = new Object();// (valid)
    a[2] = new String("bhaskar");// (valid)

    Number[] n = new Number[10];
    n[0] = new Integer(10);// (valid)
    n[1] = new Double(10.5);// (valid)
    // n[2] = new String("bhaskar");// C.E:incompatible types//(invalid)
  }
}

// Array variable assignments
class Test2 {
  public static void main(String[] args) {
    int[] a = { 10, 20, 30 };
    char[] ch = { 'a', 'b', 'c' };
    int[] b = a;// (valid)
    // int[] c = ch;// C.E:incompatible types(invalid)

    // In the case of object type arrays child type array can be assign to parent
    // type array variable
    String[] s = { "A", "B" };
    Object[] o = s;
  }
}

class Test3 {
  public static void main(String[] args) {
    // String[] argh = { "A", "B" };
    // args = argh;
    System.out.println(args.length);// 2
    // for (int i = 0; i < args.length; i++)
    // System.out.println(args[i]);
    for (String s : args) {
      System.out.println(s);
    }
  }
}