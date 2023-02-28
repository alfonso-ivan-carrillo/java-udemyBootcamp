package higherorderfunctions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HigherOrder{

// Functional Interface          Lambda Expression                            Example
//------------------------------------------------------------------------------------
// Consumer         Recieves a parameter and produces a side-effect         x -> {code}
// Predicate        Recives one parameter and produces a boolean            x -> {return boolean}
// Function         Receives one parameter & returns any value              x -> {return value}
// BiConsumer       Receives two parameters & produces a side-effect        (x,y) -> {code}
// Comparator       Receives two parameters & returns an integer            (x, y) -> {return int}
// BinaryOperator   Receives two parameters & returns a value of the same type  (x,y) -> {returns value}

    public static void main(String[] args) {
        
        //Consumer
        List<String> facts = Arrays.asList( "Marie Curie was the first woman to win a Nobel Prize.",
        "She received the Nobel Prize in Physics in 1903, and the Nobel Prize in Chemistry in 1911.",
        "Curie was a pioneer in the field of radioactivity, and her work led to the development of X-ray technology.",
        "She was the first woman to become a professor at the Sorbonne, and the first woman to be entombed on her own merits in the Panthéon.",
        "Curie died at the age of 66 from complications related to her prolonged exposure to radiation.",
        "She is remembered as one of the most influential scientists in history.",
        "Her legacy lives on through the Marie Curie Cancer Care charity, which provides care and support to people with terminal illnesses.",
        "Curie's contributions to science and medicine have been recognized and celebrated worldwide."
        );

        facts.forEach(fact -> {
            System.out.println(fact);
        });

        // // instead of
        // for(int i = 0; i < facts.size(); i++){
        //     System.out.println(facts.get(i));
        // }
        System.out.println("---------------------------------------------------");


        //Comparator
        List<Integer> integers = Arrays.asList(25, 19, 23, 45, 38, 23, 59, 12);
        System.out.println(integers);
        integers.sort((right, left) -> {
            return right.compareTo(left);       // sort in ascending order
        });

        System.out.println(integers);

        System.out.println("---------------------------------------------------");

        //BiConsumer
        Map<String, Integer> coffeeRatings = new HashMap<>();
        coffeeRatings.put("Starbucks House Blend", 7);
        coffeeRatings.put("Peet's French Roast", 8);
        coffeeRatings.put("Intelligentsia Black Cat", 9);
        coffeeRatings.put("Blue Bottle Three Africas", 10);
        coffeeRatings.put("Philz Mint Mojito Iced Coffee", 8);
        coffeeRatings.put("Camber Coffee Ethiopia Yirgacheffe", 9);
        coffeeRatings.put("Four Barrel Guatemala Finca El Injerto", 7);
        coffeeRatings.put("Heart Coffee Bolivia La Morena", 8);
        coffeeRatings.put("Ritual Coffee Nicaragua La Ilusión", 10);
        coffeeRatings.put("Verve Coffee Roasters El Salvador Finca Kilimanjaro", 9);
        
        System.out.println("\nMenu\n-------");

        coffeeRatings.forEach((key, value) -> {
            System.out.println("Coffee - " + key + " Rating: " + value);
        });

        System.out.println("---------------------------------------------------");

        // Steam Operations 
        List<Double> prices = Arrays.asList(341.67, 209.32, 88.41, 269.99, 68.49, 499.99, 28.12, 354.38);

        prices.stream().filter(price -> {
            return price > 100;
        }).map(price -> {
            return price - 20;
        }).sorted((right, left) -> {
            return right.compareTo(left);
        }).map(price -> {
            return "$" + price;
        }).forEach(price ->{
            System.out.println(price);
        });

        System.out.println("---------------------------------------------------");

        // *******************forEach*******************
        System.out.println("*******************forEach*******************");
        List<String> usernames = Arrays.asList("blueEyedDreamer", "FiercePhoenix", "Wildflower87", "SerendipitousSurprise");

        // usernames.forEach(username -> { System.out.println(username);});
        usernames.stream()
            .map(username -> {return username.toUpperCase(); 
            }).forEach(username -> {
                System.out.println(username);
            });


        // *******************toList*******************
        System.out.println("*******************toList*******************");
        List<String> upperUsernames = usernames.stream().map(username -> username.toUpperCase()).toList();
        System.out.println(upperUsernames);

        // *******************reduce*******************
        System.out.println("*******************reduce*******************");
        List<Double> earnings = Arrays.asList(40.50, 60.00, 120.50, 20.00, 50.50, 20.00);

        Double totalEarnings = earnings.stream().reduce(0.00, ((x, y) ->  x + y));
        System.out.println(totalEarnings);

        // *******************reduce*******************
        System.out.println("*******************reduce*******************");
        List<Double> expenses = Arrays.asList(2.50, 4.00, 5.50, 2.00, 5.50, 2.00);
        Double fundsRemaining = expenses.stream().reduce(100.00, (x, y) -> x -y);
        System.out.println(fundsRemaining);

        // *******************findFirst*******************
        System.out.println("*******************findFirst*******************");

        List<String> aisles = Arrays.asList("apples", "bananas", "candy", "chocolate", "coffee", "tea");
        System.out.print("\nDo you guys sell coffee? ");

        String result = aisles.stream().filter(aisle -> {return aisle.equals("coffee");}).findFirst().orElse(null);

        String response = result == null ? "No we don't!" : "Sure we do!";

        System.out.println(response);  

        // *******************count*******************       
        System.out.println("*******************count*******************");

        List<Integer> numbers = Arrays.asList(1, 1, 1, 2, 2, 1, 1, 2, 2, 2, 2, 3, 4, 1);
        System.out.println("\nHow many times does the number 3 repeat?");

        int count = (int) numbers.stream().filter(number -> number == 3).count();

        System.out.println("The number 3 repeats " + count + " times.");
        
        System.out.println("*****************************************************");

        // Creating Stream from Datasource: Array
        List<String> hi = Arrays.asList("hi", "hello", "bye");
        hi.forEach(h -> {System.out.println(h);});
            

        String[] greetings = new String[]{"Hello!", "Hola!", "Bonjour!", "Hallo!"};
        Arrays.stream(greetings).forEach(greeting -> {System.out.println(greeting);});


        // Creating Stream from Datasource: File
        // Path path = Paths.get("path to file");











    }
}