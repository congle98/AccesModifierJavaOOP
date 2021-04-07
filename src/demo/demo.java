package demo;

public class demo {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        double r = circle.getRadius();
        double area = circle.getArea();
        System.out.println(r);
        System.out.println(area);
    }
}
