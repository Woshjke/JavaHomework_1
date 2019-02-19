package task7;

public class numsBetwen {
    private int firstNumber, secondNumber;

    numsBetwen(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void output() {
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
