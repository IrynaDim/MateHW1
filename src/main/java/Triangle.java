import java.sql.SQLOutput;

public class Triangle extends Figure {
    private String color;
    private int a;
    private int b;
    private int c;

    public Triangle(String color, int a, int b, int c) {
        this.color = color;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getColor(String color) {
        return color;
    }

    public int getSquare(int a, int b, int c) {
        int p = (int) ((a + b + c) * 0.5);
        int square = (int) ((2 * Math.sqrt(p * (p - a) * (p - b) * (p - c))) / a);
        return square;
        // на формулы не смотрим, тут бред =)
    }

    public int hypotenuse(int a, int b, int c) {
        return Math.max(c, Math.max(a, b));
    }

    public String paint() {
        return "треугольник, " + "площадь: " + getSquare(a, b, c) + "кв.ед., " +
                "гипотенуза: " + hypotenuse(a, b, c) + "ед., " + "цвет: " + getColor(color);
    }
}
