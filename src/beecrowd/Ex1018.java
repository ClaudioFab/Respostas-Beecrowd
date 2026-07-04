package beecrowd;
import java.io.IOException;
import java.util.Scanner;
public class Ex1018 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        
        int notaCem = num/100;
        int restoCem= num%100;
        
        int notaCinq = restoCem/50;
        int restoCinq = restoCem%50;
        
        int notaVint = restoCinq/20;
        int restoVint = restoCinq%20;
        
        int notaDez = restoVint/10;
        int restoDez = restoVint%10;
        
        int notaCinco = restoDez/5;
        int restoCinco = restoDez%5;
        
        int notaDois = restoCinco/2;
        int restoDois = restoCinco%2;
        
        int notaUm = restoDois/1;

        System.out.println(num);
        System.out.println(notaCem+" nota(s) de R$ 100,00");
        System.out.println(notaCinq+" nota(s) de R$ 50,00");
        System.out.println(notaVint+" nota(s) de R$ 20,00");
        System.out.println(notaDez+" nota(s) de R$ 10,00");
        System.out.println(notaCinco+" nota(s) de R$ 5,00");
        System.out.println(notaDois+" nota(s) de R$ 2,00");
        System.out.println(notaUm+" nota(s) de R$ 1,00");
    }
}
