/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceLocatorPattern;

/**
 *
 * @author Ali-PC
 */
public class InitialContext {

    public Object lookup(String jndiName) {
        if (jndiName.equalsIgnoreCase("SERVICE1")) {
            System.out.println("Looking up and creating a new Service1 obj.");
            return new Service1();
        } else if (jndiName.equalsIgnoreCase("SERVICE2")) {
            System.out.println("Looking up and creating a new Service2 obj.");
            return new Service2();
        } else {
            return null;
        }
    }

}
