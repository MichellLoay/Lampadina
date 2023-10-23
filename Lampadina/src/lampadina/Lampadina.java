/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lampadina;

public class Lampadina {
   private boolean accesa;
   private boolean rotta;
   private int clicks;
   private final int maxClicks;
   private static boolean corrente = true;//attributo di classe
   
   public Lampadina(int maxClicks) {//costruttore
       this.accesa = false;
       this.rotta = false;
       this.clicks = 0;
       this.maxClicks = maxClicks;
   }
   
   public String stato() {
       String result;
       if (this.rotta) {
           System.out.println("Corrente off");
           result = "Rotta";
       } else {
           if (this.accesa && corrente) {
               System.out.println("Corrente on");
               result = "Accesa";
           } else {
               if(corrente){
                   System.out.println("Corrente on");
               }else{
                   System.out.println("Corrente off");
               }
               result = "Spenta";
           }
       }
       return result;
   }
   
   public void click() {
       if (!this.rotta) {
           this.clicks++;
           if (this.clicks>=this.maxClicks) {
               this.rotta = true;
           } else {
               this.accesa = !this.accesa;
           }
       }
   }
   
   public static void presaCorrente(){
       corrente = !corrente;//lo trasforma direttamente in false
   }
}