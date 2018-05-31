package executionTime;

import java.util.Objects;

public class Student  implements Comparable{
    String name;
    int id ;
    String dept;
    private static int couterId = 0;

    Student() {
        this.id = couterId++;
    }

    String getName(){
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDept() {
        return dept;
    }

    @Override
    public int compareTo(Object o) {
        Student s = (Student) o;
        if (this.getId()> s.getId())
            return 1;
        else if (this.getId()< s.getId())
            return -1;
        else return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getId() == student.getId() &&
                Objects.equals(getName(), student.getName()) &&
                Objects.equals(getDept(), student.getDept());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getId(), getDept());
    }
}
