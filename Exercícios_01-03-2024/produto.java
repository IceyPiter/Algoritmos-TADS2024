import java.util.Scanner;

/**
 * exercicios2
 */
public class produto {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double valor;
        double desconto;
        double result;
        double result2;

        System.out.println("Qual o valor do produto?");
        valor = entrada.nextDouble();
        
        System.out.println("Qual o desconto aplicado?");
        desconto = entrada.nextDouble();

        result = valor*(desconto/100);
        System.out.println("O desconto aplicado será R$" + result);

        result2 = valor - result;
        System.out.println("O valor a pagar é R$" + result2);
        
        entrada.close();
    }
}
