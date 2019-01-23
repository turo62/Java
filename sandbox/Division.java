import java.util.Scanner;

public class Division {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter your first number: ");
        int a = input.nextInt();
        System.out.print("Enter your second number: ");
        int b = input.nextInt();
        int div = a / b;
        System.out.println();
        System.out.println("The result of division a by b is: " + div);
    }
}