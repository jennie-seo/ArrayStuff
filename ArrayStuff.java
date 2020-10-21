/*
 * Programmer: Jennie Seo
 * Date: October 21, 2020
 * Purpose: Follows the instruction
 */

import java.util.Scanner;

public class ArrayStuff {
    public static void main (String[] args) {
        // Create the input scanner
        Scanner input = new Scanner(System.in);

        // PART A
        int [] ages = new int [5];

        ages[2] = 18;
        
        System.err.println("Enter an integer:");
        ages[0] = input.nextInt();

        ages[4] = (int)Math.pow(ages[0], 2);
        
        for (int index = 0; index < 5; index++) {
        	System.out.println(ages[index]);
        }

        // PART B
        String [] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};        

        System.out.println(planets[6].charAt(0));

        System.err.println("What do you want to rename Earth to be?");
        planets[2] = input.next();

        planets[0] = planets[2].toUpperCase();

        for (int index = 7; index >= 0; index--) {
        	System.out.println(planets[index]);
        }
        
    }
}
