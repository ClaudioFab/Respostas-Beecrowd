package beecrowd;
import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Ex1005 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        double A = scan.nextDouble();
        double B = scan.nextDouble();
        double notaA = 3.5;
        double notaB = 7.5;
        double somaNota = notaA + notaB;
        double media = (A * 3.5 + B * 7.5) / 11;
        DecimalFormat df5 = new DecimalFormat("0.00000");
        System.out.println("MEDIA = "+df5.format(media));
    }
}