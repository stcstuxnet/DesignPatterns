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
public abstract class EnemyShip {
    private String name;
    private double damage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double amtDamage) {
        this.damage = amtDamage;
    }
    
    public void followHeroShip(){
        System.out.println(getName() + " is following the hero.");
    }
    
    public void displayEnemyShip(){
        System.out.println(getName() + " is on the screen.");
    }
    
    public void enemyShipShoots(){
        System.out.println(getName() + " attacks and does " + getDamage());
    }
}
