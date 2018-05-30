package executionTime;

import java.util.ArrayList;
import java.util.List;

public class hw8_3_time_remove_Array {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        System.out.println("The program starts for adding objects to ArrayList");

        List<Student> usersList = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            usersList.add(new Student());
        }

        long end = System.currentTimeMillis();
        long timeSpent = end - start;
        System.out.println("Execution time is " + timeSpent + " milliseconds");
    }
}
