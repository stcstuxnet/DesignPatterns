package FactoryPattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ali-PC
 */
public class FactoryPatternDemo {

    /*

    Factory, bir abstact class'tan türemiş çeşitli objelerden birini, kullanıcının bunlardan hangisini
    istediğine göre üretir ve döndürür.
    Factory.createEnemyShip("U") -> EnemyShip abstract class'ınden türemiş UFOEnemyShip döndürür.



     */
    public static void main(String[] args) {
        // TODO code application logic here

        EnemyShipFactory enemyShipFactory = new EnemyShipFactory();
        EnemyShip theEnemy = enemyShipFactory.createEnemyShip("U");
        doStuffEnemy(theEnemy);
    }

    private static void doStuffEnemy(EnemyShip enemyShip) {
        enemyShip.displayEnemyShip();
        enemyShip.followHeroShip();
        enemyShip.enemyShipShoots();
    }

}
