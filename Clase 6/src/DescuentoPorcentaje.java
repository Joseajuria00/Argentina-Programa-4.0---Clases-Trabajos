public class DescuentoPorcentaje extends Descuento {
    @Override
    public Double valorFinal(Double valorInicial) {
        return valorInicial - (valorInicial * this.getValorDesc());
    }
}
