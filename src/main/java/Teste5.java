import java.util.Scanner;

public class Teste5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String saida = "";

        System.out.print("Informe uma palavra: ");
        String palavra = sc.nextLine();


        for(int i = palavra.length() - 1; i >=0; i--) {
            saida += palavra.charAt(i);
        }

        System.out.println("Palavra invertida: " + saida);
    }
}
