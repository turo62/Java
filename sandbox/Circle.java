public class Circle {
    private static final double radius = 7.5;

    public static void main(String[] args) {
        double perimeter = 2 * radius * Math.PI;
        double area = radius * radius * Math.PI;
        System.out.println("Perimeter is " + perimeter);
        System.out.println("Area is " + area);
    }
}