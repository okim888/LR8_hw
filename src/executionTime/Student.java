package executionTime;

public class Student  implements Comparable{
    String name;
    int id ;
    String dept;

    Student() {
        this.name = name;
        this.id = id;
        this.dept = dept;
    }

    String getName(){return name;}

    @Override
    public int compareTo(Object o) {
        return 1;
    }
}
