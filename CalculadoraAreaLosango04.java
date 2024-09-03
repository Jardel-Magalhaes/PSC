import java.util.Scanner;

public class CalculadoraAreaLosango04 {

    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        System.out.println("Bem vindo a calculadora da área do losango, antes de começarmos porfavor, informe seu nome");
        String usuario = Teclado.nextLine();

        System.out.println(usuario + ", informe a diagonal maior do losango (apenas números)");
        double diagonalMaior = Teclado.nextDouble();

        System.out.println(usuario + ", informe a diagonal menor do losango (apenas números)");
        double diagonalMenor = Teclado.nextDouble();

        double resultado = diagonalMaior * diagonalMenor /2;

        System.out.println(usuario + ", a área do losango é de: " + resultado);

        Teclado.close();
    }
}
