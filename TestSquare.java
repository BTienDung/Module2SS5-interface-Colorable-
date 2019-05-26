package season_5.interfaceColorable;

public class TestSquare {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[2];
        rectangles[0] = new Square(1.2);
        rectangles[1] = new Square(2.2,"red", true);
        for (Rectangle rectangle: rectangles){
            System.out.println(rectangle);
            System.out.println(rectangle.getArea());
            rectangle.howToColor();
        }
    }
}
