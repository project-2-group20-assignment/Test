/**
 * GenerateNumbers.java
 * STEP 7: This class generates six unique lotto numbers
 * @author Kruben Naidoo
 * 
 */

package za.ac.cput.lottoproject;

public class GenerateNumbers {
    public static int numbers[] = new int[6];

    // Homework: this method below stores six unique lotto numbers in the array 'numbers'
    public static void populateValues() {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 48 + 1);
        }
    }
}
