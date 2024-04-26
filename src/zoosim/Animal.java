/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 * 2024/04/23
 * @author angela
 * ICS4U
 */
public class Animal implements IEntity{
    // static variable for counting amount of animals
    static int count;
    // declare variables
    private String id;
    private String name;
    private String species;
    private String sex;
    private int age;
    private int x;
    private int y;
    private String size;
    private int speed;
    private int direction;
    private int hunger;
    private int fatigue;
    private String image;
    private String sound;
    
    // contructor when uploading all information of an animal
    public Animal(String id, String name, String species, String sex, int age, int x, int y, String size, int speed, int direction, int hunger, int fatigue, String image, String sound){
        this.id = id;
        this.name = name;
        this.species = species;
        this.sex = sex;
        this.age = age;
        this.x = x;
        this.y = y;
        this.size = size;
        this.speed = speed;
        this.direction = direction;
        this.hunger = hunger;
        this.fatigue = fatigue;
        this.image = image;
        this.sound = sound;
        count++;
    }
    
    // constructor with added less information (only for knowing animal)
    public Animal(String id, String name, String species, String sex, int age, int speed, String sound){
        this.id = id;
        this.name = name;
        this.species = species;
        this.sex = sex;
        this.age = age;
        this.speed = speed;
        this.sound = sound;
        count++;
    }
    
    /**
     * Print a default of the animal sound to the screen
     */
    public void makeSound(){
        System.out.println(sound);
    }
   
    /**
     * Print movement of the animal based on its speed and direction to the screen
     */
    public void move(){
        // formula to use directions
        double directionRad = Math.toRadians(direction);
        // moving x variable
        double xMovement = speed*Math.cos(directionRad);
        x += xMovement;
        // moving y variable
        double yMovement = speed*Math.sin(directionRad);
        y += yMovement;
        // printing what was moved to the screen and what the finish place is
        System.out.println(name+" moved "+xMovement+" in x, and "+yMovement+" in y.");
        System.out.println(name+" ended up on ("+x+", "+y+")");
    }
    
    /**
     * Restores the hunger and prints it to the screen
     */
    public void eat(){
        hunger = 100;
        System.out.println(name+" ate, the hunger has been restored");
    }
    
    /**
     * Restores the fatigue and prints it to the screen
     */
    public void sleep(){
        fatigue = 0;
        System.out.println(name+"'s fatigue has been restored from sleeping");
    }
    
    /**
     * Turns a certain number of degrees
     * @param degree    degrees to be turned
     */
    public void turn(int degree){
        direction+=degree;
    }
    
    /**
     * Prints and sets the position/place of the animal
     * @param x     number at x variable
     * @param y     number at y variable
     */
    public void place(int x, int y){
        this.x = x;
        this.y = y;
        System.out.println(name+" is at "+x+", "+y);
    }
    
    // not needed, did it wrong
//    /** 
//     * Puts animal to sleep if there fatigue is at 100
//     */
//    public void goSleep(){
//        if (fatigue == 100){
//            fatigue = 0;
//            System.out.println(name+" has gone to sleep");
//        }
//    }
//    
//    /**
//     * Lets all hungry animal eat if there hunger is at 0
//     */
//    public void hungryAnim(){
//        if (hunger == 0){
//            hunger = 100;
//            System.out.println(name+" ate food");
//        }
//    }
    
    /**
     * Display amount of animals logged into the zoo system
     */
    public static void displayStatic(){
        System.out.println("There has been "+count+" animals logged into the zoo system");
    }
    
    // getter for id
    public String getId(){
        return id;
    }
    
    // getter for name
    public String getName(){
        return name;
    }
    
    // getter for species
    public String getSpecies(){
        return species;
    }
    
    // getter for sex
    public String getSex(){
        return sex;
    }
    
    // getter for age 
    public int getAge(){
        return age;
    }
    
    // getter for x
    public int getX(){
        return x;
    }
    
    // getter for y
    public int getY(){
        return y;
    }
    
    // getter for size
    public String getSize(){
        return size;
    }
    
    // getter for hunger
    public int getHunger(){
        return hunger;
    }
    
    // getter for fatigue
    public int getFatigue(){
        return fatigue;
    }
    
    // setter for x 
    public void setX(int x){
        this.x = x;
    }
    
    // setter for y
    public void setY(int y){
        this.y = y;
    }
    
    // setter for size
    public void setSize(String size){
        this.size = size;
    }
    
    // setter for direction
    public void setDirection(int direction){
        this.direction = direction;
    }
}
