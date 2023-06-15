package com.nyota.pmtools.logic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.nyota.pmtools.model.Evf;


public class EvCalculatorTest {

    @Autowired
    private Evf evf = null;

    @Test
    void testPerformCalculations() {
        evf = new Evf();
        evf.setPlannedDays(5);
        evf.setDaysCompleted(4);
        evf.setBac(500);
        evf.setWorkCompletedPercentage(90);
        evf.setActualCost(300);
        EvCalculator cal = new EvCalculator();
        cal.performCalculations(evf);
        assertEquals(evf.getPlannedValue(), 400, "Planned Value is fine");
        assertEquals(evf.getEarnedValue(), 450, 0, "EarnedValue is fine");
    }
}
