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

// interface extending IObject interface that includes methods of:
// move, make sound, eat, and sleep
public interface IEntity extends IObject{
    public void move();
    public void makeSound();
    public void eat();
    public void sleep();
}
