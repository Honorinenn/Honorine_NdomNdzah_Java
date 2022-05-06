package com.company;

public class RPGInheritanceApp {
    public static void main(String[] args) {
       Farmer newFarmer = new Farmer("Kiki", 75, 100, 75, 10, 1, false, false, false, false );
       Constable newConstable = new Constable("Paul", 60, 100, 60, 20, 5, false, false, "Chicago");
       Warrior newWarrior = new Warrior("Snip", 75, 100, 100, 50, 10, false, false, 100 );


       // Calling the isArrested method (from the Humans class) on newFarmer object
        newFarmer.isArrested();
        System.out.println(newFarmer.arrested);

        // Calling the isArrested method (from the Humans class) on newWarrior object
        newWarrior.isArrested();
        System.out.println(newWarrior.arrested);

        // Calling the isArrested method (from the Humans class) on newConstable object
        newConstable.isArrested();
        System.out.println(newConstable.arrested);


    }
}
