/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parking_management;


public class parking_lot 
{
private int number;
char type;
private boolean occupied=false;
Entering last_entrance;
Exiting last_exit;
private int n_parked;
double entrance_price;

   

    public parking_lot(int number, char type, boolean occupied, Exiting last_exit, double entrance_price,Entering last_entrance) {
        this.number = number;
        this.type = type;
        this.last_exit = last_exit;
        this.entrance_price = entrance_price;
        this.last_entrance=last_entrance;
    }
     public int getNumber() {
        return number;
    }

    public char getType() {
        return type;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public Entering getLast_entrance() {
        return last_entrance;
    }

    public Exiting getLast_exit() {
        return last_exit;
    }

    public int getN_parked() {
        return n_parked;
    }

    public double getEntrance_price() {
        return entrance_price;
    }
    void Enter(int time,String plate){
        this.last_entrance=new Entering(time,plate);
        occupied=true;
        this.last_exit=null;
    }
    double Exit(int time,String plate)
    {
        double result=0;
        this.last_exit=new Exiting(time,plate);
        occupied=false;
        n_parked++;
        result=this.entrance_price*(last_exit.getTime()-last_entrance.getTime());
        this.last_entrance=null; 
        return result;
    }
    
}
