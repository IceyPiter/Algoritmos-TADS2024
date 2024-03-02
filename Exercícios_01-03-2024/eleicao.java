import java.util.Scanner;

/**
 * exercicios2
 */
public class eleicao {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double ca;
        double cb;
        double cc;
        double brancos;
        double nulos;
        double total;
        double total2;
        double total3;
        double total4;
        double total5;
        double total6;

        System.out.println("Qual o números de votos para o Candidato 1?");
        ca = entrada.nextDouble();
        
        System.out.println("Qual o números de votos para o Candidato 2?");
        cb = entrada.nextDouble();

        System.out.println("Qual o números de votos para o Candidato 3?");
        cc = entrada.nextDouble();

        System.out.println("Qual o números de votos em branco?");
        brancos = entrada.nextDouble();

        System.out.println("Qual o números de votos em nulos?");
        nulos = entrada.nextDouble();

        total = ca + cb + cc + brancos + nulos;
        System.out.println("\nO número total de eleitores é " + total + " eleitores");

        total2 = (ca*100)/total;
        System.out.println("\nO votos do candidato 1 equivalem a " + total2 + "% do total");

        total3 = (cb*100)/total;
        System.out.println("\nO votos do candidato 2 equivalem a " + total3 + "% do total");

        total4 = (cc*100)/total;
        System.out.println("\nO votos do candidato 3 equivalem a " + total4 + "% do total");

        total5 = (brancos*100)/total;
        System.out.println("\nO votos em branco 1 equivalem a " + total5 + "% do total");

        total6 = (nulos*100)/total;
        System.out.println("\nO votos nulos 1 equivalem a " + total6 + "% do total");
        
        entrada.close();
    }
}
