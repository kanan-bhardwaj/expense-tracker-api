package com.kanan.expense_tracker_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpenseController {

    @GetMapping("/")
    public String home() {
        return "Expense Tracker API is running!";
    }
}
