import java.util.Scanner;

public class DecimalToHex {
    public static void main(String[] args){
        int decimal, rem;
        String hex_dec = "";
        Scanner in = new Scanner(System.in);

        char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        
        System.out.print("Input a decimal number: ");
        decimal = in.nextInt();
 
        while (decimal != 0) {
            rem = decimal % 16;
            decimal = decimal / 16;
            hex_dec = hex[rem] + hex_dec;
        }

        System.out.println("The hexadecimal number is: " + hex_dec);
    }
}