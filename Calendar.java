import java.util.Scanner;
public class Calendar{
    public static void main(String[] args){
        Scanner days= new Scanner(System.in);
        System.out.println("Enter the day");
        String day= days.nextLine();
        days.close();
        switch(day){
            case "monday": System.out.println("Sorry, I have to stay at work late.");break;
            case "tuesday": System.out.println("It looks like I have meetings all day.");break;
            case "wednesday":System.out.println("I have a dentist appointment. Some other time!");break;
            case "thursday":System.out.println("Sorry, thursday is date night!");break;
            case "friday":System.out.println("I'm free!!");break;
            case "saturday":System.out.println("I'm free!!");break;
            case "sunday":System.out.println("I'm free!!");break;
            default:System.out.println("That's not a day.");break;
            

        }
    }
}