import java.util.Scanner;

import javax.swing.plaf.basic.BasicComboBoxUI.FocusHandler;

import java.util.Random;
import java.io.BufferedReader;
import java.io.FileReader;

//main class 
public class GuessStateCapital {

  // Store all states and their capitals in a two dimensional array
  private static String[][] stateCapitals = new String[50][2];;

  // main method
  public static void main(String[] args) throws Exception {

    String userin;
    System.out.println("How many questions would you like?");
    // System.out.println("The value of n is " + n);
    // read state and capital from text file
    try (Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(new BufferedReader(new FileReader("states.txt")))) {
      int k = 0;
      int n = Integer.parseInt(input.nextLine());
      while (sc.hasNextLine()) {
        String[] line = sc.nextLine().trim().split(",");
        for (int j = 0; j < line.length; j++) {
          stateCapitals[k][j] = line[j].trim();
        }
        k++;
      }

      int row = 0;
      for (String[] i : stateCapitals) {
        System.out.print(row + " ");
        for (String j : i) {
          System.out.print(j + " ");
        }
        row++;
        System.out.println();
      }

      int count = 0, totalaskques = n;
      while (true) {
        if (n == 0) {
          System.out.println("Do you want to play again y(yes) or n(no)");
          userin = input.nextLine();
          do {
            if (userin.equalsIgnoreCase("y")) {
              System.out.println("How many questions would you like?");
              n = Integer.parseInt(input.nextLine());
              if (n == 0) {
                System.out.println("You got " + count + " correct answers out of " + totalaskques + ".");
                return;
              }
              totalaskques = totalaskques + n;
              break;
            } else if (userin.equalsIgnoreCase("n")) {
              // Displays the total correct anwsers
              System.out.println("You got " + count + " correct answers out of " + totalaskques + ".");
              return;
            } else {
              System.out.println("Please enter y(yes) or n(no)");
              userin = input.nextLine();
            }
          } while (true);

        }

        Random rand = new Random();
        int sel = rand.nextInt(28);
        System.out.println("The value of sel is " + sel);
        // Prompt user for capital for a state
        System.out.println("What is the capital of " + stateCapitals[sel][0] + "?");
        // System.out.println("hi");
        userin = input.nextLine();
        System.out.println(userin);
        // Displays the answer if correct
        if (userin.equalsIgnoreCase(stateCapitals[sel][1])) {
          System.out.println("You answer is correct.");
          count++;
        }
        // Display not correct and gives the correct answer
        else
          System.out.println("The correct answer should be " + stateCapitals[sel][1]);
        n--;
      }
    }
  }

  public static int n() {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    input.close();
    return n;
  }

}