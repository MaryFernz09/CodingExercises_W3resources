package CodingExercises_W3resources;

public class ExercisesBasic {

  public static void main(String[] args) {
    //printName("Mary J. Fernandes");
    //System.out.println(printSum(3, 5));
    //printResults();
    // productOfTwoNumbers(5, 25);
    //simpleCalculations(125, 24);
    //multiplicationTable(8);
    //printJava();
    //printOutput();
    //printSpecifiedFormula();
    //printAreaAndPerimenterOfACircle(7.5);
    //averageOfThreeNumbers(10, 20, 30);
    //printAreaAndPerimeterOfRect(5.6, 8.5);
    //swapVariables();
    //checkJavaVersion();
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

  /*6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers */
  public static void simpleCalculations(int a, int b) {
    System.out.println(a + " + " + b + " = " + (a + b));
    System.out.println(a + " - " + b + " = " + (a - b));
    System.out.println(a + " * " + b + " = " + (a * b));
    System.out.println(a + " / " + b + " = " + (a / b));
    System.out.println(a + " mod " + b + " = " + (a % b));
  }

  /*7. Write a Java program that takes a number as input and prints its multiplication table up to 10. */

  public static void multiplicationTable(int multiple) {
    for (int i = 1; i <= 10; i++) {
      System.out.println(multiple + " x " + i + " = " + (multiple * i));
    }
  }

  /*8. Write a Java program to display the following pattern. */
  public static void printJava() {
    System.out.println("   J    a   v     v  a ");
    System.out.println("   J   a a   v   v  a a");
    System.out.println("J  J  aaaaa   V V  aaaaa");
    System.out.println(" JJ  a     a   V  a     a");
  }

  /*9. Write a Java program to compute the specified expressions and print the output. ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) */

  public static void printOutput() {
    double ans = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
    System.out.println(ans);
  }

  /* 10. Write a Java program to compute a specified formula. */
  public static void printSpecifiedFormula() {
    double ans =
      4.0 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11));
    System.out.println(ans);
  }

  /*11. Write a Java program to print the area and perimeter of a circle. */

  public static void printAreaAndPerimenterOfACircle(double radius) {
    //perimeter
    double perimeter = 2 * Math.PI * radius;
    //Area
    double area = Math.PI * radius * radius;

    System.out.println("Perimeter is = " + perimeter);
    System.out.println("Area is = " + area);
  }

  /*12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers. */

  public static void averageOfThreeNumbers(int a, int b, int c) {
    int avg = (a + b + c) / 3;

    System.out.println(avg);
  }

  /*13. Write a Java program to print the area and perimeter of a rectangle. */
  public static void printAreaAndPerimeterOfRect(double width, double height) {
    //perimeter
    double perimeter = 2 * width * height;
    //Area
    double area = width * height;

    System.out.println("Perimeter is = " + Math.round(perimeter));
    System.out.println("Area is = " + Math.round(area));
  }

  /*15. Write a Java program to swap two variables. */
  public static void swapVariables() {
    //With temp variable
    int a = 10;
    int b = 20;
    System.out.println("Before Swapping");
    System.out.println("a =" + a);
    System.out.println("b =" + b);
    int tempVar = a;

    a = b;
    b = tempVar;
    System.out.println("After Swapping");
    System.out.println("a =" + a);
    System.out.println("b =" + b);

    //without temp variable
    int c = 10;
    int d = 20;
    System.out.println("Before Swapping");
    System.out.println("c =" + c);
    System.out.println("d =" + d);

    c = c + d;
    d = c - d;
    c = c - d;

    System.out.println("After Swapping");
    System.out.println("c =" + c);
    System.out.println("d =" + d);
  }

  /*31. Write a Java program to check whether Java is installed on your computer.*/

  public static void checkJavaVersion() {
    System.out.println("Java Version: " + System.getProperty("java.version"));
    System.out.println(
      "Java Runtime Version: " + System.getProperty("java.runtime.version")
    );
    System.out.println("Java Home: " + System.getProperty("java.home"));
    System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
    System.out.println(
      "Java Vendor URL: " + System.getProperty("java.vendor.url")
    );
    System.out.println(
      "Java Class Path: " + System.getProperty("java.class.path")
    );
  }
}
