import java.util.Scanner;

public class CalculadoraNumeroInteiro11{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bem vindo ao algoritmo de informações numéricas, antes de começarmos porfavor, informe seu nome");
        String usuario = teclado.nextLine();

        System.out.println(usuario + ", informe um número inteiro:");
        int numero = teclado.nextInt();

        int antecessor = numero - 1;
        int sucessor = numero + 1;
        int dobro = numero * 2;
        double metade = numero / 2;

        System.out.println(usuario + ", segue abaixo o resultado: " + "\n" + "antecessor: " + antecessor + "\n"
                + "sucessor: " + sucessor + "\n"
                + "dobro: " + dobro + "\n"
                + "metade: " + metade + "\n");

        teclado.close();
    }
}
