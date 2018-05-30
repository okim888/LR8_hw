package executionTime;

import java.util.Set;
import java.util.TreeSet;

public class hw_3_time_adding_treeSet {
    public static void main(String[] args) {
//добавляем
        long startAdding = System.currentTimeMillis();
        System.out.println("The program starts adding objects to TreeSet");

        Set<Student> usersSet2 = new TreeSet <>();
        for (int i = 0; i < 1000000; i++) {
            usersSet2.add(new Student());
        }

        long timeSpentForAdding = System.currentTimeMillis() - startAdding;
        System.out.println("Execution time for adding: " + timeSpentForAdding + " milliseconds");
//удаляем
        System.out.println("The program starts removing objects from TreeSet");
        long startRemoving = System.currentTimeMillis() - timeSpentForAdding;
        usersSet2.clear();
        long timeSpentFOrRemoving = System.currentTimeMillis() - startRemoving;
        System.out.println("Execution time for removing: " + timeSpentFOrRemoving);
    }
}
