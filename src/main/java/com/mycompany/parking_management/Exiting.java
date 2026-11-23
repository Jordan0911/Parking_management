/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parking_management;

/**
 *
 * @author colombo.jordan
 */
public class Exiting {
    double time;
    String plate;
    
    public Exiting(int time, String plate) {
        this.time = time;
        this.plate = plate;
    }
     public double getTime() {
        return time;
    }

    public String getPlate() {
        return plate;
    }
}
