/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import ir.huri.jcal.JalaliCalendar;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JalaliCalendar jalaliCalendar = new JalaliCalendar(1395, 1, 28);
        System.out.println(jalaliCalendar.getDay());
    }
    
}