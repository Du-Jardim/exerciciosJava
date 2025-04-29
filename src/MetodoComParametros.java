import java.util.*;

public class MetodoComParametros {
  public static void main(String[] args) {
    System.out.println(mostrarMensagem());
  }

  public static String mostrarMensagem(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite a mensagem: ");
    return scan.nextLine();
  }

}
