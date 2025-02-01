package product;

public class Shirt extends Product{
    
    private Size size;
    public enum Size {SMALL, MEDIUM, LARGE}



    public Shirt(double price, String color, String brand, Size size, String material) {
        super(price, color, brand, material);
        this.size = size;
    }

    
    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public void fold() {
        super.fold();
        System.out.println("Lay flat, and fold from each side.");
    }

    @Override
    public void wear() {
        System.out.println("You are wearing the " + this.getClass().getSimpleName() + " at a " + this.size + " size suits you well. The color is " + this.getColor() + 
        "and it's made with this material: " + this.getMaterial() + " the price for this item: " + this.getPrice() + ". the brand: " + this.getBrand() + ".");
    }

    @Override
    public String toString() {
        return this.getBrand();
    }

}
