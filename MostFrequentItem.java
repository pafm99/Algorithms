// Problem: Find the most frequently occurring item in an array
import java.util.HashMap;

public class MF {
    public static void main(String[] args) {
        // NOTE: The following input values are used for testing the solution.
        // mostFrequent(array1) should return 1.
        int[] array1 = {1, 3, 1, 3, 2, 1};
        // mostFrequent(array2) should return 3.
        int[] array2 = {3, 3, 1, 3, 2, 1};
        // mostFrequent(array3) should return null.
        int[] array3 = {};
        // mostFrequent(array4) should return 0.
        int[] array4 = {0};
        // mostFrequent(array5) should return -1.
        int[] array5 = {0, -1, 10, 10, -1, 10, -1, -1, -1, 1};
    }

    // Implementation of the solution
    public static Integer mostFreqent(int[] givenArray) {
        Integer maxCount = -1; 
        Integer maxItem = null;
        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        // Iterate through the Array
        for (int i : givenArray) {
            // If the hash table contains key
            if (count.containsKey(i)) {
                // Get the value of the key and increment by one
                Integer newVal = count.get(i) + 1;
                // Replace the old value with the newValue
                count.put(i, newVal);
            } else {
                // Else the put the vey and value of one in the hash table
                count.put(i, 1);
            }
            // if the value of the key is greater than the maxCount
            if (count.get(i) > maxCount) {
                // set the maxCount to value of the key
                maxCount = count.get(i);
                //set maxItem to the key
                maxItem = i;
            }
        }
        return maxItem;
    }
}
