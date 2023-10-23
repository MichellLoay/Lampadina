/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lampadina;

import java.util.Scanner;

public class TestLampadina {

   public static void main(String[] args) {
       Scanner myScan = new Scanner(System.in);
       Lampadina lampadina = new Lampadina(5);
       int choice;
       do {
           System.out.println("1- Click\n2- Stato\n3- interruttore \n4- esci");
           choice = myScan.nextInt();
           while(choice>3 && choice<1) {
               System.out.println("Error!\n\n1- Click\n2- Stato\n3- interruttore \n4- esci");
               choice = myScan.nextInt();
           }

        switch (choice) {
           case 1:
               lampadina.click();
               break;
           case 2:
               System.out.println(lampadina.stato());
               break;
           case 3: 
               Lampadina.presaCorrente();
               break;
           }    
       } while(choice != 4);
   }
}