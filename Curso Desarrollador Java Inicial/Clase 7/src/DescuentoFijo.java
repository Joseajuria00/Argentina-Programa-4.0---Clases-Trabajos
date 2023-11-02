public class DescuentoFijo extends Descuento{

    @Override
    public Double valorFinal(Double valorInicial) throws Exception{
        Double valorConDsc = valorInicial - this.getValorDesc();
        if(valorInicial==0){
            throw new DescuentoAPrecio0Exception();
        } else if (valorConDsc<0) {
            throw new DescuentoMontoNegativoException();
        } else {
            return valorConDsc;
        }
    }
}
