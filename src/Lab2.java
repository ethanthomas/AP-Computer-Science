/**
 * Created by user on 11/18/14.
 */
public class Lab2 {



    public static void main(String[] args) {

        APRectangle rectangle = new APRectangle(new APPoint(2.0, 3.0), 10.0, 20.0);

        System.out.println("top left: " + rectangle.getTopLeft());
        System.out.println("top right: " + rectangle.getTopRight());
        System.out.println("bottom right: " + rectangle.getBottomRight());
        System.out.println("bottom left: " + rectangle.getBottomLeft());

        rectangle.shrink(50);

        System.out.println("new APRectangle shrunk to 50%: " + rectangle.getTopLeft() + " " + rectangle.getWidth() + ", " + rectangle.getHeight());

    }
}
