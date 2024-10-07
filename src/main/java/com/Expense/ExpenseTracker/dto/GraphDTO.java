package com.Expense.ExpenseTracker.dto;

import com.Expense.ExpenseTracker.entity.Expense;
import com.Expense.ExpenseTracker.entity.Income;
import lombok.Data;

import java.util.List;

@Data
public class GraphDTO {

    private List<Expense> expenseList;

    private List<Income> incomeList;
}
