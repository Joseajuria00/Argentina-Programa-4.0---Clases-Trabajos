public class DescuentoMontoNegativoException extends Exception{
    public DescuentoMontoNegativoException(){
        super("El precio con el descuento aplicado da un valor negativo.");
    }
}
