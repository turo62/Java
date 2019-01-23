import java.util.Scanner;
import java.math.*;

public class PolygonArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of side: ");
        int side = input.nextInt();
        System.out.println("Enter the number of sides: ");
        double numOfSides = input.nextDouble();
        System.out.println("Area of the polygon is " + calcPoly(side, numOfSides));
        input.close();
    }

    public static double calcPoly(int side, double numOfSides) {
        return (numOfSides * side * side) / (4 * Math.tan(Math.PI / numOfSides));
    }
}