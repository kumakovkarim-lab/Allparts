import java.util.Arrays;

public class Person implements Comparable<Person> {
    String firstname;
    String lastname;
    int weight;
    int height;

    public Person(String firstname, String lastname, int weight, int height) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "("+firstname + "," + lastname+ "," + weight + "," + height+")";
    }

    @Override
    public int compareTo(Person that) {
        // implement this according to your variant
        if (this.weight != that.weight) {
            return Integer.compare(this.weight, that.weight);
        }
        int nameComp = this.firstname.compareTo(that.firstname);
        if (nameComp != 0) {
            return nameComp;
        }
        return this.lastname.compareTo(that.lastname);
    }

    static void main() {
        Person[] persons = {
                new Person("Viktor","Petrov", 77, 173),
                new Person("Amina", "Rahman", 55, 167),
                new Person("Sofia", "Markovic", 60, 166),
                new Person("Mateusz", "Nowak", 69, 160),
                new Person("Timur", "Bekzat", 70, 169),
                new Person("Noor", "Al-Hassan", 120, 200),
                new Person("Daniel", "Kovalenko", 101, 180),
                new Person("Elena", "Smirnova", 65, 175),
                new Person("Arman", "Sadykov", 105, 175),
                new Person("Lucas", "Ferreira", 93, 190)
        };

        // Сортируем и выводим для проверки
        ElementarySort.sort(persons);
        System.out.println(Arrays.toString(persons));
    }
}