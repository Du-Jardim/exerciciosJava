import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.swing.JOptionPane;

public class MetodoComParametros {
  public static void main(String[] args) {
    System.out.println(mostrarMensagem());
    System.out.println("A soma é: " + mostrarSoma());
    System.out.println(mostrarNomeIdade());
    System.out.println(numPosNeg());
    System.out.println(saudacaoPersonalizada());
  }

  public static String mostrarMensagem(){
    Scanner v = new Scanner(System.in);
    System.out.println("Digite a mensagem: ");
    return v.nextLine();
  }

  public static int mostrarSoma(){
    Scanner soma = new Scanner (System.in);
    int a,b;
    do{
      System.out.println("Digite o primeiro número: ");
      while (!soma.hasNextInt()) soma.next();
      a = soma.nextInt();

      System.out.println("Digite o segundo número: ");
      while (!soma.hasNextInt()) soma.next();
      b = soma.nextInt();
  
    } while (false);
    return (a + b);
  }

  public static String mostrarNomeIdade() {
    String nome;
    int idade;
    try {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Nome: ");
        nome = reader.readLine();
        System.out.print("Idade: ");
        idade = Integer.parseInt(reader.readLine());
    } catch (IOException e) {
        return "Erro na leitura";
    }

    return nome + " tem " + idade + " anos";
  }


  public static String numPosNeg() {
    Scanner ler = new Scanner(System.in);
    System.out.print("Digite um número: ");
    int num = ler.nextInt();
    if (num>=0){
      return "o número é positivo!";
    }else if(num<=0) {
      return "o número é negativo!";
    } else{
      return "Você não digitou um número!";
    }
  }

  public static String saudacaoPersonalizada() {
    String nome = JOptionPane.showInputDialog("Digite seu nome: ");
    return "Olá, " + nome + ". É um prazer te ver por aqui!";
  }

}