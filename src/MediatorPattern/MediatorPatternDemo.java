/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MediatorPattern;

/**
 *
 * @author Ali-PC
 */
public class MediatorPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi, John!");
        john.sendMessage("Hello, Robert!");
    }

}
