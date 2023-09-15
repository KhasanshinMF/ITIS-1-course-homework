import java.util.Scanner;


public class Pr47 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = x % 10 * 10 + x / 10 + 8;
        System.out.println(y);
    }
}
