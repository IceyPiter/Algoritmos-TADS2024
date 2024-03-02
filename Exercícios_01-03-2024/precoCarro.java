import java.util.Scanner;

/**
 * exercicios2
 */
public class precoCarro {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double valor;
        double result;

        System.out.println("Qual o preço do carro?");
        valor = entrada.nextDouble();

        result = valor + (0.28*valor) + (0.45*valor);
        System.out.println("O valor a pagar será R$" + result);
        
        entrada.close();
    }
}
