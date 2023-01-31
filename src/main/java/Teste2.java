import java.util.Scanner;

public class Teste2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int n = sc.nextInt();

        int anterior = 0;
        int proximo = 1;
        int soma = proximo;

        while(anterior < n) {
            soma = anterior + proximo;
            anterior = proximo;
            proximo = soma;
        }

        if(anterior == n) {
            System.out.println("Pertence a sequência fibonacci");
        }else {
            System.out.println("Não Pertence a sequência fibonacci");
        }
    }
}
