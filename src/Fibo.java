import java.util.Scanner;

public class Fibo {

    public static void fiboInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n:");
        fibo(scan.nextInt());
    }

    public static int fibo(int n) {
        if (n == 0)
            return 0;
        else if (n == 2)
            return 2;
        return fibo(n - 1) + fibo(n - 2);
    }
}