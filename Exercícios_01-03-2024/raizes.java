import java.util.Scanner;

/**
 * exercicios2
 */
public class raizes {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double num;
        double quadrado;
        double cubico;

        System.out.println("Qual número deseja?");
        num = entrada.nextInt();

        quadrado = Math.sqrt(num);
        cubico = Math.cbrt(num);

        System.out.println("O número " + num + " em raiz quadrada é igual a " + quadrado + ", e em raiz cubica é igual a " + cubico);
        entrada.close();
    }
}
