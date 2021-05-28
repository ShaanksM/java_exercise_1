import java.util.Scanner;

public class Launcher {

    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Fibo ou quit ?");
            String strInput = scan.nextLine();
            if ("quit" .equals(strInput) || "Quit" .equals(strInput))
                break;
            else if ("fibo".equals(strInput) || "Fibo".equals(strInput))
                Fibo.fiboInput();
            else
                System.out.println("Tu veux apprendres à lire ? ");
        }
    }
}