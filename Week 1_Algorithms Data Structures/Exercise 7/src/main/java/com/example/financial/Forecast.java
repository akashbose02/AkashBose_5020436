package com.example.financial;

public class Forecast {
    // Method to predict future value using recursion
    public double predictFutureValue(double currentValue, double growthRate, int periods) {
        if (periods == 0) {
            return currentValue;
        }
        return predictFutureValue(currentValue * (1 + growthRate), growthRate, periods - 1);
    }

    public static void main(String[] args) {
        Forecast forecast = new Forecast();
        double currentValue = 3000.0; 
        double growthRate = 0.05;    
        int periods = 8;           

        double futureValue = forecast.predictFutureValue(currentValue, growthRate, periods);
        System.out.println("Predicted future value: " + futureValue);
    }
}
