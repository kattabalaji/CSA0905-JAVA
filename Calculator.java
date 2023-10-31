import java.util.Scanner;

public class Calculator {
    public static final double PI = 3.14159265359;

    public static double calculateArea(double r) {
        return PI * r * r;
    }

    public static double calculateVolume(double r, double h) {
        return PI * r * r * h;
    }

    public static double calculateVolume(double r, double h, boolean isCone) {
        if (isCone) {
            return (1.0 / 3.0) * PI * r * r* h;
        } else {
            return PI * r * r * h;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the radius : ");
        double r = s.nextDouble();
        double circleArea = calculateArea(r);
        

        System.out.print("Enter the height: ");
        double h = s.nextDouble();
        double cylinderVolume = calculateVolume(r, h);

        double coneVolume = calculateVolume(r, h, true);
	System.out.println("Area of the circle: " + circleArea);
	 System.out.println("Volume of the cylinder: " + cylinderVolume);
        System.out.println("Volume of the cone: " + coneVolume);


    }
}
