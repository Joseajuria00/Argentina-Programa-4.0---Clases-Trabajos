import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] porductosYPrecios = Files.readAllLines(Paths.get("ProductosYPrecios.txt")).toArray(new String [Files.readAllLines(Paths.get("ProductosYPrecios.txt")).size()]);
        String[] pedido = Files.readAllLines(Paths.get("ProductosYCantidad.txt")).toArray(new String [Files.readAllLines(Paths.get("ProductosYCantidad.txt")).size()]);
        int tipoDsc = 2; // 1 = Descuento Fijo, 2 = Descuento Porcentual, 3 = Descuento Porcentual con Tope.
        double valorDsc = 0.5;
        Producto[] productosConPrecio = cargarProductosYPrecios(porductosYPrecios);
        Carrito carrito = cargarCarrito(productosConPrecio, pedido, tipoDsc, valorDsc);
        System.out.println(carrito.getTotalSinDsc());
        System.out.println(carrito.getTotalConDsc());
    }
    private static Producto[] cargarProductosYPrecios(String[] productosYPrecios) throws IOException{
        Producto[] productos = new Producto[productosYPrecios.length];
        for (int i=0; i<productosYPrecios.length; i++){
            String[] prodYPrecio = productosYPrecios[i].split("\t");
            productos[i] = new Producto(prodYPrecio[0], Double.parseDouble(prodYPrecio[1]));
        }
        return productos;
    }
    private static Carrito cargarCarrito(Producto[] productosConPrecio, String[] pedido, int tipoDsc, double valorDsc){
        ItemCarrito[] items = new ItemCarrito[pedido.length];
        for (int i=0; i<pedido.length; i++){
            String[] prodYCantidad = pedido[i].split("\t");
            for (Producto producto : productosConPrecio){
                if(producto.getNombre().equals(prodYCantidad[0])){
                    items[i] = new ItemCarrito(Integer.parseInt(prodYCantidad[1]), producto);
                }
            }
        }
        return new Carrito(items, tipoDsc, valorDsc);
    }
}