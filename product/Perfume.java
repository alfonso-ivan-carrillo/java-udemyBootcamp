package product;

public class Perfume extends Product {
    private String name;
    private Gender gender;
    public enum Gender {UNISEX, MALE, FEMALE}

    public Perfume(double price, String brand, String color, String material, String name, Gender gender) {
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

    public Gender getGender() {
        return this.gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public void wear() {
        System.out.println(
                "Wearing the perfume " + this.getClass().getSimpleName() + ", its a scent for " + this.gender + ".");
    }

    @Override
    public void fold(){
        System.out.println("You don't fold perfumes.");
    }

}
