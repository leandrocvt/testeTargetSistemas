import com.fasterxml.jackson.databind.ObjectMapper;
import entities.Faturamento;

import java.io.File;
import java.io.IOException;

public class Teste3 {
    public static void main(String[] args) throws IOException {

      ObjectMapper objectMapper = new ObjectMapper();
      File dadosJsonFile = new File("src/main/resources/dados.json");

      Faturamento[] faturamentos = objectMapper.readValue(dadosJsonFile, Faturamento[].class);

//      System.out.println(Arrays.asList(faturamentos));

      double soma = 0.0;
      int dias = 0;

      for (int i=0; i < faturamentos.length; i++){
          if (faturamentos[i].getValor() > 0.0){
              soma += faturamentos[i].getValor();
              dias += 1;
          }
      }

      double media = soma / dias;

      System.out.println("Dias com faturamento: " + dias);
      System.out.printf("Soma = %.2f", soma);
      System.out.printf("\nMédia = %.2f ", media);

      double maiorFaturamento = 0.0;
      double menorFaturamento = 0.0;

      for (Faturamento fat : faturamentos){
          if (fat.getValor() > maiorFaturamento ){
              maiorFaturamento = fat.getValor();
          }
      }

      System.out.printf("\nMaior faturamento: %.2f" , maiorFaturamento);
      System.out.printf("\nMenor faturamento: %.2f" , menorFaturamento);

      int diasMaiorMedia = 0;
      for (int i=0; i<faturamentos.length; i++){
          if (faturamentos[i].getValor() > media){
              diasMaiorMedia += 1;
          }
      }

      System.out.println("\nNúmero de dias do mês que o valor foi maior que a média: " + diasMaiorMedia);
    }
}
