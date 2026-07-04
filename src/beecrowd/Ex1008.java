package beecrowd;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Ex1008 {
    public static void main(String[] args) throws IOException {
        DecimalFormat df2 = new DecimalFormat("0.00");
        Scanner scan = new Scanner(System.in);
        int NUMBER = scan.nextInt();
        int horasTrab = scan.nextInt();
        double valorHora = scan.nextDouble();
        double SALARY = valorHora * horasTrab;
        System.out.println("NUMBER = "+NUMBER);
        System.out.println("SALARY = U$ "+df2.format(SALARY));
    }
}