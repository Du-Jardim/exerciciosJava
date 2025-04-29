import java.util.Scanner;

public class MetodoEstaticos {

    // Método que retorna uma mensagem
    public static String mensagem(String a) {
    return a;
  }

    // Método que soma dois números recebidos pelo parametro
    public static float soma(float a, float b) {
        return (a + b);
    }

    // Método que repete a mensagem três vezes
    public static String mensagemTres(String mensagem) {
        String resultado = "";
        for (int i = 0; i < 3; i++) {
            resultado += mensagem + " "; 
        }
        return resultado.trim(); // Remove o espaço extra no final
    }

    // Método que verifica se um número é par
    public static boolean numeroPar(int a) {
        return a % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        String a = "Estou aprendendo métodos estáticos";

        System.out.print("Digite o primeiro número para soma: ");
        float num1 = sc.nextFloat();

        System.out.print("Digite o segundo número para soma: ");
        float num2 = sc.nextFloat();

        System.out.print("Digite uma mensagem para repetir três vezes: ");
        sc.nextLine();
        String mensagem = sc.nextLine();

        System.out.print("Digite um número para verificar se é par: ");
        int numero = sc.nextInt();

        // Saídas

        
        System.out.println(mensagem(a)); // parâmetro ignorado no método
        System.out.println("Resultado da soma: " + soma(num1, num2));
        System.out.println("Mensagem repetida três vezes: " + mensagemTres(mensagem));
        System.out.println("O número é par? " + numeroPar(numero));
        
        sc.close(); // Fechar Scanner
    }
}
