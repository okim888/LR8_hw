package executionTime;

import java.util.HashSet;
import java.util.Iterator;
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
        System.out.println(usersSet.size());

//поиск
        long startSerching = System.currentTimeMillis();
        System.out.println("The program starts searching objects");
        long endOfSearch = 0;
        for (Student s: usersSet){
            if (s.getId() == 600000)
                endOfSearch = System.currentTimeMillis();
        }

        long timeSpentForSearching = endOfSearch - startSerching;
        System.out.println("Execution time for searching: " + timeSpentForSearching + " milliseconds");

//удаляем
        System.out.println("The program starts removing objects from HashSet");
        long startRemoving = System.currentTimeMillis();
//            usersSet.clear();
//        for (int i = 0; i < 1000000; i++) {
//            usersSet.remove(i);
//        }

        Iterator<Student> iterator = usersSet.iterator();
        while(iterator.hasNext()) {
            Student setElement = iterator.next();
                iterator.remove();
        }
        long timeSpentFOrRemoving = System.currentTimeMillis() - startRemoving;
        System.out.println("Execution time for removing: " + timeSpentFOrRemoving);
        System.out.println(usersSet.size());
    }
}
