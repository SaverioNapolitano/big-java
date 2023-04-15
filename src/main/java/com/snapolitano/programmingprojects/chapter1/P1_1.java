package com.snapolitano.programmingprojects.chapter1;

/**
 * Decides which commute is cheaper between train and car
 */
public class P1_1 {
    /**
     * Cost of the gas in dollars per gallon
     */
    public static final double COST_OF_GAS_PER_GALLON = 4.0;
    /**
     * Car maintenance in cents per mile
     */
    public static final double CAR_MAINTENANCE_PER_MILE = 0.05;
    public static final int CAR = 0;
    public static final int TRAIN = 1;

    /**
     * Calculates if it's better to drive the car or take the train
     *
     * @param distance it's the one-way distance from home to place of work (in miles)
     * @param fuelEfficiency it's the fuel efficiency of the car (in miles per gallon)
     * @param trainTicket it's the one-way price of the train ticket (in dollars)
     *
     * @return which means of transport is cheaper to use
     */
    public static int trainOrCar(double distance, double fuelEfficiency, double trainTicket) {
        double carMaintenancePerDistance = CAR_MAINTENANCE_PER_MILE * distance;
        double costOfGasPerDistance = COST_OF_GAS_PER_GALLON * distance / fuelEfficiency;
        return (costOfGasPerDistance + carMaintenancePerDistance < trainTicket) ? CAR : TRAIN;
    }
}
