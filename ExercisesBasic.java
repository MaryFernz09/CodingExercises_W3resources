package CodingExercises_W3resources;

public class ExercisesBasic {

  public static void main(String[] args) {
    //printName("Mary J. Fernandes");
    //System.out.println(printSum(3, 5));
    //printResults();
    productOfTwoNumbers(5, 25);
  }

  /*1. Write a Java program to print 'Hello' on screen and your name on a separate line.*/
  public static void printName(String name) {
    System.out.println("Hello");
    System.out.println(name);
  }

  /* 2. Write a Java program to print the sum of two numbers. */
  public static int printSum(int num1, int num2) {
    int ans = num1 + num2;
    return ans;
  }

  /* 4. Write a Java program to print the results of the following operations.
Test Data:
a. -5 + 8 * 6
b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3 */

  public static void printResults() {
    int a = -5 + 8 * 6;
    int b = (55 + 9) % 9;
    int c = 20 + -3 * 5 / 8;
    int d = 5 + 15 / 3 * 2 - 8 % 3;

    System.out.println("a:" + a);
    System.out.println("b:" + b);
    System.out.println("c:" + c);
    System.out.println("d:" + d);
  }

  /*Write a Java program that takes two numbers as input and displays the product of two numbers.*/

  public static void productOfTwoNumbers(int a, int b) {
    int ans = a * b;

    System.out.println(ans);
  }
}
