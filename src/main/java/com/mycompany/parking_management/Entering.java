
package com.mycompany.parking_management;
public class Entering 
{
    double time;
    String plate;
 
    public Entering(int time, String plate) {
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
