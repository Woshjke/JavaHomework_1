package task8;

public class Square
{
    private int sizeX, sizeY;

    Square(int sizeX, int sizeY){
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }

    public void show(){
        for (int i = 0; i < sizeY; i++){
            for(int b =0; b< sizeY; b++){
                if (i==0 || b == 0 || i == (sizeY-1) || b == (sizeX-1)) System.out.print(1);
                else System.out.print(0);
            }
            System.out.println("");
        }
    }
}
