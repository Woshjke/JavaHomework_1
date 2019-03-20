package lab8;

import lab8.task1.Encoder;
import lab8.task2.CompanyList;
import lab8.task2.UserElement;
import lab8.task3.StackArray;
import lab8.task4.Sort;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        //task1
        Encoder encoder = new Encoder(12345, "abba");
        System.out.println(encoder.encodeToInt());
        System.out.println(encoder.encodeToString());


        //task2
        CompanyList<UserElement> list = new CompanyList<>();
        list.add(new UserElement("MyName", "MyDepartment", "+375295286578", Calendar.getInstance()));
        for (UserElement iter : list) {
            System.out.println(iter);
        }


        //task3
        StackArray<String> stringStackArray = new StackArray<>();
        stringStackArray.push("Hello");
        stringStackArray.push(", ");
        stringStackArray.push("World");
        System.out.println(stringStackArray.pop());
        System.out.println(stringStackArray.pop());
        System.out.println("Stack size: " + stringStackArray.size());


        //task4
        Integer[] arr = new Integer[]{2, 3, 4, 7, 10, 1, 100, 1024};
        Character[] arr2 = new Character[]{'b', 'a', 'c', 'w', 'i', 'k'};

        Sort<Integer> sort = new Sort<>(arr);
        Sort<Character> sort2 = new Sort<>(arr2);
        sort2.sort();
        sort.sort();
        System.out.println(sort2);
        System.out.println(sort);
    }

}
