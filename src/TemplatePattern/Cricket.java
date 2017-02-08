/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemplatePattern;

/**
 *
 * @author Ali-PC
 */
public class Cricket extends Game {

    @Override
    void initialize() {
        System.out.println("Cricket game initialized.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket game started. Enjoy the game.");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket game Finished.");
    }

}
