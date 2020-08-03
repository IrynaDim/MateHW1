public class Trapezoid extends Figure {
    private int sideA;
    private int sideB;
    private int sideD;

    public Trapezoid(String color, int sideA, int sideB, int sideD) {
        this.color = color;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideD = sideD;
    }

    public String getColor(String color) {
        return color;
    }

    public int getSideC(int sideA, int sideB, int sideD) {
        int sideC = (int) Math.sqrt(sideD * sideD - (sideA * sideA - sideB * sideB) * (sideA * sideA - sideB * sideB));
        return sideC;
    }

    public int getSquare(int sideA, int sideB, int sideD) {
        int sideC = getSideC(sideA, sideB, sideD);
        int high = (int) Math.sqrt((sideC * sideC) - (((sideA - sideB) * (sideA - sideB) + sideD * sideD - sideD * sideD)
                / (2 * (sideA - sideB))));
        int square = (int) ((sideA + sideD) * 0.5 * high);
        return square;
    }

    public String draw() {
        return "трапеция, " + "площадь: " + getSquare(sideA, sideB, sideD) + "кв.ед., " +
                "цвет: " + getColor(color);
    }
}
