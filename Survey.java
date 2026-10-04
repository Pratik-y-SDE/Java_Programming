import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {

        System.out.println("Welcome. Thank you for taking the survey");
        int count=0;
        Scanner scanner= new Scanner(System.in);

        System.out.println("\nWhat is your name?");
        String name = scanner.nextLine();
        count++;

        System.out.println("\nHow much money do you spend on coffee?");
        double coffeePrice = scanner.nextDouble();
        count++;

        System.out.println("\nHow much money do you spend on fast food?");
        double foodPrice = scanner.nextDouble();
        count++;

        System.out.println("\nHow many times a week do you buy coffee?");
        int coffeeAmount = scanner.nextInt();
        count++;

        System.out.println("\nHow many times a week do you buy fast food?");
        int foodAmount = scanner.nextInt();
        count++;

        System.out.println("Thank you" + name +" for answering all "+ count +" questions");
        System.out.println("Weekly, you spend $"+ (coffeeAmount * coffeePrice)+" on coffee");
        System.out.println("Weekly, you spend $" + (foodAmount * foodPrice) + " on food");

        scanner.close();

    }
}
