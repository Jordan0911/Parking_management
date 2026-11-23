/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parking_management;
public class Parking 
{
    private parking_lot[] parking_spots;
    private int missed_cars;

  

    public Parking(int missed_cars) {
        this.missed_cars = missed_cars;
         parking_spots= new parking_lot[60];
         for(int i=0;i<60;i++)
        {
            if(i<10)
            {
                parking_spots[i].type='d';
            }
        }
      public parking_lot[] getParking_spots() 
    {
        return parking_spots;
    }

    public int getMissed_cars() {
        return missed_cars;
    }
    
}

