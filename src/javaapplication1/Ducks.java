/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author kristina
 */
public class Ducks {
       
    public static void display() {
        System.out.println("I'm a duck");
    }
    
     
    public static void quack() {
        SimpleQuack quack = new SimpleQuack();
        quack.quack();
    }
    
    public static void noQuack() {
        NoQuack noQuack = new NoQuack();
        noQuack.quack();
    }
    
}
