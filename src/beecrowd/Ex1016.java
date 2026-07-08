package beecrowd;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Ex1016 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  
        
        int x = 60;
        int y = 90;
        int hora = 60;
        
        int km = y/x;        
        int restoKm = y%x;
        
        int minutos = hora/restoKm;  

        
        
        int distanciaKm = scan.nextInt();
        
        int valor = distanciaKm*minutos;
        
                
        System.out.println(valor+" minutos");
       
        scan.close();
    }
    
}

