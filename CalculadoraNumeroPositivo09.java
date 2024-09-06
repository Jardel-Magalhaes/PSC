import java.util.Scanner;

public class CalculadoraNumeroPositivo09 {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        System.out.println("Bem vindo a calculadora de números positivos, antes de começarmos porfavor, informe seu nome");
        String usuario = Teclado.nextLine();

        System.out.println(usuario + ", informe um número positivo:");
        double numero = Teclado.nextDouble();

        // Verificando se o número é positivo
        if (numero > 0) {
            // Calculando o quadrado
            double aoQuadrado = Math.pow(numero, 2);
            // Calculando o cubo
            double aoCubo = Math.pow(numero, 3);
            // Calculando a raiz quadrada
            double raizQuadrada = Math.sqrt(numero);
            // Calculando a raiz cúbica
            double raizCubica = Math.cbrt(numero);
            System.out.println(usuario + ", segue abaixo o resultado do cálculo solicitado");
            System.out.println("Número ao quadrado: " + aoQuadrado);
            System.out.println("Número ao cubo: " + aoCubo);
            System.out.println("Raiz quadrada: " + raizQuadrada);
            System.out.println("Raiz cúbica: " + raizCubica);
        } else {
            System.out.println(usuario + ", por favor, insira um número positivo.");
        }

        Teclado.close();
    }
}