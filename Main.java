import product.*;
import product.Shirt.Size;


public class Main {

    public static void productStore(Product product){
        System.out.println("You bought a " + product.getClass().getSimpleName() + ". The brand is " + product.getBrand() + ", the color is " + product.getColor() + ".");
    }
    

    public static void main(String[] args) {
        
        // Shirt tShirt = new Shirt(9.99, "orange", "Lucky",Size.LARGE);
        
        
        // Pants pants = new Pants(10.99, "blue", "Levi's",32, 32);
        


        // productStore(tShirt);
        // productStore(pants);

        // tShirt.fold();
        // pants.fold();

        // tShirt.wear();
        // pants.wear();

        // System.out.println(tShirt.toString());

    }
}
