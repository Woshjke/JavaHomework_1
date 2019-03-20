package lab8.task2;

import java.util.Calendar;

public class EquipmentElement {

    private String name;
    private String inv_number;
    private Calendar calendar;

    public EquipmentElement(String name, String inv_number, Calendar calendar) {
        this.name = name;
        this.inv_number = inv_number;
        this.calendar = calendar;
    }

    @Override
    public String toString() {
        return "EquipmentElement{" +
                "name='" + name + '\'' +
                ", inv_number='" + inv_number + '\'' +
                ", calendar=" + calendar.getTime() +
                "}\n";
    }
}
