import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        
 

        
        Scanner sc= new Scanner(System.in) ;

        System.out.println("Hello. What is your name?");
        String name = sc.nextLine(); 

 
        System.out.println("\nHi "+ name +"! I'm Javabot. Where are you from?");
        String country = sc.nextLine(); 
                        

        System.out.println("\nI hear it's beautiful at "+ country +"! I'm from a place called Oracle");
        System.out.println("\nHow old are you?");
        double age = sc.nextDouble();

        
        System.out.println("\nSo you're "+ age +", cool! I'm 400 years old.");
        System.out.println("\nThis means I'm "+ (400/age) +" times older than you.");
        System.out.println("\nEnough about me. What's your favourite language? (just don't say Python)");
        sc.nextLine();
        String language = sc.nextLine();

        System.out.println("\n" + language + ", that's great! Nice chatting with you "+ name +". I have to log off now. See ya!");
        
        sc.close();

        
    }
}
