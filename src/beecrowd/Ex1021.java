package beecrowd;
import java.io.IOException;
import java.util.Scanner;
public class Ex1021 {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        int valor = (int) Math.round(scan.nextDouble() * 100);

        int notaCem = valor / 10000;
        int restoCem = valor % 10000;

        int notaCinq = restoCem / 5000;
        int restoCinq = restoCem % 5000;

        int notaVint = restoCinq / 2000;
        int restoVint = restoCinq % 2000;

        int notaDez = restoVint / 1000;
        int restoDez = restoVint % 1000;

        int notaCinco = restoDez / 500;
        int restoCinco = restoDez % 500;

        int notaDois = restoCinco / 200;
        int restoDois = restoCinco % 200;

        int moedaUm = restoDois / 100;
        int restoUm = restoDois % 100;

        int moeda50 = restoUm / 50;
        int restoMoeda50 = restoUm % 50;

        int moeda25 = restoMoeda50 / 25;
        int restoMoeda25 = restoMoeda50 % 25;

        int moeda10 = restoMoeda25 / 10;
        int restoMoeda10 = restoMoeda25 % 10;

        int moeda5 = restoMoeda10 / 5;
        int restoMoeda5 = restoMoeda10 % 5;

        int moeda1 = restoMoeda5 / 1;

        System.out.println("NOTAS:");
        System.out.println(notaCem + " nota(s) de R$ 100.00");
        System.out.println(notaCinq + " nota(s) de R$ 50.00");
        System.out.println(notaVint + " nota(s) de R$ 20.00");
        System.out.println(notaDez + " nota(s) de R$ 10.00");
        System.out.println(notaCinco + " nota(s) de R$ 5.00");
        System.out.println(notaDois + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        System.out.println(moedaUm + " moeda(s) de R$ 1.00");
        System.out.println(moeda50 + " moeda(s) de R$ 0.50");
        System.out.println(moeda25 + " moeda(s) de R$ 0.25");
        System.out.println(moeda10 + " moeda(s) de R$ 0.10");
        System.out.println(moeda5 + " moeda(s) de R$ 0.05");
        System.out.println(moeda1 + " moeda(s) de R$ 0.01");
    }
}
