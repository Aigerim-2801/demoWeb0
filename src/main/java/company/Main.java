package company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input circle radius: ");
        double radius = sc.nextDouble();
        System.out.println("=============================");
        System.out.println(" ");
        System.out.println("Input rectangle's parameters ");
        System.out.println("Enter length: ");
        double length = sc.nextDouble();
        System.out.println("Enter width: ");
        double width = sc.nextDouble();
        Interface1 operation = (radius1) -> {
            double result = radius1 * radius1 * 3.14;
            return result;
        };
//        Interface1 obj1 = new Interface1() {};
        System.out.println("Area of Circle: " +operation.compute(radius));
        System.out.println("Area of Rectangle: " +operation.calculate(length,width));

    }
}
