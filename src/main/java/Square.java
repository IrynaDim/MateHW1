public class Square extends Figure {
    private int sideA;

    public Square(String color, int sideA) {
        this.color = color;
        this.sideA = sideA;
    }

    public String getColor(String color) {
        return color;
    }

    public int getSquare(int sideA) {
        return sideA * sideA;
    }

    public int getSide() {
        return sideA;
    }

    public String draw() {
        return "квадрат, " + "площадь: " + getSquare(sideA) + "кв.ед., " +
                "строна: " + getSide() + "ед., " + "цвет: " + getColor(color);
    }
}
