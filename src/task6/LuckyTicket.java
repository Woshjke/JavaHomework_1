package task6;

public class LuckyTicket {
    public static boolean isLuckyTicket(String ticketNumber) {
        if (ticketNumber.length() != 6 || !ticketNumber.matches("\\d*")) return false;
        //"\\d*"
        String[] numArr = ticketNumber.split("");
        int sumOfFirstDigits = Integer.parseInt(numArr[0]) + Integer.parseInt(numArr[1]) + Integer.parseInt(numArr[2]);
        int sumOfLastDigits = Integer.parseInt(numArr[3]) + Integer.parseInt(numArr[4]) + Integer.parseInt(numArr[5]);
        if (sumOfFirstDigits == sumOfLastDigits) return true;
        else return false;
    }
}
