import java.util.Scanner;

/**
 * exercicios2
 */
public class boleto {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double valor;
        double juros;
        double dias;
        double result;

        System.out.println("Qual o valor do boleto?");
        valor = entrada.nextDouble();
        
        System.out.println("Qual a porcentagem de juros aplicada?");
        juros = entrada.nextDouble();

        System.out.println("Qual o número de dias atrasados?");
        dias = entrada.nextDouble();

        result = valor + valor * (juros/100) * dias;
        System.out.println("O valor a pagar será R$" + result);
        
        entrada.close();
    }
}
