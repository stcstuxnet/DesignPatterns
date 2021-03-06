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
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shape) {

        if (shape == null) {
            return null;
        }

        if (shape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }
        if (shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }

        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }

}
