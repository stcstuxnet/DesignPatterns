/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProxyPattern;

/**
 *
 * @author Ali-PC
 */
public class ProxyPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Image image = new ProxyImage("test_10mb.jpg");

        image.display();

        System.out.println("");

        image.display();
    }

}
