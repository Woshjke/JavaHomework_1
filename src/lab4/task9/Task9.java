package lab4.task9;

public class Task9 {
    public static boolean isPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("^([+][375]).{11,13}$") || phoneNumber.matches("^[80].{10,}$");
    }
}
