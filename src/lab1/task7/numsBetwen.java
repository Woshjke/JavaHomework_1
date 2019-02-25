package lab1.task7;

public class numsBetwen {
    private int firstNumber, secondNumber;

    numsBetwen(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    /**
     * This method displays numbers in a given range times, equal to its value.
     */
    public void output() {
        if (firstNumber == secondNumber) {System.out.println("Введеные числа одинаковые!"); return;}
        if (firstNumber <=0 || secondNumber <= 0) {System.out.println("Ошибка! Какое-то из введенных чисел <= 0"); return;}
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
