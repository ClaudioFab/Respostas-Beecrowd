package beecrowd;
import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;
    public class Ex1002 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        
        DecimalFormat df = new DecimalFormat("0.0000");
        
        double raio = scan.nextDouble();
        
        double area = 3.14159 * (raio * raio);
        
        System.out.println("A="+df.format(area));
    }
}