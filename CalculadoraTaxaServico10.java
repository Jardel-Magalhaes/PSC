import java.util.Scanner;

public class CalculadoraTaxaServico10 {

    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        System.out.println("Bem vindo a calculadora de taxa de serviço, antes de começarmos porfavor, informe seu nome");
        String usuario = Teclado.nextLine();

        System.out.println(usuario + ", informe o valor do seu consumo (apenas números)");
        double consumoCliente = Teclado.nextDouble();

        double taxaServico = (consumoCliente * 0.1);

        System.out.println(usuario + ", o valor opcional da taxa de serviço é de: " + taxaServico + "\n" + "e o valor total" +
                " da sua despesa incluindo taxa de serviço é de: " + (taxaServico + consumoCliente));

        Teclado.close();
    }
}
