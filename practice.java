import java.util.Scanner;

public class practis{
    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a name \n");
        String  name = scanner.nextLine();
        System.out.println("hello "+name);
        scanner.close();
    }
}
