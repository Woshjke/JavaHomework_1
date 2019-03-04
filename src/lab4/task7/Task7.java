package lab4.task7;

public class Task7 {
    public static boolean isValidPassword(String password) {
        return password.matches("^((?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])).{8,}$");
    }
}
