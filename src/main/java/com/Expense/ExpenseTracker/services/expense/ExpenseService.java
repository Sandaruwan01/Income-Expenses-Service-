package com.Expense.ExpenseTracker.services.expense;

import com.Expense.ExpenseTracker.dto.ExpenseDTO;
import com.Expense.ExpenseTracker.entity.Expense;

import java.util.List;

public interface ExpenseService {

    Expense postExpense(ExpenseDTO expenseDTO);

    List<Expense> getAllExpenses();

    Expense getExpenseById(Long id);

    Expense updateExpense(Long id, ExpenseDTO expenseDTO);

    void deleteExpense(Long id);
}
