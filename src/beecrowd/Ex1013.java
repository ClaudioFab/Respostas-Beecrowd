package beecrowd;
import java.io.IOException;
import java.util.Scanner;
public class Ex1013 {
    public static void main(String[] args) throws IOException {
        
        Scanner scan = new Scanner(System.in);  
        
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
                
        if(A > B && A > C){
            int valor=A;
            System.out.println(valor+" eh o maior");
        }else if(B > A || B > C){
            int valor=B;
            System.out.println(valor+" eh o maior");
        }else{
            int valor=C;
            System.out.println(valor+" eh o maior");
        }

        scan.close();

    }
 
}
