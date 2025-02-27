package Samuel.metodo;

public class Calculadora {

    int value1 = 10;
    int value2 = 10;        
    
    void adicao() {

        int resultado = value1 + value2;
        System.out.println("O valor da soma é: " + resultado);

    }
    
    void subtracao () {
        
        int resultado = value1 - value2;
        System.out.println("O valor da subtração é: " + resultado);
    }
    
     void multiplicacao() {
        
        int resultado = value1 * value2;
        System.out.println("O valor da multiplicação é: " + resultado);
     }
     
      void divisao () {
        
        int resultado = value1 / value2;
        System.out.println("O valor da divisão é: " + resultado);
      }
}
