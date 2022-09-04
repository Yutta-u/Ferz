import java.util.Scanner;

public class TwoBoxes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a1 = scan.nextInt();
        int b1 = scan.nextInt();
        int c1 = scan.nextInt();

        int a2 = scan.nextInt();
        int b2 = scan.nextInt();
        int c2 = scan.nextInt();

        if (a1 == c2 && b1 == b2 && c1 == a2 || a1 == a2 && b1 == b2 && c1 == c2) {
            System.out.println("Boxes are equal");
        } else if ((a1 + b1 + c1) > (a2 + b2 + c2)) {
            System.out.println("The first box is larger than the second one");
        } else if ((a1 + b1 + c1) < (a2 + b2 + c2)) {
            System.out.println("The first box is smaller than the second one");
        } else {
            System.out.println("Boxes are incomparable");
        }

    }
}
