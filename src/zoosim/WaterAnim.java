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
public class WaterAnim extends Animal implements ISwimmable{

    // created by netbeans
    public WaterAnim(String id, String name, String species, String sex, int age, int x, int y, String size, int speed, int direction, int hunger, int fatigue, String image, String sound) {
        super(id, name, species, sex, age, x, y, size, speed, direction, hunger, fatigue, image, sound);
    }

    public void canSurface(boolean surface) {
    }
    
}
