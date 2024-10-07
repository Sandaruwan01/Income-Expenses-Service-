package com.Expense.ExpenseTracker.services.stats;

import com.Expense.ExpenseTracker.dto.GraphDTO;
import com.Expense.ExpenseTracker.dto.StatsDTO;

public interface StatsService {

    GraphDTO getChartData();

    StatsDTO getStats();
}
