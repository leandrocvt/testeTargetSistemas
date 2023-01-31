import java.util.Locale;

public class Teste4 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        double total = sp + rj + mg + es + outros;

        System.out.printf("Valor Total: %.2f", total);
        System.out.print("\nPorcentagem");
        System.out.printf("\nSP: %.2f", porcentagem(sp, total));
        System.out.printf("\nRJ: %.2f", porcentagem(rj, total));
        System.out.printf("\nMG: %.2f", porcentagem(mg, total));
        System.out.printf("\nES: %.2f", porcentagem(es, total));
        System.out.printf("\nOutros: %.2f", porcentagem(outros, total));
    }

    public static double porcentagem(double estado, double total) {
        return  estado * 100 / total;
    }
}
