/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryPattern;

/**
 *
 * @author Ali-PC
 */
public class Blue implements Color{
   
    @Override
    public void fill() {
        System.out.println("Filled blue.");
    }
    
}
