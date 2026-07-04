package beecrowd;
import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Ex1006 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        double notaA = scan.nextDouble();
        double notaB = scan.nextDouble();
        double notaC = scan.nextDouble();
        double pesoA = 2;
        double pesoB = 3;
        double pesoC = 5;
        double somaPeso = pesoA+pesoB+pesoC;
        double media = (notaA*2 + notaB*3 + notaC*5) /somaPeso;
        DecimalFormat df1 = new DecimalFormat("0.0");
        System.out.println("MEDIA = "+df1.format(media));
    }
}