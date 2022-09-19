import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(2, 4);
        Triangle t1 = new Triangle(2, 6);

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(r1);
        shapes.add(t1);

        System.out.println(r1.getRectangleArea());
        System.out.println(t1.getTriangleArea());
}
}