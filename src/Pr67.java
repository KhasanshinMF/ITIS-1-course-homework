import java.util.Scanner;


public class Pr67 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x > 99){
            x -= 1;
            System.out.println(x);
        }
    }
}
