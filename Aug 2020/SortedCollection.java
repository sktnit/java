import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class SortedCollection {

  // PriorityQueue is used as a collection to store the integer element in sorted
  // order
  private PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

  // add function after adding return true
  public boolean add(int n) {
    pQueue.add(n); // add n into collection
    return true;
  }

  // remove is used to remove first element from collection and return it
  public int remove() throws NoSuchElementException {
    int top = pQueue.poll(); // retrives first element and removes from the collection
    return top;
  }

  // command line usage for the user
  public static void showUsage() {
    System.out.println("Usage: java SortedCollection [num1] [num2] [num3] ...");
  }

  public static void main(String[] args) throws NumberFormateException{
    SortedCollection collection = new SortedCollection();

    // in case no arguments show usage to user
    if (args.length == 0) {
      showUsage();
      return;
    }

    
      for (int i = 0; i < args.length; i++) {
        collection.add(Integer.valueOf(args[i])); // first read the arguments as an integer and then call add function
                                                  // of SortedCollection class.
      }
      System.out.println("Please enter the Number as an argument");
      showUsage();

    System.out.print("sorted: ");
    for (int i = 0; i < args.length; i++) {
      int num = collection.remove();
      System.out.print(num + " ");
    }
    System.out.println();
  }
}
