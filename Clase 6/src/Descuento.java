public abstract class Descuento {
    private Double valorDesc;
    public Double getValorDesc() {
        return valorDesc;
    }

    public void setValorDesc(Double valor) {
        this.valorDesc = valor;
    }

    public abstract Double valorFinal(Double valorInicial);
}
