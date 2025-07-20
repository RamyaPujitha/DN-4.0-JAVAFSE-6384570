package com.cognizant.loan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

    @GetMapping("/loan/{number}")
    public String getLoanDetails(@PathVariable String number) {
        return "Loan details for account number: " + number;
    }
}
