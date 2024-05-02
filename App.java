import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
// troca de variaveis
    Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da primeira variavel: ");
        int primeiraVariavel = sc.nextInt();

        System.out.println("Digite o valor da segunda variavel: ");
        int segundaVariavel = sc.nextInt();

        System.out.println("Valor antes de troca: ");
        System.out.println("primeiraVariavel: " + primeiraVariavel);
        System.out.println("segundaVariavel: " + segundaVariavel );

        int troca = primeiraVariavel;
        primeiraVariavel = segundaVariavel;
        segundaVariavel = troca;
        System.out.println("------------------------------");
        System.out.println("Valor apos a troca: ");
        System.out.println("primeiraVariavel: " + primeiraVariavel);
        System.out.println("segundaVariavel: " + segundaVariavel);

    }
}
