package beecrowd;
import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Ex1017 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in); 
        DecimalFormat df3 = new DecimalFormat("0.000");

        System.out.print("tempo gasto na viagem (em horas): ");
        int tempoHoras = scan.nextInt();
        
        
        System.out.print("velocidade média durante a mesma (em km/h): ");
        int velocidadeKM = scan.nextInt();
        

        double distanciaMedia = (tempoHoras + velocidadeKM)/2;
        
        double mediaFinal = distanciaMedia/12;
        
        System.out.println(df3.format(mediaFinal));
        
        
    }
}
