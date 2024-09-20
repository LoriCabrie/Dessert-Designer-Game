import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        boolean condition = false;

        System.out.println("Welcome to Dessert Designer! Ready to build your own dessert? " + "\n");

        while(condition == false) {
            try {
                System.out.println("Please select the dessert you would like to make: " + "\n");
                System.out.println("1. Sundae");
                System.out.println("2. Cake");
                System.out.println("3. Cookie");

                int selection = scnr.nextInt();

                if (selection == 1) {
                    System.out.println("You picked Sundae, correct?");
                    System.out.println("1. Yes");
                    System.out.println("2. No");

