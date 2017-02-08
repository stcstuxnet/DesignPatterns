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
public interface ComputerPartVisitor {

    void visit(Computer computer);

    void visit(Monitor monitor);

    void visit(Mouse mouse);

    void visit(Keyboard keyboard);

}
