
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please enter number:");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        System.out.println(diff21(n));




    }
    public static int diff21(int n) {
        int a = n-21;
        int b = 2*(n-21);
        if (n>=21){
            return b;
        }else {
            return a;
        }
    }
}
