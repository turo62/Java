import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args){
        int oct_num, dec_num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a octal number: ");
        oct_num = sc.nextInt();
        String b = Integer.toString(oct_num);
        int c = b.length();
        sc.close();
        
        for (int i = 0; i < b.length(); ++i) {
            dec_num += Character.getNumericValue(b.charAt(i)) * Math.pow(8, (c -1 - i));
        }   
        System.out.println("Decimal number of octal " + oct_num + " is " + dec_num);  
    }
}