package beecrowd;
import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Ex1015 {
    public static void main(String[] args) throws IOException {
        
        DecimalFormat df4 = new DecimalFormat("0.0000");
        
        Scanner scan = new Scanner(System.in);  
        
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();

        //Math.sqrt = calcula raiz quadrada
        //Math.pow = calcula potencia
        
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println(df4.format(distancia));
    }
}
