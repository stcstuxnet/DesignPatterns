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
public class AbstractFactoryPatternDemo {

    /*
     *Burada factorylerin bir factorysi vardır. FactoryProducer.getFactory("seçenek") seçenek
    cinsinden factory döndürür. Her factory abstract bir factory superclass'ını extend eder.
    Burada color factory de shape factory de AbstactFactoryi extend eder, biri getShape'te iş yapar ötekinde
    null döndürür öteki de getColor da iş yapar ötekinde null döndürür

     */
    public static void main(String[] args) {
        // TODO code application logic here

        FactoryProducer.getFactory("color").getColor("red").fill();

    }

}
