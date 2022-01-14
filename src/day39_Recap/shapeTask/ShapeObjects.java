package day39_Recap.shapeTask;

public class ShapeObjects {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5,6);
        System.out.println(rectangle);

        rectangle.setLength(10);

        System.out.println(rectangle.getLength());

        System.out.println(rectangle);

        System.out.println(rectangle.getName());

        System.out.println("==============================");

        Circle circle = new Circle(10);

        System.out.println(circle);

        System.out.println(circle.getRadius());



    }
}
