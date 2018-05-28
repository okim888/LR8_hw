import java.util.*;

public class hw8_2_sort
{
    public static void main(String[] args) {
        ArrayList<String> address = new ArrayList<>();
        address.add("222");
        address.add(" 234 Lenina Str");
        address.add("Kosmonavtov2");
        address.add("Kosmonavtov");
        address.add("222 Lenina Str");
        address.add("Andeevsky blv");

        Collections.sort(address); // ArrayList in ascending order

        System.out.println("List after sorting by Collection.sort() :\n" + address);
    }
}
