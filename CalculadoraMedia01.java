import java.util.Scanner;

public class CalculadoraMedia01 {

    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        System.out.println("Bem vindo a calculadora de média de numeros inteiros, antes de começarmos porfavor, informe seu nome");
        String usuario = Teclado.nextLine();

        System.out.println(usuario + ", informe o primeiro valor (apenas números)");
        int primeiraNota = Teclado.nextInt();

        System.out.println(usuario + ", informe o segundo valor (apenas números)");
        int segundaNota = Teclado.nextInt();

        System.out.println(usuario + ", informe o terceiro valor (apenas números)");
        int terceiraNota = Teclado.nextInt();

        int mediaNotas = (primeiraNota + segundaNota + terceiraNota);
        System.out.println(usuario + ", a média dos valores é:" + mediaNotas / 3);

        Teclado.close();
    }
}