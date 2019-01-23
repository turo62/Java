import java.util.Scanner;

public class Average {
    public static void main(String[] args)   {
        double num = 0;
        double x = 1;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number(n) you want to calculate the average: ");
        int n = sc.nextInt();
        sc.close();

        while (x <= n) {
            System.out.println("Input number " + "(" + (int) x + ")" + ": ");
            num += sc.nextInt();
            x += 1;
        }
        double avgn = num / n;

        System.out.println("Average is " + avgn);
    }
}