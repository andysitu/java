package budgetdata;

class Account {
    double total;
    String name;
    String id;

    Account() {
        id = IDGenerator.generate();
    }
}