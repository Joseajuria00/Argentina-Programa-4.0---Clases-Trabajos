public class DescuentoAPrecio0Exception extends Exception{
    public DescuentoAPrecio0Exception(){
        super("No se puede aplicar descuento a un carrito de precio 0.");
    }
}
