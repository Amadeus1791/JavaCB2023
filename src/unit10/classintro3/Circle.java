package unit10.classintro3;

public class Circle {
    // fields
    private static int numOfCreatedCircles;
    private int radius;

    // constructors


    public Circle(int radius) {
        this.radius = radius;
        numOfCreatedCircles++;
    }

    public Circle() {
        radius = 1;
        numOfCreatedCircles++;
    }


    // methods
    private double perimeter() {
        return 2 * radius * Math.PI;
    }

    private double area() {
        return radius * radius * Math.PI;
    }

    void printComplete() {
        System.out.println("circle with radius " + radius);
        System.out.println("perimeter " + perimeter());
        System.out.println("area " + area());
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius < 10 && radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Please try another radius");
        }
    }

    public static int getNumberOfCreatedCircle() {
        return numOfCreatedCircles;
    }
}
