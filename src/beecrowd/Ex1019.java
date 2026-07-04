package beecrowd;
import java.io.IOException;
import java.util.Scanner;
public class Ex1019 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);                             
        int num = scan.nextInt();   
        
        int horas = num/3600;        
        int restoHoras = num%3600;  
        
        int minutos = restoHoras/60;      
        int restoMinutos = restoHoras%60;
        
        int segundos = restoMinutos;
        
        System.out.println(horas+":"+minutos+":"+segundos); 
    }
}
