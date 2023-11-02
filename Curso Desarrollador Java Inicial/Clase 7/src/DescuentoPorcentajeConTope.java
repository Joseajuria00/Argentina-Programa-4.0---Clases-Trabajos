public class DescuentoPorcentajeConTope extends Descuento{
    private Double tope = 1000d;
    @Override
    public Double valorFinal(Double valorInicial) throws Exception{
        Double valorDsc;
        if((valorInicial*this.getValorDesc()) <= this.tope){
            valorDsc = valorInicial - (valorInicial * this.getValorDesc());
        } else {
            valorDsc = valorInicial - this.tope;
        }
        if(valorInicial==0){
            throw new DescuentoAPrecio0Exception();
        } else if (valorDsc<0) {
            throw new DescuentoMontoNegativoException();
        } else {
            return valorDsc;
            /*if((valorInicial*this.getValorDesc()) <= this.tope){
                return valorInicial - (valorInicial * this.getValorDesc());
            } else {
                return valorInicial - this.tope;
            }*/
        }
    }
}
