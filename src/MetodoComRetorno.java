public class MetodoComRetorno {
    public static void main(String[] args) {
        System.out.println("Ano atual: " + Ano());
        System.out.println("Nome Completo: " + NomeCompleto());
        System.out.println("Valor fixo: " + valor());
        System.out.println("V || F " + alternativa());
        System.out.println("O valor de PI é: " + Pi());
    }

    public static int Ano(){
        return java.time.Year.now().getValue();
    }

    public static String NomeCompleto(){
        return "Maria Eduarda Jardim Sousa";
    }

    public static int valor(){
        return 33;
    }

    public static boolean alternativa(){
        return true;
    }

    public static float Pi(){
        return 3.14159F;
    }
}