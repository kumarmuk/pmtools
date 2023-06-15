package com.nyota.pmtools.logic;

import org.springframework.stereotype.Component;

import com.nyota.pmtools.model.Evf;

@Component
public class EvCalculator {

    private Evf evfModel;

    public void performCalculations(Evf evfModel) {
        this.evfModel = evfModel;
        this.calculateEv();
        this.calculatePv();
        this.calculateCostVariance();
        this.calculateCostPerformanceIndex();
        this.calculateScheduleVariance();
        this.calculateScheduleVarianceIndex();
        this.calculateEstimateAtCompletion();
        this.calculateEstimateToCompletion();
        this.calculateTCPI();
    }

    private void calculateEv() {
        double ev;
        System.out.println("Actual cost supplied is " + evfModel.getActualCost());
        if (evfModel.getBac() > 0) {
            ev = ((evfModel.getWorkCompletedPercentage() * evfModel.getBac()) / 100);
        } else {
            ev = 0.0;
        }
        evfModel.setEarnedValue(ev);

    }

    private void calculatePv() {
        double pv;
        if (evfModel.getPlannedDays() > 0) {
            pv = ((double) (evfModel.getDaysCompleted() / (double) evfModel.getPlannedDays()) * evfModel.getBac());
        } else
            pv = (long) 0.0;
        evfModel.setPlannedValue(pv);
    }

    private void calculateCostVariance() {
        double costVariance;
        costVariance = (this.evfModel.getEarnedValue() - this.evfModel.getActualCost());
        this.evfModel.setCostVariance(costVariance);
    }

    private void calculateCostPerformanceIndex() {
        double cpi;
        if (this.evfModel.getActualCost() > 0) {
            cpi = this.evfModel.getEarnedValue() / this.evfModel.getActualCost();
        } else
            cpi = 0.0;
        this.evfModel.setCostPerformanceIndex(cpi);
    }

    private void calculateScheduleVariance() {
        double sv;
        sv = this.evfModel.getEarnedValue() - this.evfModel.getPlannedValue();
        this.evfModel.setScheduleVariance(sv);


    }

    private void calculateScheduleVarianceIndex() {
        double svi;
        if (this.evfModel.getPlannedValue() > 0) {
            svi = this.evfModel.getEarnedValue() / this.evfModel.getPlannedValue();
        } else
            svi = 0.0;
        this.evfModel.setScheduleVarianceIndex(svi);
    }

    private void calculateEstimateAtCompletion() {
        double eac;
        if (this.evfModel.getCostPerformanceIndex() != 0) {
            eac = (this.evfModel.getBac() / this.evfModel.getCostPerformanceIndex());
        } else {
            eac = 0.0;
        }
        this.evfModel.setEstimateAtCompletion(eac);
    }

    private void calculateEstimateToCompletion() {
        double etc;
        etc = this.evfModel.getBac() - this.evfModel.getEstimateAtCompletion();
        this.evfModel.setEstimateToCompletion(etc);
    }

    private void calculateTCPI() {
        double tcpi;
        double numerator = (this.evfModel.getBac() - this.evfModel.getEarnedValue());
        double denominator = (this.evfModel.getBac() - this.evfModel.getActualCost());
        if (denominator != 0) {
            tcpi = (numerator / denominator);
        } else {
            tcpi = 0.0;
        }
        this.evfModel.setToCompletePerformanceIndex(tcpi);
    }

}
