import java.util.Scanner;

/**
 * exercicios2
 */
public class eleicao2 {
    static Scanner entrada = new Scanner(System.in);

    public static float perguntar(String candidato){
        float votos;
        if (candidato == "brancos") {
            System.out.println("Qual o números em branco:");
            votos = entrada.nextFloat();
        }
        else if (candidato == "nulos") {
            System.out.println("Qual o números nulos:");
            votos = entrada.nextFloat();
        }
        else{
           System.out.println("Qual o números de votos do candidato:");
           votos = entrada.nextFloat(); 
        }
        
        return votos;
    }


    public static float calcularPorCento(float candidato, float t){
        float porcentagem;
        porcentagem = (candidato*100)/t;
        return porcentagem;
    }


    public static void main(String[] args) {
        float ca;
        float cb;
        float cc;
        float brancos;
        float nulos;
        float total;

        ca = perguntar("ca");
        cb = perguntar("cb");
        cc = perguntar("cc");
        brancos = perguntar("brancos");
        nulos = perguntar("nulos");

        total = ca + cb + cc + brancos + nulos;
        System.out.printf("\nO número total de eleitores é " + total + " eleitores");

        System.out.printf("\nO votos do candidato 1 equivalem a %.2f Porcento do total\n", calcularPorCento(ca, total));

        System.out.printf("\nO votos do candidato 2 equivalem a %.2f Porcento do total\n", calcularPorCento(cb, total));

        System.out.printf("\nO votos do candidato 3 equivalem a %.2f Porcento do total\n", calcularPorCento(cc, total));

        System.out.printf("\nO votos em branco equivalem a %.2f Porcento do total\n", calcularPorCento(brancos, total));

        System.out.printf("\nO votos nulos equivalem a %.2f Porcento do total\n", calcularPorCento(nulos, total));
        
        entrada.close();
    }
}
