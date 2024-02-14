import java.util.Scanner;

public class Recitation3 {

    public static void main(String[] argv)
    {
        /**
         * Creates a Scanner object called scan which
         * reads inputs.
         */
        Scanner scan = new Scanner(System.in);

        /**
         * Getting user inputs.
         */
        System.out.println("Enter x:");
        double x = scan.nextDouble();

        System.out.println("Enter y:");
        double y = scan.nextDouble();


        /**
         * Creates the Circle objects circle16 and circle40.
         * Also creates Point objects to be able to use
         * value constructor in the Circle class.
         */
        Circle circle16 = new Circle(new Point(x,y), 16.0);
        Circle circle40 = new Circle(new Point(14.0,12.0), 40);

        /**
         * Implication which determines if circle16 and circle40 intersect.
         * If they do, it prints "Circles intersect!"
         * If they don't, it prints "Circles do not intersect!"
         */
        if (circle16.intersects(circle40) == true) {
            System.out.println("Circles intersect!");
        }
        else {
            System.out.println("Circles do not intersect!");

        }




    }
}
