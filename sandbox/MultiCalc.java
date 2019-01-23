import java.util.Scanner;

public class MultiCalc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = in.nextInt();

        System.out.print("Enter another number: ");
        int num2 = in.nextInt();

        System.out.println(num1 + " + " + num2 + " equals " + (num1 + num2));

        System.out.println(num1 + " - " + num2 + " equals " + (num1 - num2));
        
        System.out.println(num1 + " * " + num2 + " equals " + (num1 * num2));

        System.out.println(num1 + " / " + num2 + " equals " + (num1 / num2));

        System.out.println(num1 + " mod " + num2 + " equals " + (num1 % num2));
    }
}