package posproject;

public class LineItem {
    private Product product;
    private int qty;
    
    public final double getOrigPriceSubtotal() {
        return product.getProductPrice() * getQty();
    }

    public final double getDiscountedPrice() {
        return product.getProductPrice() * getQty() * product.getDiscountStrategy().getDiscountInDollars(product.getProductPrice(), qty);
    }
    
    public LineItem(Product product, int qty) {
        this.product = product;
        this.qty = qty;
    }
    

    public final int getQty() {
        return qty;
    }

    public final void setQty(int qty) {
        //validation required
        this.qty = qty;
    }
    
    public final Product getProduct() {
        return product;
    }

    public final void setProduct(Product product) {
        this.product = product;
    }
    
    
    
}
