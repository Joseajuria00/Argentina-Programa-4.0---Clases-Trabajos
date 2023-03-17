public class ItemCarrito {
    private Integer cantidad;
    private Producto producto;

    public ItemCarrito(Integer cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Double subtotal(){
        return this.producto.getPrecio() * this.cantidad;
    }
}
