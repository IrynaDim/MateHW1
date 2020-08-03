public class Triangle extends Figure {
    private int cathetusA;
    private int cathetusB;

    public Triangle(String color, int cathetusA, int cathetusB) {
        this.color = color;
        this.cathetusA = cathetusA;
        this.cathetusB = cathetusB;
    }

    public String getColor(String color) {
        return color;
    }

    public int hypotenuse(int cathetusA, int cathetusB) {
        return (int) Math.sqrt(cathetusA * cathetusA + cathetusB * cathetusB);
    }

    public int getSquare(int cathetusA, int cathetusB) {
        int hypotenuse = hypotenuse(cathetusA, cathetusB);
        int semiPerimeter = (int) ((cathetusA + cathetusB + hypotenuse) * 0.5);
        int square = (int) ((2 * Math.sqrt(semiPerimeter * (semiPerimeter - cathetusA) *
                (semiPerimeter - cathetusB) * (semiPerimeter - hypotenuse))) / cathetusA);
        return square;
    }

    public String draw() {
        return "Треугольник, " + "площадь: " + getSquare(cathetusA, cathetusB) + "кв.ед., " +
                "гипотенуза: " + hypotenuse(cathetusA, cathetusB) + "ед., " + "цвет: " + getColor(color);
    }
}
