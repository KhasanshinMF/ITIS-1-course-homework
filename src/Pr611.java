import java.util.Scanner;


public class Pr611 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        if (x > 0 && y > 0 || x < 0 && y < 0) {
            System.out.println("Один и тот же знак");
        } else if (x == 0 || y == 0) {
            System.out.println("Некорректно");
        } else {
            System.out.println("Разные знаки");
        }
    }
}
