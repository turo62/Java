import java.util.Scanner;
import java.math.*;

public class HexagonArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the side: ");
        double side = in.nextInt();
        System.out.println("Area of hexagon is " + calcHex(side));
        in.close();
    }
    
    public static double calcHex(Double side){
        return (6 * side * side) / (4 * Math.tan(Math.PI / 6));
    }
}