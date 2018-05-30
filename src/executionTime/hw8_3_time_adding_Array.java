package executionTime;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class hw8_3_time_adding_Array {
    public static void main(String[] args) {
//добавляем
        long startAdding = System.currentTimeMillis();
        System.out.println("The program starts adding objects to ArrayList");

        List<Student> usersList = new ArrayList <>();
        for (int i = 0; i < 1000000; i++) {
            usersList.add(new Student());
        }

        long timeSpentForAdding = System.currentTimeMillis() - startAdding;
        System.out.println("Execution time for adding: " + timeSpentForAdding + " milliseconds");
        System.out.println(usersList.size());
//удаляем
        System.out.println("The program starts removing objects from ArrayList");
        long startRemoving = System.currentTimeMillis() - timeSpentForAdding;
        for (int i = usersList.size()-1; i >= 0; i--) {
            usersList.remove(i);
        }
        long timeSpentFOrRemoving = System.currentTimeMillis() - startRemoving;
        System.out.println("Execution time for removing: " + timeSpentFOrRemoving);
        System.out.println(usersList.size());
    }
}