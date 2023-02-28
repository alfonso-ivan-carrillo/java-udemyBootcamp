package variable;
import java.util.Scanner;

public class Variables {
    


    public static void main(String[] args) {
        String winner = "Argentina";
        int year = 2022;

        System.out.println("The winner of the World Cup for " + year + " was " + winner + ".");
        
        long globalPopulation = 800_000_000_000L;
        long dailyGoggleSearches = 850000000;

        int eleven = 11;
        int two = 2;
        double result = (eleven / two);
        double percentage = 97.5;
        double resultPercentage = 11.00 / 2;

        System.out.println(globalPopulation + " " + dailyGoggleSearches);
        System.out.println(percentage);

        System.out.println(eleven / two);
        System.out.println(result);                 // dividing two int will cut off the decimals because out put will be an int
        System.out.println((double) eleven / two);  // casting into a double gives the correct output
        System.out.println(resultPercentage);


        double salary = 50000.50;
        int roundedSalary = (int)salary;

        System.out.println(salary);
        System.out.println(roundedSalary);

        System.out.println(487 % 32);
        System.out.println(487 / 32);

    }
}
