import java.util.Scanner;

public class ConversorTemperatura05 {

    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        System.out.println("Bem vindo ao conversor de ºCelsius para ºFahrenheit, antes de começarmos porfavor, informe seu nome");
        String usuario = Teclado.nextLine();

        System.out.println(usuario + ", informe a temperatura em Celsius (apenas números)");
        double temperaturaCelsius = Teclado.nextDouble();

        double resultado = (temperaturaCelsius *1.8) + 32;

        System.out.println(usuario + ", a temperatura em Fanrenheit é de: " + resultado + " ºF");

        Teclado.close();
    }
}
