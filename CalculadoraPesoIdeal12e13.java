import java.util.Scanner;

public class CalculadoraPesoIdeal12e13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bem vindo a calculadora de peso ideal, antes de começarmos porfavor, informe seu nome");
        String usuario = teclado.nextLine();

        System.out.println(usuario + ", agora por gentileza informe seu gênero (M para masculino, F para feminino):");
        char genero = teclado.next().charAt(0);

        System.out.println(usuario + ", informe sua altura em metros (ex: 1,75):");
        double altura = teclado.nextDouble();

        double pesoIdeal;

        // Verificar o gênero e calcular o peso ideal de acordo com a fórmula
        if (genero == 'M' || genero == 'm') {
            pesoIdeal = (72.7 * altura) - 58;
            System.out.println(usuario + ", seu peso ideal é: " + pesoIdeal + " kg");
        } else if (genero == 'F' || genero == 'f') {
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println(usuario + ", seu peso ideal é: " + pesoIdeal + " kg");
        } else {
            System.out.println(usuario + ", por favor, insira 'M' para masculino ou 'F' para feminino.");
        }

        teclado.close();
    }
}
