public class Swap {
    public static void main(String[] args) {
        int a, b, temp;
        a = 23;
        b = 91;
        System.out.println("Numbers before swapping: a, b =  " + a + ", " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("Numbers after swapping: a, b =  " + a + ", " + b);
    }
}