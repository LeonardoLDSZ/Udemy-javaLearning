package productEntities;

public class Products {
    public String name;
    public double price;
    public int quantity;
    public double totalValueStock() {
        return price * quantity;
    }
    public void addProduct(int quantity){
        this.quantity += quantity;
    }
    public void removeProduct(int quantity) {
        this.quantity -= quantity;
    }
    public String toString(){
        return name
                + ", $ "
                + String.format("%.2f",price)
                + ", "
                + quantity
                + " units, total $ "
                + String.format("%.2f", totalValueStock());
    }
}