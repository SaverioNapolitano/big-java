package com.snapolitano.programmingprojects.chapter1;

/**
 * Calculates which fraction of the car's use is for commuting to work and which is for personal use
 */
public class P1_2 {

    /**
     *
     * @param distance it's the one-way distance from home to place of work (in miles)
     * @param beginningMileage it's the beginning mileage of the odometer
     * @param endingMileage it's the ending mileage of the odometer
     * @param workDays it's the number of work days
     * @return the percentage of the car's use for commuting to work
     */
    public static double workCarUsePercentage(double distance, double beginningMileage, double endingMileage, int workDays) {
        return distance * workDays * 2 * 100 / (endingMileage - beginningMileage);
    }

    /**
     *
     * @param workUsePercentage it's the percentage of the car's use for commuting to work
     * @return the percentage of car's use for personal use
     */
    public static double personalCarUse(double workUsePercentage) {
        return 100.0 - workUsePercentage;
    }
}
