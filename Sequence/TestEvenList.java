package Sequence;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestEvenList {
 public static void main(String args[]) {
  List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

  EvenList<Integer> myList = new EvenList(list);

  Iterator<Integer> iter = myList.iterator();
  while (iter.hasNext()) {
   System.out.println(iter.next());
  }
 }
}


