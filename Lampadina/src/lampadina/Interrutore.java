/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lampadina;

public class Interrutore {
    private final Lampadina lampadina;//tipologia di dato dichiara da una classe all'interno del altra
    
    public Interrutore(Lampadina lampadina){
        this.lampadina = lampadina;

    }
    
    public void click(){
        this.lampadina.click();//lampadina associata al interrutore richiamando metodo click di lampadina
    }
    
}
