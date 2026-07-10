package beecrowd;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Ex1021 {
    public static void main(String[] args) throws IOException {
        DecimalFormat df2 = new DecimalFormat("0.00");
        
        Scanner scan = new Scanner(System.in);  
        
        double valor = scan.nextDouble();
       
        
        
        
        
        
        System.out.println("valor: "+df2.format(valor));
    }
}
