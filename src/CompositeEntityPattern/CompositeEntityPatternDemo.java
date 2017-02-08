/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompositeEntityPattern;

/**
 *
 * @author Ali-PC
 */
public class CompositeEntityPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Client client = new Client();
        client.setData("test", "data");
        client.printData();
        client.setData("secondtest", "data");
        client.printData();
    }

}
