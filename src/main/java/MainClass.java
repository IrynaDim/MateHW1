public class MainClass {
    public static void main(String[] args) {
        Figure[] figures = new Figure[(int) (Math.random() * 9 + 1)];
        for (int i = 0; i < figures.length; i++) {
            switch ((int) ((Math.random() * 4))) {
                case 0:
                    figures[i] = new Circle(Math.random() * 10 + 1, randomColor());
                    break;
                case 1:
                    figures[i] = new Trapezoid(randomColor(), (int) Math.random() * 10 + 1,
                            (int) Math.random() * 10 + 1, (int) Math.random() * 10 + 1, (int) Math.random() * 10 + 1);
                    break;
                case 2:
                    figures[i] = new Triangle(randomColor(), (int) Math.random() * 10 + 1, (int) Math.random() * 10 + 1,
                            (int) Math.random() * 10 + 1);
                    break;
                case 3:
                    figures[i] = new Square(randomColor(), (int) Math.random() * 10 + 1);
                    break;
            }
        }
        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].paint());
        }
    }

    public static String randomColor() {
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
}
