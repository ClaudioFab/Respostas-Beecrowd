package beecrowd;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Ex1009 {
    public static void main(String[] args) throws IOException {
        DecimalFormat df2 = new DecimalFormat("0.00");
        Scanner scan = new Scanner(System.in);
        String nome = scan.next();
        double salarioFixo = scan.nextDouble();
        double totalVendas = scan.nextDouble();
        double finalMes = salarioFixo+(totalVendas *0.15);
        System.out.println("TOTAL = R$ "+df2.format(finalMes));
    }
}