import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ConvertArrayIntoArrayList6 {

    public static void main(String[] args) {
        
        String[] name = {"Siva", "Moni", "Vishu"};
        
        // Convert array into a dynamic ArrayList
        List<String> val2 = new ArrayList<>(Arrays.asList(name));
        
        // Now you can add new elements
        val2.add("Kasu");
        val2.add("Ayya");
        val2.add("Rangs");
        
        // Check if "Ayya" exists
        System.out.println("Contains Ayya? " + val2.contains("Ayya"));
        
        // Print the final list
        System.out.println(val2);
    }
}
