public class DescuentoFijo extends Descuento{

    @Override
    public Double valorFinal(Double valorInicial) {
        return valorInicial - this.getValorDesc();
    }
}
