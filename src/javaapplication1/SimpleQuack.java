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
public class SimpleQuack implements iQuackInterface {

    @Override
    public void quack() {
        System.out.println("Quack quack");
    }
   
}
