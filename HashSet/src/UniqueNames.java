import java.util.HashSet;
import java.util.Iterator;

public class UniqueNames<S> {

    public static void main(String[] args)
    {
        HashSet<String> set = new HashSet<>();

        set.add("Alice");
        set.add( "Bob");
        set.add( "Alice");
        set.add( "Charlie");
        set.add( "Bob");


        // Display the names in the HashSet
        System.out.println("Unique Names:");
        //TODO
        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }

}
