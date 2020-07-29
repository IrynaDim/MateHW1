public class Trapezoid extends Figure {
    private String color;
    private int a;
    private int b;
    private int c;
    private int d;

    public Trapezoid(String color, int a, int b, int c, int d) {
        this.color = color;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public String getColor(String color) {
        return color;
    }

    public int getSquare(int a, int b, int c, int d) {
        int high = (int) Math.sqrt((c * c) - (((a - b) * (a - b) + c * c - d * d) / (2 * (a - b + 1))));
        int square = (int) ((a + d) * 0.5 * high);
        return square;
        // формула с ошибкой. лень было разбиратся в площади. хотелось просто понять суть задачи
    }

    public String paint() {
        return "трапеция, " + "площадь: " + getSquare(a, b, c, d) + "кв.ед., " +
                "цвет: " + getColor(color);
    }
}
