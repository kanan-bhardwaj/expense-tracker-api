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
    public Expense addExpense(Expense expense) {
        expenses.add(expense);
        return expense;
    }

    public Expense getExpenseById(int id) {
        for (Expense expense : expenses) {
            if (expense.getId() == id) {
                return expense;
            }
        }
        return null;
    }

    public String deleteExpense(int id) {
        expenses.removeIf(expense -> expense.getId() == id);
        return "Expense deleted successfully";
    }

    public Expense updateExpense(int id, Expense updatedExpense) {
        for (Expense expense : expenses) {
            if (expense.getId() == id) {
                expense.setTitle(updatedExpense.getTitle());
                expense.setAmount(updatedExpense.getAmount());
                return expense;
            }
        }
        return null;
    }
}
