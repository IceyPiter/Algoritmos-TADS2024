import java.util.Scanner;

/**
 * exercicios2
 */
public class aumento {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double valor;
        double desconto;
        double result;
        double result2;

        System.out.println("Qual o salário?");
        valor = entrada.nextDouble();
        
        System.out.println("Qual a porcentagem aplicada?");
        desconto = entrada.nextDouble();

        result = valor*(desconto/100);
        System.out.println("O aumento aplicado será R$" + result);

        result2 = valor + result;
        System.out.println("O salário final é R$" + result2);
        
        entrada.close();
    }
}
