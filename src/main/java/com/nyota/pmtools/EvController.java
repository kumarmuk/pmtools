package com.nyota.pmtools;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nyota.pmtools.logic.EvCalculator;
import com.nyota.pmtools.model.Evf;

@Controller
public class EvController {

    @Autowired
    private Evf evf;

    @Autowired
    private EvCalculator evCalculator;

    @GetMapping("/evf")
    public String displayEvfForm(Model model) {
        model.addAttribute("evf", evf);
        return "evformulas";
    }

    @PostMapping("/evf")
    public String calculateEvf(@ModelAttribute Evf evf) {
        evCalculator.performCalculations(evf);
        return "evformulas";
    }

}
