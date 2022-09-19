public class Triangle extends Shape {

    public Triangle(int width, int height){
        super(width, height);

    }
    public int getTriangleArea() {
        return (getArea()) / 2;
    }

   // public void toString() {
   //     System.out.println(getTriangleArea());
    //}
}
