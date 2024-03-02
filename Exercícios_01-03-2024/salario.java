import java.util.Scanner;

/**
 * exercicios2
 */
public class salario {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double valor;
        double valor2;
        double result;

        System.out.println("Qual o salário fixo?");
        valor = entrada.nextDouble();

        System.out.println("Qual o valor total das vendas?");
        valor2 = entrada.nextDouble();

        result = valor + (0.05*valor2);
        System.out.println("O valor a pagar será R$" + result);
        
        entrada.close();
    }
}
