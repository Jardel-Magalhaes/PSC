import java.util.Scanner;

    public class ConversorMoedas03 {

    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        System.out.println("Bem vindo ao conversor de Dollar para Real, antes de começarmos porfavor, informe seu nome");
        String usuario = Teclado.nextLine();

        System.out.println(usuario + ", informe a cotação do Dollar hoje (apenas números)");
        double cotacaoDollar = Teclado.nextDouble();

        System.out.println(usuario + ", informe sua quantia em Dollar (apenas números)");
        double saldoDollar = Teclado.nextDouble();

        double resultadoReais = (cotacaoDollar * saldoDollar);

        System.out.println(usuario + ", seu saldo em reais é: R$" + resultadoReais);

        Teclado.close();
    }
}