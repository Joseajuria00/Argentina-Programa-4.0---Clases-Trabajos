import java.time.LocalDateTime;
public class Producto {
    private String nombre;
    private Double precio;
    private LocalDateTime fecha;
    private static final Double PRECIO_MIN = 0.1;

    public Producto(String nombre1, Double precio) {
        this.nombre = nombre1;
        this.fecha = LocalDateTime.now();
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
}
