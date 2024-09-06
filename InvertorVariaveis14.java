
import java.util.Scanner;

public class InvertorVariaveis14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bem vindo ao intertor de valores, antes de começarmos porfavor, informe seu nome");
        String usuario = teclado.nextLine();

        System.out.println(usuario + ", informe o valor de A: (apenas números)");
        int a = teclado.nextInt();

        System.out.println(usuario + ", informe o valor de B: (apenas números)");
        int b = teclado.nextInt();

        System.out.println(usuario + ", valores antes da inversão: A = " + a + ", B = " + b);

        int temp = a; // Armazena temporariamente o valor de A
        a = b;        // A recebe o valor de B
        b = temp;     // B recebe o valor armazenado em temp (que é o valor original de A)

        System.out.println(usuario + ", esses são os valores após a inversão A = " + a + ", B = " + b);

        teclado.close();
    }
}
