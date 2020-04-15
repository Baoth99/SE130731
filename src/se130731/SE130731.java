/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se130731;

import toys.MyToys;

/**
 *
 * @author ASUS
 */
public class SE130731 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("5! = " + MyToys.cf(5));
        System.out.println("6! = " + MyToys.cf(6)); //expected 730
        System.out.println("0! = " + MyToys.cf(0));
        System.out.println("-5!= " + MyToys.cf(-5));// vỡ mặt
        
    }
    
}
