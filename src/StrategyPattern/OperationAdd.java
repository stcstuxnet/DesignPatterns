/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyPattern;

/**
 *
 * @author Ali-PC
 */
public class OperationAdd implements Strategy {

    @Override
    public int doOperation(int a, int b) {

        return a + b;
    }

}
