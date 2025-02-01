package product;

public class Shoe extends Product {
    private String sport;
    private String laces;

    public Shoe(double price, String brand, String color, String material, String sport, String laces) {
        super(price, brand, color, material);
        this.sport = sport;
        this.laces = laces;
    }

    public String getSport(){
        return this.sport;
    }

    public void setSport(String sport){
        this.sport = sport;
    }

    public String getLaces(){
        return this.laces;
    }

    public void setLaces(String laces){
        this.laces = laces;
    }

    @Override
    public void fold(){
        System.out.println("You don't fold shoes.");
    }

    @Override
    public void wear(){
        System.out.println("Wear the right shoe for the right sport. " + this.getClass().getSimpleName() + " are used for " + this.getSport() + ". The color laces are " + this.getLaces() + ".");
    }

}
