import java.util.Scanner;

/**
 * Created by User on 22.11.2016.
 */
public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter count of the numbers: ");
        int n = sc.nextInt();
        System.out.print("Enter divider: ");
        int m = sc.nextInt();
        for (int i = 1; i < n+1; i++) {
            if(i % m == 0) {
                System.out.print(i + "\t");
            }
        }
    }
}
