/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VisitorPattern;

/**
 *
 * @author Ali-PC
 */
public class ComputerDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("displaying Computer.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("displaying Monitor.");

    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("displaying Mouse.");

    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("displaying Keyboard.");

    }

}
