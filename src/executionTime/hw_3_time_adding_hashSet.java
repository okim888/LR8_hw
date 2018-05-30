package executionTime;

import java.util.HashSet;
import java.util.Set;

public class hw_3_time_adding_hashSet {
    public static void main(String[] args) {
//добавляем
        long startAdding = System.currentTimeMillis();
        System.out.println("The program starts adding objects to HashSet");

        Set<Student> usersSet = new HashSet <>();
        for (int i = 0; i < 1000000; i++) {
            usersSet.add(new Student());
        }

        long timeSpentForAdding = System.currentTimeMillis() - startAdding;
        System.out.println("Execution time for adding: " + timeSpentForAdding + " milliseconds");
//удаляем
        System.out.println("The program starts removing objects from HashSet");
        long startRemoving = System.currentTimeMillis() - timeSpentForAdding;
        usersSet.clear();
        long timeSpentFOrRemoving = System.currentTimeMillis() - startRemoving;
        System.out.println("Execution time for removing: " + timeSpentFOrRemoving);
    }
}
