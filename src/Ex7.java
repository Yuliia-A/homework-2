import java.util.Scanner;

/**
 * Created by User on 22.11.2016.
 */
public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter final number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n+1; i++) {
            sum += i;
        }
        System.out.println("The sum arithmetic series is " + sum);
    }
}
