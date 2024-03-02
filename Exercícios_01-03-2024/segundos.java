import java.util.Scanner;

/**
 * exercicios
 */
public class segundos {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int horas;
        int min;
        int seg;
        int segRes;

        System.out.println("Quantas horas são no horário atual?");
        horas = entrada.nextInt();

        System.out.println("Quantas minutos são no horário atual?");
        min = entrada.nextInt();

        System.out.println("Quantas segundos são no horário atual?");
        seg = entrada.nextInt();

        segRes = ((horas * 60)*60) + (min * 60) + seg;

        System.out.println("A quantidade de seg que se passaram desde 00:00 são " + segRes + " segundos");

        entrada.close();
        }
}