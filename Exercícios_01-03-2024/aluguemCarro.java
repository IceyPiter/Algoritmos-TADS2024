import java.util.Scanner;

/**
 * exercicios2
 */
public class aluguemCarro {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double distancia;
        double dias;
        double result;

        System.out.println("Qual a distância percorrida?");
        distancia = entrada.nextInt();

        System.out.println("Quantos dias se passaram?");
        dias = entrada.nextInt();

        result = distancia*0.15 + dias*60;

        System.out.println("O preço a pagar é R$ " + result);
        entrada.close();
    }
}
