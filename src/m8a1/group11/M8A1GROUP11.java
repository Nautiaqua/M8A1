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
        
        System.out.println();
        System.out.println("Original Order:");
        for (int x = 0; x < 5; x++) { // Number 1. Display the original list (the way the user entered the integers).
            System.out.println(IntegerList[x]);
        }
        
        System.out.println();
        System.out.println("Reversed Order:");
        for (int y = 4; y != -1; y--) { // Number 2. Display the reverse order.
            System.out.println(IntegerList[y]);
        }
    }
}
