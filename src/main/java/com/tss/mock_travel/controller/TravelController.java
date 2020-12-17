package com.tss.mock_travel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TravelController {

    // Linking to Homepage(travel.html)
    @GetMapping(value = "/")
    public String travel() {
        return "travel/travel";
    }

}
