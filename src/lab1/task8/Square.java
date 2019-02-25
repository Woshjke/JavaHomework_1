package lab1.task8;

public class Square {
    private int sizeY, sizeX;
    private char border, inside;

    Square(int sizeX, int sizeY, char border, char inside) {
        this.sizeY = sizeX;
        this.sizeX = sizeY;
        this.border = border;
        this.inside = inside;
    }

    /**
     * This method shows rectangle in a console
     */
    public void show() {
        for (int i = 0; i < sizeX; i++) {
            for (int b = 0; b < sizeY; b++) {
                if (i == 0 || b == 0 || i == (sizeX - 1) || b == (sizeY - 1)) System.out.print(border);
                else System.out.print(inside);
            }
            System.out.println("");
        }
    }
}
