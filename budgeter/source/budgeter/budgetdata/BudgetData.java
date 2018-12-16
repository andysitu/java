package budgetdata;

class BudgetData {
    double amount;
    String name;
    Date date;
    String id;

    BudgetData() {
        id = IDGenerator.generate();
    }
}