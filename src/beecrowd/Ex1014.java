//Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em Km)
//e o total de combustível gasto (em litros).

//Entrada
//O arquivo de entrada contém dois valores: um valor inteiro X representando a distância total percorrida (em Km)
//e um valor real Y representando o total de combustível gasto, com um dígito após o ponto decimal.
//
//Saída
//Apresente o valor que representa o consumo médio do automóvel com 3 casas após a vírgula, seguido da mensagem "km/l".

package beecrowd;
import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Ex1014 {
    public static void main(String[] args) {
        DecimalFormat df3 = new DecimalFormat("0.000");
        Scanner scan = new Scanner(System.in);  
        
        System.out.print("valor de X (em Km): ");
        int x = scan.nextInt();
        
        System.out.print("valor de Y (em litros): ");
        double y = scan.nextDouble();
                
        double media = (x + y) / 2;
        
        System.out.println(df3.format(media)+" km/l");
        
  
    }
    
    
}
