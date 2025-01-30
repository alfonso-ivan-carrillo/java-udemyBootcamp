package product;

public class Pants extends Product{
    private int waist;
    private int length;


    public Pants(double price, String color, String brand ,int waist, int length, String material) {
        super(price, color, brand, material);
        this.waist = waist;
        this.length = length;
    }
    


    public int getWaist() {
        return this.waist;
    }

    public void setWaist(int waist) {
        this.waist = waist;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void fold() {
        System.out.println("Lay over your hand and fold from the middle");
    }

    @Override
    public void wear() {
        System.out.println("Wearing the " + this.getClass().getSimpleName() + " at a waist size of  " + this.waist + " suits you well.");
    }
}
