
import java.util.*;

public class hw8_1_easy {
    public static void main(String[] args) {
        List <String> testArray = new ArrayList <>();
        System.out.print("ArrayList: ");
        for (int i=1; i<11; i++) {
            System.out.print(i + ", ");
        }
        System.out.println();

        List <Integer> testLinked = new LinkedList <>();
        System.out.print("LinkedList: ");
        for (int i=10; i>0; i--) {
            System.out.print(i + ", ");
        }
        System.out.println();

        Set <Integer> testTree = new TreeSet<>();
        testTree.add(10);
        testTree.add(4);
        testTree.add(3);
        testTree.add(2);
        testTree.add(1);
        testTree.add(6);
        testTree.add(7);
        testTree.add(8);
        testTree.add(9);
        testTree.add(5);
        System.out.println("TreeSet:" + testTree);

        Set <Integer> testHash = new HashSet <>();
        System.out.print("HashSet: ");
        for (int i=10; i>0; i--) {
            testHash.add(i);
        }
        System.out.println(testHash);

    }
}
