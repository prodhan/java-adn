/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author ADN
 */
public class father extends grandfather {
    int z=2;
    protected int a =25;
     
    public void addition(int x, int y) {
      z = x + y;
      
      System.out.println("The sum of the given numbers:"+z);
      System.out.println("This is from father");
   } 
    
 

    
}
