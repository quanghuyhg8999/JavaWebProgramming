/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi7;

/**
 *
 * @author HP
 */
public class SmartPhone extends Product{
    public int sim;
    public boolean hasCamera;
    SmartPhone(){
        
    }
    SmartPhone(int sim, boolean hasCamera){
        
    }
     public int getsim(){
        return sim;
    }
    public void setsim(int sim){
        this.sim = sim;
    }
     public boolean gethasCamera(){
        return hasCamera;
    }
    public void sethasCamera(boolean hasCamera){
        this.hasCamera = hasCamera;
    }
    public boolean ishasCamera(){
        return this.hasCamera;
    }
}
