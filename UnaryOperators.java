public class UnaryOperators { 
    public static void main(String[] args) {
        int num = 5;
        System.out.println("Original number: " + num);
        System.out.println("Prefix Increment: " + (++num));
        System.out.println("Postfix Increment: " + (num++));
        System.out.println("After Postfix Increment: " + num);
        System.out.println("Prefix Decrement: " + (--num));
        System.out.println("Postfix Decrement: " + (num--));
        System.out.println("After Postfix Decrement: " + num);
    }
}
