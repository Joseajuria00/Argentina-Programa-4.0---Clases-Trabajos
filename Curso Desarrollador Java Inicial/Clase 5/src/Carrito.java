public class Carrito {
    private ItemCarrito item1;
    private ItemCarrito item2;
    private ItemCarrito item3;
    public Carrito() {
    }

    public ItemCarrito getItem1() {
        return item1;
    }

    public void setItem1(ItemCarrito item1) {
        this.item1 = item1;
    }

    public ItemCarrito getItem2() {
        return item2;
    }

    public void setItem2(ItemCarrito item2) {
        this.item2 = item2;
    }

    public ItemCarrito getItem3() {
        return item3;
    }

    public void setItem3(ItemCarrito item3) {
        this.item3 = item3;
    }

    public Double total(){
        double tot = 0;
        if (item1 != null) {
            tot+= item1.subtotal();
        }
        if (item2 != null) {
            tot+= item2.subtotal();
        }
        if (item3 != null) {
            tot+= item3.subtotal();
        }
        return tot;
    }
}
