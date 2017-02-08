/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BridgePattern;

/**
 *
 * @author Ali-PC
 */
public class BridgePatternDemo {

    /*
       Burada bir API interface'i var. drawCircle metodu var. Bunu implement eden 2 API var,
    biri kırmızı çiziyor biri de yeşil.
    Shape'den türemiş Circle da, constuctor'ına pass ettiği drawapi ile oluşuyor. kendi draw metodu bu drawapi'nin
    drawCircle'ını çağırıyor.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Shape redCircle = new Circle(100, 100, 10, new RedCircleAPI());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircleAPI());
        redCircle.draw();
        greenCircle.draw();
    }

}
