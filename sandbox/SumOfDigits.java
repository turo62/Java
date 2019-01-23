import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num1 = in.nextInt();
        in.close();

        String str1 = Integer.toString(num1);
        
        for (int i = 0; i < str1.length(); ++i) {
            sum += Character.getNumericValue(str1.charAt(i));
        }   
        System.out.println("The sum of digits is: " + sum);
    }
}