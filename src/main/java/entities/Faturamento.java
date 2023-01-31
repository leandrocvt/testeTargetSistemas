package entities;

public class Faturamento {

    private Integer dia;
    private Double valor;

    public Faturamento(){
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "\nFaturamento \nDia: " + dia + "\nValor: " + valor;
    }
}
