// 6. Write a java program for getting different colors through ArrayList interface and delete nth
// element from the ArrayList object by using remove by index


import java.util.ArrayList;
import java.util.List;

public class ColorSublist {
    public static void main(String[] args) {
        // Creating an ArrayList to store color names
        ArrayList<String> colors = new ArrayList<>();

        // Adding different colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Displaying the full list of colors
        System.out.println("All Colors: " + colors);

        // Extracting the 1st and 2nd elements using subList()
        List<String> extractedColors = colors.subList(0, 2); // index 0 (inclusive) to 2 (exclusive)

        // Displaying the extracted colors
        System.out.println("Extracted Colors (1st and 2nd): " + extractedColors);
    }
}
