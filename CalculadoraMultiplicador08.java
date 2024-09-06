import java.util.Scanner;

public class CalculadoraMultiplicador08 {

    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        System.out.println("Bem vindo a calculadora de tabuada de multiplicador, antes de começarmos porfavor, informe seu nome");
        String usuario = Teclado.nextLine();

        System.out.println(usuario + ", informe o valor que deseja a tabuada de multiplicador (apenas números)");
        double valorInformado = Teclado.nextDouble();

        System.out.println(usuario + ", a tabuada de multiplicador do valor informado é: "
                + valorInformado + "x1= " + valorInformado * 1 + "\n" +
                + valorInformado + "x2= " + valorInformado * 2 + "\n"
                + valorInformado + "x3= " + valorInformado * 3 + "\n"
                + valorInformado + "x4= " + valorInformado * 4 + "\n"
                + valorInformado + "x5= " + valorInformado * 5 + "\n"
                + valorInformado + "x6= " + valorInformado * 6 + "\n"
                + valorInformado + "x7= " + valorInformado * 7 + "\n"
                + valorInformado + "x8= " + valorInformado * 8 + "\n"
                + valorInformado + "x9= " + valorInformado * 9 + "\n"
                + valorInformado + "x10= " + valorInformado * 10 + "\n");

        Teclado.close();
    }
}
