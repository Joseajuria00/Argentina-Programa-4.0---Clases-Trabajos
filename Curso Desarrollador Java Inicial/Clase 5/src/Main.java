import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        String [] contenidoArchivo = Files.readString(Paths.get("Lote Clase 5.txt")).split("\t");

        Producto prod1 = new Producto(contenidoArchivo[0]);
        prod1.setPrecio(Double.parseDouble(contenidoArchivo[1]));
        ItemCarrito item1 = new ItemCarrito(Integer.parseInt(contenidoArchivo[2]), prod1);

        Producto prod2 = new Producto(contenidoArchivo[3]);
        prod2.setPrecio(Double.parseDouble(contenidoArchivo[4]));
        ItemCarrito item2 = new ItemCarrito(Integer.parseInt(contenidoArchivo[5]), prod2);

        Producto prod3 = new Producto(contenidoArchivo[6]);
        prod3.setPrecio(Double.parseDouble(contenidoArchivo[7]));
        ItemCarrito item3 = new ItemCarrito(Integer.parseInt(contenidoArchivo[8]), prod3);

        Carrito carrito = new Carrito();
        carrito.setItem1(item1);
        carrito.setItem2(item2);
        carrito.setItem3(item3);

        System.out.println(carrito.total());


    }
}