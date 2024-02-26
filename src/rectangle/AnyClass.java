package rectangle;

public class AnyClass {
    public void anyMethod(Rectangle rectangle, int multiple) {
        rectangle.setRight(rectangle.getRight() * multiple);
        rectangle.setLeft(rectangle.getLeft() * multiple);
        ...

    }
}
