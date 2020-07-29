public class Circle extends Figure {
    private String color;
    private double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public String getColor(String color) {
        return color;
    }

    public int getSquare(double radius) {
        return (int) ((int) radius * 3.1415);
    }

    public String paint() {
        return "круг, " + "площадь: " + getSquare(radius) + "кв.ед., " +
                "цвет: " + getColor(color);
    }
}
