package product;

// Abstract class: a class you cannot create objects from
// Abstract method: exposes behavior that a child must overide

public abstract class Product {

    private double price;
    private String color;
    private String brand;


    public Product(double price, String color, String brand) {
        this.price = price;
        this.color = color;
        this.brand = brand;
    }


    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void fold(){
        System.out.println("Folding your " + this.getClass().getSimpleName() + " brand: " + this.getBrand() );
    }

    // abstract method specifies what should be returned and what parameters to accept
    // abstract method does not have a body, it depends on the child class to implement 
    public abstract void wear();

}
