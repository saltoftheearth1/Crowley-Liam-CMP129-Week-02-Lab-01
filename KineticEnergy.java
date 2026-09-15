import java.util.Scanner;

public class KineticEnergy {
    // Kenetic Energy Method
    private static double kineticEnergy(double mass,double velocity){
        double KE = 0.5*mass*velocity*velocity;
        return KE;
    }
    // get user input and then plug it into method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the mass of the object: ");
        double userM = input.nextDouble();
        System.out.print("Please enter the velocity of the object: ");
        double userV = input.nextDouble();
        System.out.println(kineticEnergy(userM,userV));

    }
}
