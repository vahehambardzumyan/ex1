
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please enter number:");
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(sumDouble(m, n));


    }
    public static int sumDouble(int a, int b) {
        if (a==b){
            return 2*(a+b);
        }else {
            return a+b;
        }
    }
}
