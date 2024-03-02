import java.util.Scanner;

/**
 * exercicios2
 */
public class circulo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double n1;
        double n2;
        double n3;
        double result;

        System.out.println("Qual a primeira nota?");
        n1 = entrada.nextInt();
        
        System.out.println("Qual a segunda nota?");
        n2 = entrada.nextInt();

        System.out.println("Qual a terceira nota?");
        n3 = entrada.nextInt();

        result = (n1*2 + n2*3 + n3*5)/2 + 3 + 5;
        System.out.println("A nota final é igual a " + result);
        
        entrada.close();
    }
}
