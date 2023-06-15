package com.nyota.pmtools.model;

import org.springframework.stereotype.Component;

@Component
public class Evf {

    private double bac;
    private int plannedDays;
    private int daysCompleted;
    private double workCompletedPercentage;

    private double actualCost;

    private double plannedValue;
    private double earnedValue;

    private double costVariance;
    private double costPerformanceIndex;

    private double scheduleVariance;
    private double scheduleVarianceIndex;

    private double estimateAtCompletion;
    private double estimateToCompletion;
    private double toCompletePerformanceIndex;

    public double getBac() {
        return bac;
    }

    public void setBac(double bac) {
        this.bac = bac;
    }

    public int getPlannedDays() {
        return plannedDays;
    }

    public void setPlannedDays(int plannedDays) {
        this.plannedDays = plannedDays;
    }

    public int getDaysCompleted() {
        return daysCompleted;
    }

    public void setDaysCompleted(int daysCompleted) {
        this.daysCompleted = daysCompleted;
    }

    public double getWorkCompletedPercentage() {
        return workCompletedPercentage;
    }

    public void setWorkCompletedPercentage(double workCompletedPercentage) {
        this.workCompletedPercentage = workCompletedPercentage;
    }

    public double getActualCost() {
        return actualCost;
    }

    public void setActualCost(double actualCost) {
        this.actualCost = actualCost;
    }

    public double getPlannedValue() {
        return plannedValue;
    }

    public void setPlannedValue(double plannedValue) {
        this.plannedValue = plannedValue;
    }

    public double getEarnedValue() {
        return this.earnedValue;
    }

    public void setEarnedValue(double earnedValue) {
        this.earnedValue = earnedValue;
    }

    public double getCostVariance() {
        return costVariance;
    }

    public void setCostVariance(double costVariance) {
        this.costVariance = costVariance;
    }

    public double getCostPerformanceIndex() {
        return costPerformanceIndex;
    }

    public void setCostPerformanceIndex(double costPerformanceIndex) {
        this.costPerformanceIndex = costPerformanceIndex;
    }

    public double getScheduleVariance() {
        return scheduleVariance;
    }

    public void setScheduleVariance(double scheduleVariance) {
        this.scheduleVariance = scheduleVariance;
    }

    public double getScheduleVarianceIndex() {
        return scheduleVarianceIndex;
    }

    public void setScheduleVarianceIndex(double scheduleVarianceIndex) {
        this.scheduleVarianceIndex = scheduleVarianceIndex;
    }

    public double getEstimateAtCompletion() {
        return estimateAtCompletion;
    }

    public void setEstimateAtCompletion(double estimateAtCompletion) {
        this.estimateAtCompletion = estimateAtCompletion;
    }

    public double getEstimateToCompletion() {
        return estimateToCompletion;
    }

    public void setEstimateToCompletion(double estimateToCompletion) {
        this.estimateToCompletion = estimateToCompletion;
    }

    public double getToCompletePerformanceIndex() {
        return toCompletePerformanceIndex;
    }

    public void setToCompletePerformanceIndex(double toCompletePerformanceIndex) {
        this.toCompletePerformanceIndex = toCompletePerformanceIndex;
    }

}
