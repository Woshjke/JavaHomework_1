package lab7.task4;

/**
 * Создать enum RGB с 3 полями(r,g,b) и значениями основных цветов радуги: black, white, red, green, yellow, blue, pink, gray, brown, orange, purple.
 * Реализовать методы:
 * •	вывести представление цвета в 16тиричной системе, например #ff0000
 * •	получить следующий цвет
 * •	получить предыдущий цвет
 * Продемонстрировать возможности нового enum  а также “values, ordinal,  ==, equals”
 */
public enum RGB {
    WHITE(1, 2, 3),
    BLACK(4, 5, 6),
    RED(7, 8, 9),
    GREEN(10, 11, 12),
    YELLOW(13, 14, 15),
    BLUE(16, 17, 18),
    PINK(19, 20, 21),
    GRAY(22, 23, 24),
    BROWN(25, 26, 27),
    ORANGE(28, 29, 30),
    PURPLE(31, 32, 33);

    private int r;
    private int g;
    private int b;

    RGB(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public void toHex() {
        System.out.println("Red: " + Integer.toHexString(this.r));
        System.out.println("Green: " + Integer.toHexString(this.g));
        System.out.println("Blue: " + Integer.toHexString(this.b));
    }

    public RGB getNext() {
        int ord = this.ordinal();
        if (ord == 10) {
            return RGB.values()[0];
        }
        return RGB.values()[++ord];
    }

    public RGB getPrev() {
        int ord = this.ordinal();
        if (ord == 0) {
            return RGB.values()[10];
        }
        return RGB.values()[--ord];
    }
}
