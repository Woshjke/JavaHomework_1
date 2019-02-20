package Lab1.task7;

public class numsBetwen {
    private int firstNumber, secondNumber;

    numsBetwen(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    /**
     * This method displays numbers in a given range as many times, equal to its value.
     */
    public void output() {
        if (firstNumber == secondNumber) {System.out.println("Введеные числа одинаковые!"); return;}
        if (firstNumber <=0 || secondNumber <= 0) {System.out.println("Ошибка! Какое-то введенное число <= 0 "); return;}
        int smallerNum, biggerNum;
        if (firstNumber > secondNumber) {
            biggerNum = firstNumber;
            smallerNum = secondNumber;
        } else {
            biggerNum = secondNumber;
            smallerNum = firstNumber;
        }

        for (int i = smallerNum; i <= biggerNum; i++) {
            for (int b = 0; b < i; b++) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
}
