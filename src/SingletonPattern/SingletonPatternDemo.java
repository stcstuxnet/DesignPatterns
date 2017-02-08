/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingletonPattern;

/**
 *
 * @author Ali-PC
 */
public class SingletonPatternDemo {

    /*
    Bir object tipinden birden fazla üretilmemesi gerekiyorsa bu pattern kullanılır.
    getInstance() metodu, Class deklerasyonundaki static objeyi döndürür, her seferinde bunu döndürür.
     */
    public static void main(String[] args) {
        // TODO code application logic here

        SingleObject singleObject = SingleObject.getInstance();
        singleObject.showMessage();
    }

}
