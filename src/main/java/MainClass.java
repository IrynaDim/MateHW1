public class MainClass {
    public static void main(String[] args) {
        Figure[] figures = new Figure[(int) (Math.random() * 9 + 1)];
        getRandomFigure(figures);
        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].draw());
        }
    }

    public static String getRandomColor() {
        int random = (int) (Math.random() * 7);
        switch (random) {
            case 1:
                return "Красный";
            case 2:
                return "Оранжевый";
            case 3:
                return "Желтый";
            case 4:
                return "Зеленый";
            case 5:
                return "Голубой";
            case 6:
                return "Синий";
            case 7:
                return "Фиолетовый";
            default:
                return "Черный";
        }
    }

    public static Figure[] getRandomFigure(Figure[] figures) {
        for (int i = 0; i < figures.length; i++) {
            switch ((int) ((Math.random() * 4))) {
                case 0:
                    figures[i] = new Circle(Math.random() * 10 + 5, getRandomColor());
                    break;
                case 1:
                    figures[i] = new Trapezoid(getRandomColor(),
                            (int) Math.random() * 10 + 5,
                            (int) Math.random() * 10 + 15,
                            (int) Math.random() * 10 + 5);
                    break;
                case 2:
                    figures[i] = new Triangle(getRandomColor(), (int) Math.random() * 10 + 5,
                            (int) Math.random() * 10 + 5);
                    break;
                case 3:
                    figures[i] = new Square(getRandomColor(),
                            (int) Math.random() * 10 + 5);
                    break;
            }
        }
        return figures;
    }
}
