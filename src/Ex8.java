/**
 * Created by User on 22.11.2016.
 */
public class Ex8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if(i < j) {
                    System.out.print("#\t");
                } else {
                    System.out.print(i * j + "\t");
                }
            }
            System.out.println();
        }
    }
}
