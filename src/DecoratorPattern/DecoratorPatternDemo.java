/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecoratorPattern;

/**
 *
 * @author Ali-PC
 */
public class DecoratorPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("normal border: ");
        circle.draw();

        System.out.println("red border: ");
        redCircle.draw();

        System.out.println("Rect with red border:");
        redRectangle.draw();
    }

}
