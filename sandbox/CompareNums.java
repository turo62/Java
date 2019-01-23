import java.util.Scanner;

public class CompareNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = in.nextInt();
        System.out.println("Enter another number: ");
        int num2 = in.nextInt();
        in.close();

        if (num1 == num2)
            System.out.printf("%d == %d \n", num1, num2);
        if (num1 != num2)
            System.out.printf("%d != %d \n", num1, num2);
        if (num1 < num2)
            System.out.printf("%d < %d \n", num1, num2);
        if (num1 > num2)
            System.out.printf("%d > %d \n", num1, num2);
        if (num1 <= num2)
            System.out.printf("%d <= %d \n", num1, num2);
        if (num1 >= num2)
            System.out.printf("%d >= %d \n", num1, num2);
    }
}