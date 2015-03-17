public class Triangle {
    private final double width;
    private final double height;

    public Triangle(double width, double height) {
        if(width <= 0 || height <= 0) throw new RuntimeException();
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}
