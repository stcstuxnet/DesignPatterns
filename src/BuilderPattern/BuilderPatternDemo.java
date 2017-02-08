/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderPattern;

/**
 *
 * @author Ali-PC
 */
public class BuilderPatternDemo {

    /*
    Burada bir nesne oluşturulurken her parçası ayrı ayrı ekleniyor.
    MealBuilder, iki farklı meal üretiyor. VegMeal'ın item arraylist'ine vegburger ekliyor,
    nonvegmeal'ın item arraylistine de chicken ekliyor.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());
        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("NonVeg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }

}
