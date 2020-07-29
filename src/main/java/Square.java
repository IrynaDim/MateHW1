public class Square extends Figure {
    private String color;
    private int a;

    public Square(String color, int a) {
        this.color = color;
        this.a = a;
    }

    public String getColor(String color) {
        return color;
    }

    public int getSquare(int a) {
        return a * a;
    }

    public int getSide() {
        return a;
    }

    public String paint() {
        return "квадрат, " + "площадь: " + getSquare(a) + "кв.ед., " +
                "строна: " + getSide() + "ед., " + "цвет: " + getColor(color);
    }
}
