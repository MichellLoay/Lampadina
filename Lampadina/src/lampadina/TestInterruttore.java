/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*Scrivere la classe Interruttore i cui oggetti rappresentano degli interruttori. 
Ogni interruttore è collegato a una lampadina (oggetto della classe Lampadina)
e ne regola l’accensione e spegnimento. La classe deve contenere tutte le
variabili d’istanza i costruttori e i metodi ritenuti opportuni.*/
package lampadina;

import java.util.Scanner;


public class TestInterruttore {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        Lampadina lamp= new Lampadina(5);
        Interrutore int1= new Interrutore(lamp);
        Interrutore int2= new Interrutore(lamp);
        int choice;
        
        do {
           System.out.println("1- Click\n2- Stato\n3- interruttore \n4- esci");
           choice = myScan.nextInt();
           while(choice>4 && choice<1) {
               System.out.println("Error!\n\n1- Click\n2- Stato\n3- interruttore \n4- esci");
               choice = myScan.nextInt();
           }

        switch (choice) {
           case 1:
               lamp.click();
               break;
           case 2:
               System.out.println(lamp.stato());
               break;
           case 3: 
               Lampadina.presaCorrente();
               break;
           }    
       } while(choice != 4);
   }

       
}


