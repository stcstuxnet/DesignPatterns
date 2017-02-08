/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern;

/**
 *
 * @author Ali-PC
 */
public class EnemyShipFactory {
    
    public EnemyShip createEnemyShip(String newShipType){
        
        EnemyShip newShip = null;
        
        if(newShipType.equals("U")){
            newShip = new UFOEnemyShip();
        }
        else if(newShipType.equals("R")){
            newShip = new RocketEnemyShip();
        }
        else if(newShipType.equals("B")){
            newShip = new BigUfoEnemyShip();
        }
        
        return newShip;
        
    }
    
}
