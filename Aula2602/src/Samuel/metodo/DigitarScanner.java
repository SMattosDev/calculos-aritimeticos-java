
package Samuel.metodo;

import java.util.Scanner;


public class DigitarScanner {
    
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor");
        int value1 = x.nextInt();
        
         System.out.println("Digite o segundo valor");
        int value2 = x.nextInt();
        
        int resultado = value1 + value2;
        
        System.out.println("O valor da soma é : " + resultado);
        
    }
}
