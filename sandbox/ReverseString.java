import java.util.Scanner;

public class ReverseString {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence to reverse: ");
        String str = sc.nextLine();
        System.out.println(str);
        str = reverse(str);
		System.out.println("Reverse of the given string is : " + str);
    }
	
    private static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
