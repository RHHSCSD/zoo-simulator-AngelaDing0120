/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 * 2024/04/24
 * @author angela
 * ICS4U
 */
public class BirdAnim extends Animal implements IFlyable{
    
    private boolean flying = false;
    
    // declared variable
    private boolean canFly;

    // netbeans added
    public BirdAnim(String id, String name, String species, String sex, int age, int x, int y, String size, int speed, int direction, int hunger, int fatigue, String image, String sound) {
        super(id, name, species, sex, age, x, y, size, speed, direction, hunger, fatigue, image, sound);
    }

    public void fly(){
        flying = true;
    }

    public void land(){
        flying = false;
    }

    public void isFlying(){
        flying = true;
    }
    
}
