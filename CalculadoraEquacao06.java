import java.util.Scanner;

public class CalculadoraEquacao06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bem vindo a calculadora de equações de segundo grau, antes de começarmos porfavor, informe seu nome");
        String usuario = teclado.nextLine();

        // Solicitando os coeficientes a, b e c ao usuário
        System.out.println(usuario + ", informe o valor de a: (somente números)");
        double a = teclado.nextDouble();

        System.out.println(usuario + ", informe o valor de b: (somente números)");
        double b = teclado.nextDouble();

        System.out.println(usuario + ", informe o valor de c: (somente números)");
        double c = teclado.nextDouble();

        // Calculando o discriminante (delta)
        double delta = b * b - 4 * a * c;

        // Calculando as duas raízes
        double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
        double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);


        System.out.println(usuario + ", as raízes da sua equação são:");
        System.out.println("Raiz 1: " + raiz1);
        System.out.println("Raiz 2: " + raiz2);


        teclado.close();
    }
}
