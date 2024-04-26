/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zoosim;

import java.util.*;

/**
 * 2024/04/23
 * @author Angela Ding
 * ICS4U
 */
public class ZooSim {

    /**
     * Creates an array list for storing objects (animals) 
     * Creates animal objects and add them to the array list
     * Test features inside the animal class
     * Checks if any animal in the array list is sleepy or hunger
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an array list used for storing animal objects
        ArrayList<Animal> animals = new ArrayList();
        // create animal object
        Animal num1 = new Animal("12345","Angela","human","F",17,0,0,"171",60,180,0,100,"Nothing","HELLO");
        // adds it to the array list
        animals.add(num1);
        // creates animal object
        Animal animal2 = new Animal("23456","RD","Teacher","M",18,120,"GOWORK");
        // adds it to the array list
        animals.add(animal2);
        
        // looping through the array list to see if any animal is hunger or sleepy
        for (int i=0; i<animals.size(); i++){
            for (Animal animal : animals) {
                // Check and act on fatigue
                if (animal.getFatigue() == 100) {
                    // run sleeping method
                    animal.sleep();
                }

                // Check and act on hunger
                if (animal.getHunger() == 0) {
                    // run eating method
                    animal.eat();
                }
            }
        }
        
        // testers
        // display amount of animals set into the zoo system
        Animal.displayStatic();
//        animal1.move();
//        animal1.eat();
        
    }
}

// thinking question
/*
Question:
    How would you modify this structure to allow for predator/prey interactions and
    Carnivores/Omnivores/Herbivores
Answer:
    Update the Animal class to include a diet type parameter, using an enum for the 
    diet categories, to add interactions to your zoo simulator such as predator or 
    prey and diverse nutritional patterns (Carnivores, Omnivores, Herbivores). 
    Next, develop techniques that let animals engage with one other according to 
    their proximity and nutrition. With this configuration, more realistic behaviors 
    like pursuing or avoiding will be simulated, with each animal's food requirements 
    and innate tendencies taking precedence.
*/
