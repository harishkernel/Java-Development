enum Laptop {
    Macbook(2000), XPS(2200), Surface(1500), ThinkPad(1800);
    
    private int price;

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class Enums1 {
    public static void main(String[] args) {
        // Laptop lap = Laptop.Macbook;
        // System.out.println(lap.getPrice()); // 2000

        for(Laptop lap: Laptop.values()) {
            System.out.println(lap + ": " + lap.getPrice());
        }
    }
}