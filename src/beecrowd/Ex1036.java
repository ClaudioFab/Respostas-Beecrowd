package beecrowd;
import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Ex1036 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df5 = new DecimalFormat("0.00000");
        
        double A = scan.nextDouble();
        
        double B = scan.nextDouble();
        
        double C = scan.nextDouble();
        
        
        //Delta
        double delta = (B*B) - (4 * A * C);
        
        
        if(A == 0 || delta < 0){
            System.out.println("Impossivel calcular");   
        }else{
            // algum calculo de raíz
            // segundo calculo de raíz
            
            //System.out.println("R1 = "+df5.format(resultadoA));
            //System.out.println("R2 = "+df5.format(resultadoB));
        }
    }
}
