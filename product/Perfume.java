package product;

public class Perfume extends Product {
    private String name;
    private String gender;

    public Perfume(double price, String brand, String color, String material) {
        super(price, brand, color, material);
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void wear() {
        System.out.println(
                "Wearing the perfume " + this.getClass().getSimpleName() + ", its a scent for " + this.gender + ".");
    }

}
