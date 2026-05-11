import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        // implement this according to your variant
        int lastComp = o1.lastname.compareTo(o2.lastname);
        if (lastComp != 0) {
            return lastComp;
        }
        int firstComp = o1.firstname.compareTo(o2.firstname);
        if (firstComp != 0) {
            return firstComp;
        }
        return Integer.compare(o1.weight, o2.weight);
    }
}