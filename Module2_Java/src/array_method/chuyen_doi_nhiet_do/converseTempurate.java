package array_method.chuyen_doi_nhiet_do;

import java.util.Scanner;

public class converseTempurate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius;
        double fahrenheit;
        int choice;
       do {
           System.out.println("Menu");
           System.out.println("1.Fehranheit to Celcius.");
           System.out.println("2.Celcius to Fahrenheit");
           System.out.println("3.Exit.");
           System.out.print("Enter the choice: ");
           choice = scanner.nextInt();
           switch (choice){
               case 1:
                   System.out.print("Enter Fahrenheit: ");
                   fahrenheit = scanner.nextDouble();
//                   System.out.println(fahrenheit+"độ F = "+fahrenheitToCelsius(fahrenheit)+"độ C");
                   System.out.printf("%f độ F = %f độ C",fahrenheit,fahrenheitToCelsius(fahrenheit) );
                   break;
               case 2:
                   System.out.print("Enter Celsius: ");
                   celsius = scanner.nextDouble();
                   System.out.println(celsius+"độ C = "+celsiusToFahrenheit(celsius)+"độ F");
                   break;
               case 3:
                   System.exit(3);
           }
       } while (choice != 3);
    }
    public static double fahrenheitToCelsius(double f) {
        double c = (5.0 / 9) * (f - 32);
        return c;
    }
    public static double celsiusToFahrenheit(double c){
        double f = c*1.8+32;
        return f;
    }
}
