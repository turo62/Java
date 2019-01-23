import java.util.Scanner;
import java.math.*;

public class DistanceOnEarth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the latitude of coordinate 1: ");
        double lat1 = input.nextDouble();
        System.out.println("Input the longitude of coordinate 1: ");
        double lon1 = input.nextDouble();
        System.out.println("Input the latitude of coordinate 2: ");
        double lat2 = input.nextDouble();
        System.out.println("Input the longitude of coordinate 2: ");
        double lon2 = input.nextDouble();
        System.out.println("Distance between places is " + distOnEarth(lat1, lon1, lat2, lon2));
        input.close();
    }

    public static double distOnEarth(double lat1, double lon1, double lat2, double lon2) {
        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);
        double r = 6371.01; 
        return (r * Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2)));
    }
}