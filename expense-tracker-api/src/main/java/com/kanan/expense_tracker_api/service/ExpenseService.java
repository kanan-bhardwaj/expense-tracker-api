package com.kanan.expense_tracker_api.service;

import com.kanan.expense_tracker_api.model.Expense;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExpenseService {

    private List<Expense> expenses = new ArrayList<>();

    public ExpenseService() {
        expenses.add(new Expense(1, "Food", 200));
        expenses.add(new Expense(2, "Travel", 500));
    }

    public List<Expense> getAllExpenses() {
        return expenses;
    }
}
