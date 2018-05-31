package executionTime;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class hw8_3_time_adding_Linked {
    public static void main(String[] args) {
//добавляем
        long startAdding = System.currentTimeMillis();
        System.out.println("The program starts adding objects to LinkedList");

        List <Student> usersList = new LinkedList <>();
        for (int i = 0; i < 1000000; i++) {
            usersList.add(new Student());
        }

        long timeSpentForAdding = System.currentTimeMillis() - startAdding;
        System.out.println("Execution time for adding: " + timeSpentForAdding + " milliseconds");
        System.out.println(usersList.size());

//поиск
        long startSearching = System.currentTimeMillis();
        System.out.println("The program starts searching objects");

        usersList.get(600000);

        long timeSpentForSearching = System.currentTimeMillis() - startSearching;
        System.out.println("Execution time for searching: " + timeSpentForSearching + " milliseconds");

//удаляем
        System.out.println("The program starts removing objects from LinkedList");
        long startRemoving = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            usersList.remove(0);
        }
//        usersList2.clear();
        long timeSpentFOrRemoving = System.currentTimeMillis() - startRemoving;
        System.out.println("Execution time for removing: " + timeSpentFOrRemoving);
        System.out.println(usersList.size());
    }
}
