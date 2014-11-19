/**
 * Created by user on 11/18/14.
 */
public class APRectangle {

    private APPoint topLeft;
    private double width, height;

    public APRectangle(APPoint tl, double w, double h) {

        topLeft = tl;
        width = w;
        height = h;

    }

    public String getTopLeft() {
        return "(" + topLeft.getX() + ", " + topLeft.getY() + ")";
    }

    public void setTopLeft(APPoint topLeft) {
        this.topLeft = topLeft;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getTopRight() {
        return topLeft.getX() + width;
    }

    public String getBottomRight() {
        return getTopRight() + ", " + getBottomLeft();
    }

    public double getBottomLeft() {
        return topLeft.getY() + width;
    }

    public APRectangle shrink(double percentage) {
        return new APRectangle(topLeft, height * (percentage / 100), width / (percentage / 100));
    }

}