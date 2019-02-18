/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116058.latihan53.rabbit;

public class PBO210116058Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit("Peter", false, "grass", 4, "grey");
        System.out.println("Hello, His name is " + rabbit.getName());
        System.out.println(rabbit.getName() + " is Vegetarian? " + rabbit.isVegetarian());
        System.out.println(rabbit.getName() + " eats " + rabbit.getEats());
        System.out.println(rabbit.getName() + " has " + rabbit.getNoOfLegs() + " legs.");
        System.out.println(rabbit.getName() + " color is " + rabbit.getColor());

    }

}