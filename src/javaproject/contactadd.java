/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

/**
 *
 * @author SankA
 */
public class contactadd {
    private String name;
    private int number;
    
    public contactadd(String name,int number){
        this.name = name;
        this.number = number;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getNumber(){
        return number;
    }
    public void setNumber(){
        this.number = number;
    }  
}
