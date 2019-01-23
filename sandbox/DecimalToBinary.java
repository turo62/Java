import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args){
        int decimal1;
        int i = 0, remainder = 0;
        int[] sum = new int[20];
        Scanner in = new Scanner(System.in);

        System.out.print("Input a decimal number: ");
        decimal1 = in.nextInt();
        in.close();
 
        while (decimal1 != 0) {
            sum[i++] = decimal1 % 2;
            decimal1 = decimal1 / 2;
        }

        if (remainder != 0) {
            sum[i++] = remainder;
        }

        --i;
               
        while (i >= 0) {
            System.out.print(sum[i--]);
        }
        System.out.print("\n");  
    }
}