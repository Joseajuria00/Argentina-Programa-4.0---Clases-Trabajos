import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<ItemCarrito> items;
    private int tipoDsc;
    private Double valorDsc;

    public Carrito(int tipoDsc, Double valorDsc) {
        this.items = new ArrayList<ItemCarrito>();
        this.tipoDsc = tipoDsc;
        this.valorDsc = valorDsc;
    }

    public void agregarItem(ItemCarrito item){
        this.items.add(item);
    }

    public void eliminarItem(ItemCarrito item){
        this.items.remove(item);
    }

    public List<ItemCarrito> getItems() {
        return this.items;
    }

    public Double getTotalSinDsc() throws Exception{
        Double tot = 0d;
        for(ItemCarrito item : items){
            if (item != null){
                tot += item.subtotal();
            }
        }
        return tot;
    }
    public Double getTotalConDsc() throws Exception {
        Double tot = 0d;
        switch (tipoDsc){
            case 1: {
                Descuento dsc = new DescuentoFijo();
                dsc.setValorDesc(valorDsc);
                tot = dsc.valorFinal(this.getTotalSinDsc());
                return tot;
            }
            case 2: {
                Descuento dsc = new DescuentoPorcentaje();
                dsc.setValorDesc(valorDsc);
                tot = dsc.valorFinal(this.getTotalSinDsc());
                return tot;
            }
            case 3: {
                Descuento dsc = new DescuentoPorcentajeConTope();
                dsc.setValorDesc(valorDsc);
                tot = dsc.valorFinal(this.getTotalSinDsc());
                return tot;
            }
            default: {
                return getTotalSinDsc();
            }
        }
    }
    public void precioConYSinDsc() throws Exception{
        Double precioConDsc = getTotalConDsc();
        System.out.println("El precio final del carrito sin descuento es: " + getTotalSinDsc());
        System.out.println("El precio final del carrito con descuento es: " + precioConDsc);
    }

}
