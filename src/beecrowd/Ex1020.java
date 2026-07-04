package beecrowd;
import java.io.IOException;
import java.util.Scanner;
public class Ex1020 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);                         
        int num = scan.nextInt();    
        
        int anos = num/365;
        int restoAnos = num%365;  
        
        int meses = restoAnos/30;
        int restoMeses = restoAnos%30;   
        
        int dias = restoMeses%30;   
        
        System.out.println(anos+" ano(s)\n"+meses+" mes(es)\n"+dias+" dia(s)");
    }
}
