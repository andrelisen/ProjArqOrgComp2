/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

/**
 *
 * @author andrelise
 */
public class clock {//pensando na máquina de estados
    
    public int counter = 0;
    
    public void contar()
    {
        counter++;
    }

    public void setCounter(int counter) {
       
       this.counter=counter; 
    }

    
    public int getCounter() {
        return counter;
    }
    
    
    
}
