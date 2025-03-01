
package ec.edu.espe.accountingreportexcercise.model;

import org.bson.Document;


/**
 *
 * @author Matias Rojas
 */
public class Transaction {
    private double incomes;
    private double expenses;

    public Transaction(double incomes) {
        this.incomes = incomes;
        this.expenses = 0.0; 
    }

    public Transaction(double expenses, boolean isExpense) {
        this.expenses = expenses;
        this.incomes = 0.0; 
    }

    public double getIncomes() {
        return incomes;
    }

    public double getExpenses() {
        return expenses;
    }

    public Document toDocument() {
        return new Document("incomes", incomes)
               .append("expenses", expenses);
    }
}
