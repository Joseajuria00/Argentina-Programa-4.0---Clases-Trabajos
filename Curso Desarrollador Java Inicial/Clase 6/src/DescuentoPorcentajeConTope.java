public class DescuentoPorcentajeConTope extends Descuento{
    private Double tope = 100d;
    @Override
    public Double valorFinal(Double valorInicial) {
        if((valorInicial*this.getValorDesc()) <= this.tope){
            return valorInicial - (valorInicial * this.getValorDesc());
        } else {
            return valorInicial - this.tope;
        }

    }
}
