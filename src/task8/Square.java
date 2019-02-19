package task8;

public class Square {
    private int sizeY, sizeX;

    Square(int sizeX, int sizeY) {
        this.sizeY = sizeX;
        this.sizeX = sizeY;
    }

    public void show() {
        for (int i = 0; i < sizeX; i++) {
            for (int b = 0; b < sizeY; b++) {
                if (i == 0 || b == 0 || i == (sizeX - 1) || b == (sizeY - 1)) System.out.print(1);
                else System.out.print(0);
            }
            System.out.println("");
        }
    }
}
