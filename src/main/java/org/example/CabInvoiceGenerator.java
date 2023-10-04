package org.example;

public class CabInvoiceGenerator {
    public final double costperkm=10.0;
    double costpermin=1.0;
    double min_fare =5;
    public double calculateFare(double distance,int time)
    {
        double totalfare=(distance+costperkm)+(time*costpermin);
        if(totalfare<5)
        {
            return min_fare;
        }
        return totalfare;
    }
}