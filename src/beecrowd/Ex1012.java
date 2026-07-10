package beecrowd;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Ex1012 {
    public static void main(String[] args) throws IOException {
        DecimalFormat df3 = new DecimalFormat("0.000");
        
        Scanner scan = new Scanner(System.in);  
        
        double A = scan.nextDouble();
        
        double B = scan.nextDouble();
        
        double C = scan.nextDouble();
        
        //área do triangulo
        double areaTri = (A * C) / 2.0;
        
        //área do círculo
        double pi = 3.14159;
        double areaCir = pi * (C * C);
        
        //área do trapezio
        double areaTra= ((A+B)*C) / 2;
        
        //área do quadrado
        double areaQua = B*B;
        
        //área do retangulo
        double areaRet = A*B;
        
        
        System.out.println("TRIANGULO: "+df3.format(areaTri));
        System.out.println("CIRCULO: "+df3.format(areaCir));
        System.out.println("TRAPEZIO: "+df3.format(areaTra));
        System.out.println("QUADRADO: "+df3.format(areaQua));
        System.out.println("RETANGULO: "+df3.format(areaRet));

    } 
}
