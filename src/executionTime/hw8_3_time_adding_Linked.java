package executionTime;

import java.util.LinkedList;
import java.util.List;

public class hw8_3_time_adding_Linked {
    public static void main(String[] args) {
//добавляем
        long startAdding2 = System.currentTimeMillis();
        System.out.println("The program starts adding objects to LinkedList");

        List <Student> usersList2 = new LinkedList <>();
        for (int i = 0; i < 1000000; i++) {
            usersList2.add(new Student());
        }

        long timeSpentForAdding2 = System.currentTimeMillis() - startAdding2;
        System.out.println("Execution time for adding: " + timeSpentForAdding2 + " milliseconds");
        System.out.println(usersList2.size());
//удаляем
        System.out.println("The program starts removing objects from LinkedList");
        long startRemoving2 = System.currentTimeMillis() - timeSpentForAdding2;
        for (int i = usersList2.size()-1; i >= 0; i--) {
            usersList2.remove(i);
        }
        long timeSpentFOrRemoving = System.currentTimeMillis() - startRemoving2;
        System.out.println("Execution time for removing: " + timeSpentFOrRemoving);
        System.out.println(usersList2.size());
    }
}
