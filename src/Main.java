import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        Circle C1 = new Circle();
        System.out.println("Default Constructor: \n"
                + "Colour: " + C1.getColour()
                + "\nRaduis: " + C1.getRadius()
                + "\nArea: " + C1.getArea()
                + "\nString: " + C1.toString());

        System.out.println();

        Circle C2 = new Circle("red", 5.5);
        System.out.println("Overload Constructor: \n"
                + "Colour: " + C2.getColour()
                + "\nRaduis: " + C2.getRadius()
                + "\nArea: " + C2.getArea()
                + "\nString: " + C2.toString());

        System.out.println();
        Circle C3 = new Circle("blue", 4.2);
        System.out.println("Third: \n"
                + "Colour: " + C3.getColour()
                + "\nRaduis: " + C3.getRadius()
                + "\nArea: " + C3.getArea()
                + "\nString: " + C3.toString());
    }
}