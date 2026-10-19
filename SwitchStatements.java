public class SwitchStatements {
    public static void main(String[] args) {

        String weather = "sunny";
        switch(weather){
            case "sunny": System.out.println("A warm day.");break;
            case "cloudy": System.out.println("A nice day for a walk.");break;
            case "rainy": System.out.println("Might need a raincoat.");break;
            case "snowy": System.err.println("A good sleep will do.");break;
            default:System.out.println("Do what you're yearning for");break;
        }
       

        int role = 2;
        switch(role){
            case 1:System.out.println("You are a admin");break;
            case 2:System.out.println("You are a editor");break;
            case 3: System.out.println("You are a user");break;
            default:System.out.println("contact the HR");break;
        }
 
        int temperature = 75;
        int humidity = 65;
        if(temperature>=80){
            System.out.println("Its to hot.");
        }else if(temperature<=10){
            System.out.println("Its too cold");
        }else if(humidity<=60 && temperature<=65){
            System.out.println("Its comfortable.");
        }

        int age = 25;
        int income = 50000;
        if(age>=18 && income>=40000){
            System.out.println("You're eligible for the credid card");
        }else{
            System.out.println("you're not eligible for the credid card");
        }
 
        String lightColor = "green";
        switch(lightColor){
            case "green":System.out.println("GO");
            case "yellow":System.out.println("Ready to GO");
            case "red":System.out.println("STOP");
        }
    
        int grade = 85;
        if(grade>=85){
            System.out.println("A");
        }else if(grade>=70){
            System.out.println("B");
        }else if(grade>=60){
            System.out.println("C");
        }else{
            System.out.println("D");
        }

    
        String browser = "Chrome";
        switch(browser){
            case "Chrome":System.out.println("A browser");break;
            case "Firefox":System.out.println("A browser");break;
            case "Safari":System.err.println("A browser");break;
            case "Edge":System.out.println("A browser");break;
            case "Opera":System.out.println("A browser");break;
            default:System.out.println("Not a browser");
        }

        

    }
}
