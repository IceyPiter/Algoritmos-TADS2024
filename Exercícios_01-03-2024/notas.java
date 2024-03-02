import java.util.Scanner;

/**
 * exercicios2
 */
public class notas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double raio;
        double result;

        System.out.println("Qual o tamanho do raio do circulo?");
        raio = entrada.nextInt();

        result = (2*3.14)*raio;
        System.out.println("O perimetro desse circulo é igual a " + result);

        result = 3.14*Math.pow(raio,2);
        System.out.println("A area desse circulo é igual a " + result);
        
        entrada.close();
    }
}
