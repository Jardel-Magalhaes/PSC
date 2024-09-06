import java.util.Scanner;

public class AppEleicao15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bem vindo a aplicação eleitoral, antes de começarmos porfavor, informe seu nome");
        String usuario = teclado.nextLine();

        System.out.println(usuario + ", informe o número total de eleitores:");
        int totalEleitores = teclado.nextInt();

        System.out.println(usuario + ", informe o número de votos do primeiro candidato:");
        int votosCandidato1 = teclado.nextInt();

        System.out.println(usuario + ", informe o número de votos do segundo candidato:");
        int votosCandidato2 = teclado.nextInt();

        int votosNulos = totalEleitores - (votosCandidato1 + votosCandidato2);

        // Calculando o percentual de votos para cada candidato e votos nulos
        double percentualCandidato1 = (votosCandidato1 * 100.0) / totalEleitores;
        double percentualCandidato2 = (votosCandidato2 * 100.0) / totalEleitores;
        double percentualNulos = (votosNulos * 100.0) / totalEleitores;

        System.out.println(usuario + ", segue abaixo o resultado da eleição:");
        System.out.println("Percentual de votos do primeiro candidato: " + percentualCandidato1 + "%");
        System.out.println("Percentual de votos do segundo candidato: " + percentualCandidato2 + "%");
        System.out.println("Percentual de votos nulos: " + percentualNulos + "%");

        teclado.close();
    }
}
