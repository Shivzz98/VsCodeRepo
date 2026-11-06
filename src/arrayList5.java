import java.util.ArrayList;

public class arrayList5 {
    public static void main(String[] args) 
    {
        ArrayList<Integer> a = new ArrayList<Integer>();

        a.add(1000);
        a.add(600);
        a.add(700);
        a.add(800);
        a.add(1200);

        a.remove(2); // removes element at index 2 (value 700)

        // Now list has: [500, 600, 800, 900]
        System.out.println(a.get(3)); // valid, prints 900

        System.out.println(a.contains(4)); // false, since 4 is not in the list
    }
}
