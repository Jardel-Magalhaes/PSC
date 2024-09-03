import java.util.Scanner;

public class CalculadoraIdade02 {

    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        System.out.println("Bem vindo a calculadora de idade atual e idade futura, antes de começarmos porfavor, informe seu nome");
        String usuario = Teclado.nextLine();

        System.out.println(usuario + ", informe o seu ano de nascimento com 4 números");
        double anoNascimento = Teclado.nextDouble();

        System.out.println(usuario + ", informe o ano atual com 4 números");
        double anoAtual = Teclado.nextDouble();

        System.out.println(usuario + ", informe o ano do qual deseja saber sua idade com 4 números");
        double anoFuturo = Teclado.nextDouble();

        double idadeAtual = (anoAtual - anoNascimento);
        System.out.println(usuario + ", sua idade atual é: " + idadeAtual + " anos");

        double idadeFutura = (anoFuturo - anoNascimento);
        System.out.println(usuario + ", no ano de " + anoFuturo + " você terá " + idadeFutura + " anos");

        Teclado.close();
    }
}