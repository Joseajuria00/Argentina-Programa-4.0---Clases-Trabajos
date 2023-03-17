public class Carrito {
    private ItemCarrito[] items;
    private int tipoDsc;
    private Double valorDsc;

    public Carrito(ItemCarrito[] items, int tipoDsc, Double valorDsc) {
        this.items = items;
        this.tipoDsc = tipoDsc;
        this.valorDsc = valorDsc;
    }

    public Double getTotalSinDsc(){
        Double tot = 0d;
        for(ItemCarrito item : items){
            if (item != null){
                tot += item.subtotal();
            }
        }
        return tot;
    }
    public Double getTotalConDsc(){
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

}
