import java.util.Scanner;
public class PS002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit up to which you want multiples of 100: ");
        int limit = scanner.nextInt();
        System.out.println("Multiples of 100 up to " + limit + ":");
        for (int i = 100; i <= limit; i += 100) {
            System.out.println(i);
        }
        scanner.close();
    }
}
