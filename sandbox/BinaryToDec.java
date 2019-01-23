import java.util.Scanner;

public class BinaryToDec {
    public static void main(String[] args){
        int bin_num;
        int i = 0, dec_num = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("Input a binary number: ");
        bin_num = in.nextInt();
        in.close();

        while (bin_num  != 0) {
            if (bin_num % 10 > 0) {
                dec_num += Math.pow(2, i);
                bin_num = bin_num / 10;
                ++i;
            }
            else {
                bin_num = bin_num / 10;
                ++i;
            }
        }   
        System.out.println(dec_num);  
    }
}