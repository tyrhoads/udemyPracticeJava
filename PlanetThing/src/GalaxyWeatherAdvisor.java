import java.util.Scanner;

public class GalaxyWeatherAdvisor
{

    public static void main(String[] args) {
        // Step 1: Declare and initialize Scanner object
        Scanner scan = new Scanner(System.in);

        // Step 2: Display a welcome message
        System.out.println("Welcome to the Galactic Weather Advisor!");
        System.out.println("Please enter the planet you are on (Earth, Mars, Venus, Jupiter):");

        // Step 3: Take user input for planet and convert to lowercase
        String planet = scan.nextLine().toLowerCase();
        System.out.println(planet);
        // Step 4: Take current temperature as input
        System.out.println("Please enter the current temperature in Celsius:");
        double temperature = scan.nextDouble();
        scan.nextLine();



                String advice;

        // Step 6: Compute response based on planet and temperature
       if (planet.equalsIgnoreCase("earth"))
       {
          if (temperature < 15){
              advice = "put on a damn jacket";
          }
          else {
              advice = "you are good to got";
          }
       }
       else if(planet.equalsIgnoreCase("mars")){
           if (temperature < 15){
               advice = "put on a damn jacket";
           }
           else {
               advice = "you are good to got";
           }
       }
       else if(planet.equalsIgnoreCase("venus")){
           if (temperature < 15){
               advice = "put on a damn jacket";
           }
           else {
               advice = "you are good to got";
           }
       }
       else if(planet.equalsIgnoreCase("jupiter")){
           if (temperature < -15){
               advice = "put on a damn jacket";
           }
           else {
               advice = "you are good to got";
           }
       }
       else {
           advice = "unknown plant";
       }

        // Step 7: Display response
        System.out.println(advice);

        // Step 8: Close Scanner
        scan.close();
    }
}


