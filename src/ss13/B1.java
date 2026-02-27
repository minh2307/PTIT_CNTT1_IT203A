package src.ss13;

import java.util.ArrayList;
import java.util.Iterator;

public class B1 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();

        list.add(36.5);
        list.add(40.2);
        list.add(37.0);
        list.add(12.5);
        list.add(39.8);
        list.add(99.9);
        list.add(36.8);

        System.out.println("Danh sách ban đầu: " + list);

        // Iterator remove vlaue not valid
        Iterator<Double> iterator = list.iterator();

        while (iterator.hasNext()) { // check next element
            Double temp = iterator.next(); // next element
            if (temp < 34.0 || temp > 42.0) {
                iterator.remove();
            }
        }

        // average temperature

        double sum = 0;
        for (Double temp : list) {
            sum += temp;
        }
        double average = list.size() > 0 ? sum / list.size() : 0;

        System.out.println("Danh sách sau khi lọc: " + list);
        System.out.println("Nhiệt độ trung bình: " + average);
    }
}
