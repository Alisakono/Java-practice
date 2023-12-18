package Practice2;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(12),
                new Circle(58.8),
                new Rectangle(15, 20),
                new Rectangle(45.7, 21.5)
        };
        for (Shape shape:shapes){
            System.out.println(shape.calculateArea()+" "+ shape.getType());
        }
    }
}
