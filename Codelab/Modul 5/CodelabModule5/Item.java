package CodelabModule5;

public class Item {
    private String Name;
    private int Stock;

    public Item(String name, int stock){
        this.Name = name;
        this.Stock = stock;
    }

    public String getName() {
        return Name;
    }

    public int getStock() {
        return Stock;
    }
    public void setStock(int newStock){
        this.Stock = newStock;
    }
}
