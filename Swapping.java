public class Swapping {
    public static void main(String[] args) {
        int a = 7;
        int b = 8;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
