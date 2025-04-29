import java.util.Scanner;
public class MetodoParametroWRetorno{
  int a,b,;
  String name,a,b,idade;

  public static void main(String[] args) {
    System.out.println("O resultado da multiplicação é: " + multiplicacao(a, b));
    System.out.println("Seja bem-vindo(a) "+ nome(name));
    System.out.println("O dobro deste número é: " + dobro(a)));
    System.out.println("As mensagens são " + concatenacao(a, b));
    System.out.println(verificacaoIdade(idade));
  }

  public static int multiplicacao(int a, int b){
    Scanner leiaScanner = new Scanner(System.in);
    System.out.println("Digite o primeiro número: ");
    a = leiaScanner.nextInt();

    System.out.println("Digite o segundo número: ");
    b = leiaScanner.nextInt();

    return (a*b);
  }

  public static String nome(String name){
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite seu nome: ");
    name = sc.nextLine();

    return String.format("Seja muito bem-vindo(a), Sr(a). %s!", name);
  }

  public static int dobro(int a){
    Scanner num = new Scanner (System.in);
    System.out.println("Digite o número que quer dobrar o valor: ");
    a = num.nextInt();

    return (a*2);
  }

  public static String concatenacao(String a, String b){
    Scanner leiaMensagem = new Scanner(System.in);
    System.out.println("Digite a primeira mensagem: ");
    a = leiaMensagem.nextLine();

    System.out.println("Digite a segunda mensagem: ");
    b = leiaMensagem.nextLine();

    return a + b;
  }

  public static String verificacaoIdade(String idade){
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite sua idade: ");
    idade = sc.nextInt();

    if(idade<0){
      return "Idade inválida não pode ser negativa.";
    } else if (idade<18){
      return "Você não é maior de idade";
    } else if (idade>18){
      return "Você é maior de idade";
    }
  }

  
}