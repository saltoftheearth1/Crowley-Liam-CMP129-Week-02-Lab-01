public class CelsiusTable {


    // ConversionMehtod
    private static double celsius(int tempFahrenheit) {
        double tempCelsius=(5/9)*(tempFahrenheit-32);
        return tempCelsius;
    }


    // get user input and then plug it into method
    public static void main(String[] args) {
       // Scanner input = new Scanner(System.in);
        // Make the top of the table
        System.out.println("Fahrenheit     Celsius\n------------------------");

        for(int i=0;i<21;i++){
            int f = i;
            double c = celsius(f);
            // Nice formatting :)
            System.out.printf("%-15d %.2f%n", f, c);

        }


    }


}
