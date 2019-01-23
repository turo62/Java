import java.util.Scanner;

public class BinaryToDec2 {
    public static void main(String[] args){
        int bin_num, dec_num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        bin_num = sc.nextInt();
        String b = Integer.toString(bin_num);
        int c = b.length();
        
        for (int i = 0; i < b.length(); ++i) {
            dec_num += Character.getNumericValue(b.charAt(i)) * Math.pow(2, (c -1 - i));
        }   
        System.out.println("Decimal number of binary " + bin_num + " is " + dec_num);  
        sc.close();
    }
}