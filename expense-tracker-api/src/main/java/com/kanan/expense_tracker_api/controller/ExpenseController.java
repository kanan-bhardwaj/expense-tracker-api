package com.kanan.expense_tracker_api.controller;

import com.kanan.expense_tracker_api.model.Expense;
import com.kanan.expense_tracker_api.service.ExpenseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExpenseController {

    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @GetMapping("/expenses")
    public List<Expense> getExpenses() {
        return expenseService.getAllExpenses();
    }
}