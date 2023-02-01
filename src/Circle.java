public class Circle
{
    private Double radius;
    private String colour;

    // Default Constructor

    // No Argument Constructor
    public Circle()
    {
        this.colour = "green";
        this.radius = 2.0;
    }

    // Overload Constructor
    public Circle(String colour, Double radius)
    {
        this.colour = colour;
        this.radius = radius;
    }

    public double getArea()
    {
        return (3.14*radius*radius);
    }

    public String toString()
    {
        return ("Radius = " + getRadius() + " - Colour = " + getColour());
    }

    //Getters
    public String getColour()
    {
        return colour;
    }

    public double getRadius()
    {
        return radius;
    }
}
