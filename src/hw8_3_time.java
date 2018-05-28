import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class hw8_3_time {
    public static void main(String[] args) {
        List<Student> usersList = new LinkedList<>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            usersList.add(new Student());
        }
        long end = System.currentTimeMillis();
        long seconds = TimeUnit.NANOSECONDS.toSeconds(end - start);
        System.out.println("EXECUTION TIME: " + seconds);
    }
}