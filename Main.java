import product.*;
import product.Shirt.Size;

public class Main {

    public static void productStore(Product product) {
        System.out.println("You bought a " + product.getClass().getSimpleName() + ". The brand is " + product.getBrand()
                + ", the color is " + product.getColor() + ". The material is " + product.getMaterial() + ". ");
    }

    public static void main(String[] args) {

        Shirt tShirt = new Shirt(9.99, "orange", "Lucky", Size.LARGE, "cotton");

        Pants pants = new Pants(10.99, "blue", "Levi's",32, 32, "denim");

        Pants leatherPants = new Pants(20.00, "black", "Tom Ford", 40, 29, "leather");

        Perfume ethanPerfume = new Perfume(115.00, "Cape Heartache", "green", "heartache");

        productStore(tShirt);
        productStore(pants);
        productStore(leatherPants);
        productStore(ethanPerfume);

        // tShirt.fold();
        // pants.fold();

        // tShirt.wear();
        // pants.wear();

        System.out.println(tShirt.toString());

    }
}
