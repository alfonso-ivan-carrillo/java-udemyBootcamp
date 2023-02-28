package product;

public class Shirt extends Product{
    
    private Size size;
    public enum Size {SMALL, MEDIUM, LARGE}



    public Shirt(double price, String color, String brand, Size size) {
        super(price, color, brand);
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
        System.out.println("Wearing the " + this.getClass().getSimpleName() + " at a " + this.size + " size suits you well.");
    }

    @Override
    public String toString() {
        return this.getBrand();
    }

}
