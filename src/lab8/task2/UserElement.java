package lab8.task2;

import java.util.Calendar;

public class UserElement {

    private String fio;
    private String department;
    private String phone;
    private Calendar calendar;


    public UserElement(String fio, String department, String phone, Calendar calendar) {
        this.fio = fio;
        this.department = department;
        this.phone = phone;
        this.calendar = calendar;
    }

    @Override
    public String toString() {
        return "UserElement{" +
                "fio='" + fio + '\'' +
                ", department='" + department + '\'' +
                ", phone='" + phone + '\'' +
                ", calendar=" + calendar.getTime() +
                "}\n";
    }
}
