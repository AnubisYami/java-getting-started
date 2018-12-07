/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

/**
 *
 * @author Alex
 */
public class ParouImpar {
    public ParouImpar(){
    }
    
    public static long parouimpar(int n){
        
    if(n%2 == 0){
        System.out.print("%d " + n + "É Par!");
        return n;        
    }
    
    else 
            System.out.print("%d " + n + "É impar");
    return n;
    }
    
}
    
    



