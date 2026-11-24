/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parking_management;
public class Parking 
{
    private parking_lot[] parking_spots;
    private int missed_cars;
    
    public Parking() 
    {
        this.missed_cars = missed_cars;
        parking_spots= new parking_lot[60];
            for(int i=0;i<60;i++)
            {
                if(i<10)
                {
                    parking_spots[i].type='a';
                    parking_spots[i].entrance_price=2.50;
                }
                else if(i<14)
                {
                    parking_spots[i].entrance_price=4.50;
                    parking_spots[i].type='d';
                }
                 else if(i<16)
                {
                    parking_spots[i].entrance_price=4.75;
                    parking_spots[i].type='e';
                }
                else
                {
                    parking_spots[i].type='n';
                    parking_spots[i].entrance_price=5;
                }
            }
    }
    public parking_lot[] getParking_spots() 
    {
        return parking_spots;
    }

    public int getMissed_cars() 
    {
        return missed_cars;
    }  
    boolean Register_entrance(char p_type,String plate,int current_time){
        for(int i=0;i<60;i++)
        {
            if(parking_spots[i].getType()==p_type)
            {
                if(parking_spots[i].isOccupied()==false)
                {
                    parking_spots[i].Enter(current_time, plate);
                    return true;
                }
            }             
        }
            missed_cars++;
            return false;
    }
    boolean Register_exit(String plate,int current_time){
        for(int i=0;i<60;i++)
        {
            if(parking_spots[i].last_entrance.getPlate()==plate)
            {
                if(parking_spots[i].isOccupied()==true)
                {
                    parking_spots[i].Exit(current_time, plate);
                    return true;
                }
            }             
        }
            return false;
    }
    int N_freeSpots()
    {
        int result=0;
            for(int i=0;i<parking_spots.length;i++)
            {
                if (parking_spots[i].isOccupied()==false)
                {
                    result++;    
                }
            }
        return result;
    }
}

