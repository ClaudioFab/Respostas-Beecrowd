
package beecrowd;
import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Ex1014 {
    
    public static void main(String[] args) throws IOException {
        
        DecimalFormat df3 = new DecimalFormat("0.000");
        
        Scanner scan = new Scanner(System.in);  
        
        int x = scan.nextInt();

        double y = scan.nextDouble();
                        
        double media = x / y;
        
        System.out.println(df3.format(media)+" km/l");
        
        scan.close();
    }

}
