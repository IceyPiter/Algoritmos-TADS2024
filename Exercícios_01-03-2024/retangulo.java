import java.util.Scanner;

/**
 * exercicios2
 */
public class retangulo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double base;
        double altura;
        double result;

        System.out.println("Qual o tamanho da base?");
        base = entrada.nextInt();

        System.out.println("Qual o tamanho da altura?");
        altura = entrada.nextInt();

        result = 2*(base+altura);
        System.out.println("O perimetro desse retângulo é igual a " + result);

        result = base+altura;
        System.out.println("A area desse retângulo é igual a " + result);
        
        entrada.close();
    }
}
