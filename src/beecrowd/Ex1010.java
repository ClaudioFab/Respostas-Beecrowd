package beecrowd;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Ex1010 {
    public static void main(String[] args) throws IOException {
        DecimalFormat df2 = new DecimalFormat("0.00");
        Scanner scan = new Scanner(System.in);
        int p1 = scan.nextInt();
        int numP1 = scan.nextInt();
        double valorP1 = scan.nextDouble();
        int p2 = scan.nextInt();
        int numP2 = scan.nextInt();
        double valorP2 = scan.nextDouble();
        double multiP1 = numP1 * valorP1;
        double multiP2 = numP2 * valorP2;
        double total = multiP1+multiP2;
        System.out.println("VALOR A PAGAR: R$ "+df2.format(total));
    }
}