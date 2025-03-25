/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m8a1.group11;
import java.util.*;
/**
 *
 * @author WINDOWS
 */
public class M8A1GROUP11 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner obtainer = new Scanner(System.in);
        int[] IntegerList = new int[5];
        
        for (int i = 0; i < 5; i++) { // it asks the user for a max of 5 items, index goes from 0-4
            System.out.print("Enter an integer (5 max): ");
            int input = obtainer.nextInt();
            IntegerList[i] = input;
        }
        
        int[] IntegerListClone = IntegerList.clone();
        
        System.out.println();
        System.out.println("1. Display original order:");
        for (int x = 0; x < 5; x++) { // Number 1. Display the original list (the way the user entered the integers).
            System.out.println(IntegerList[x]);
        }
        
        System.out.println();
        System.out.println("2. Display reversed order:");
        for (int y = 4; y != -1; y--) { // Number 2. Display the reverse order.
            System.out.println(IntegerList[y]);
        }
        System.out.println();
        System.out.println("3. Display the original list again:");
        for (int x = 0; x < 5; x++) { // Number 3. Display again the original list (the way the user entered the integers).
            System.out.println(IntegerList[x]);
        }
        
        Arrays.sort(IntegerListClone);
        System.out.println();
        System.out.println("4. Display the list in ascending order:");
        for (int x = 0; x < 5; x++) { // Number 4. Sort the original list in ascending order (the way the user entered the integers).
            System.out.println(IntegerListClone[x]);
            
            }
        
        System.out.println();
        System.out.println("5. Display the original list:");
        for (int x = 0; x < 5; x++) { // Number 5.
            System.out.println(IntegerList[x]);
        }
               
            
                     System.out.println();
        System.out.print("6. Enter a number you want to search the element of an array: ");
        int searchNum = obtainer.nextInt();
        boolean foundIndex = false;
        int index = -1;
        for (int i = 0; i < 5; i++) {
            if (IntegerList[i] == searchNum) {
                foundIndex = true;
                index = i;
                break;
            }
        }
        if (foundIndex) {
            System.out.println("Element " + searchNum + " found at index: " + index);
        } else {
            System.out.println("Element " + searchNum + " NOT found in the list.");
        }
        
        // neil ikaw ka na sa number 6, ginawa na ni calub yung 3,4, and 5
        // ~ jose - pogi si calub
    }
}
            
        
        
        // neil ikaw ka na sa number 6, ginawa na ni calub yung 3,4, and 5
        // ~ jose
        
        // pahingi baked mac ~ calub
    

