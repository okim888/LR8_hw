package executionTime;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class hw_3_time_adding_treeSet {
    public static void main(String[] args) {
//добавляем
        long startAdding = System.currentTimeMillis();
        System.out.println("The program starts adding objects to TreeSet");

        Set<Student> usersSet = new TreeSet <>();
        for (int i = 0; i < 1000000; i++) {
            usersSet.add(new Student());
        }

        long timeSpentForAdding = System.currentTimeMillis() - startAdding;
        System.out.println("Execution time for adding: " + timeSpentForAdding + " milliseconds");
        System.out.println(usersSet.size());
//поиск
        long startSearching = System.currentTimeMillis();
        System.out.println("The program starts searching objects");
        long endOfSearch = 0;
        for (Student s: usersSet){
            if (s.getId() == 500000)
                endOfSearch = System.currentTimeMillis();
        }

        long timeSpentForSearching = endOfSearch - startSearching;
        System.out.println("Execution time for searching: " + timeSpentForSearching + " milliseconds");


//удаляем
        System.out.println("The program starts removing objects from TreeSet");
        long startRemoving = System.currentTimeMillis() - timeSpentForAdding;
            usersSet.clear();
//        for (usersSet2.size()-1; i >= 0; i--) {
//            usersSet2.remove(i);
//        }
//        Iterator<Student> iterator = usersSet2.iterator();
//        while(iterator.hasNext()){
//            iterator.remove();
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
