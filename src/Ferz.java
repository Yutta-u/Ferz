import java.util.Scanner;

public class Ferz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        int a1 = scan.nextInt();
        int b1 = scan.nextInt();

        if ((a==a1||b==b1||a-a1==b-b1||a1-a==b1-b||-(a-a1)==b-b1||-(a1-a)==b1-b)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
