package lab4.task6;

public class Task6 {
    public static void execute(String str) {
        String[] arrOfNums = str.split("\\D+");

        int sumOfNums = 0;
        for (String iter : arrOfNums) {
            sumOfNums += Integer.parseInt(iter);
        }

        System.out.println(sumOfNums);
    }
}
