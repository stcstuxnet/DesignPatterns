/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ali-PC
 */
public class FilterPatternDemo {

    /*
    Burada Criteria interfaceinden türemiş, Arraylist alıp Arraylist döndüren sınıflar yazılmaktadır,
    Örneğin CriteriaMale().meetCriteria(<people>) kendi içinde bir arraylist oluşturur ve people'daki male'ları bu arrayliste atar
    ve bu arraylisti döndürür. Hem male hem single olanlar için AndCriteria(1,2) şeklinde 2 tane Criteria alır,
    Criteria cinsinden olan bu andcriteria, meetCriteria'ya pass edilen listeyi önce 1. criteria uygular ve bundan döneni de 2. criteria
    uygular ve döndürür.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Robert", "Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));
        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);
        System.out.println("Males: ");
        printPersons(male.meetCriteria(persons));
        System.out.println("\nFemales: ");
        printPersons(female.meetCriteria(persons));
        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetCriteria(persons));
        System.out.println("\nSingle Or Females: ");
        printPersons(singleOrFemale.meetCriteria(persons)
        );

    }

    private static void printPersons(List<Person> persons) {
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    + ", Gender : " + person.getGender()
                    + ", Marital Status: " + person.getMaritalStatus() + " ]");
        }

    }
}
