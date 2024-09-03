import java.util.Scanner;

public class CalculadoraSalario07 {

    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        System.out.println("Bem vindo a calculadora de salário mínimo, antes de começarmos porfavor, informe seu nome");
        String usuario = Teclado.nextLine();

        System.out.println(usuario + ", informe o valor do salário mínimo atual (apenas números)");
        double salarioMinimo = Teclado.nextDouble();

        System.out.println(usuario + ", informe o valor do seu salário atual (apenas números)");
        double salarioFuncionario = Teclado.nextDouble();

        double resultado = (salarioFuncionario / salarioMinimo);

        System.out.println(usuario + ", atualmente você recebe " + resultado + " salários mínimos");

        Teclado.close();
    }
}
