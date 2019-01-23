import java.util.Scanner;

class myClass {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.print("Enter your name: ");
    String name = input.next();
    System.out.println();
    System.out.println("Hello \n" + name);
 }
}