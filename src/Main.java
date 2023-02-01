public class Main {
    public static void main(String[] args)
    {
        Circle C1 = new Circle();
        System.out.println("Default Constructor: \n"
                + "Colour: " + C1.getColour()
                + "\nRaduis: " + C1.getRadius()
                + "\nArea: " + C1.getArea()
                + "\nString: " + C1.toString());
    }
}