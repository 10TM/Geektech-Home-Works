package kg.nazar.class_entity;

public class BankAccount {
    private int amount;

    public int getAmount() {
        return amount;
    }

    public String deposit(int sum) {
        amount = +sum;
        return "You balance is :" + sum;
    }

    public String withDraw(int sum) throws LimitException {
        if (sum >= amount) {
            throw new LimitException((double) amount, "You spend:" + amount);
        }
        amount = amount - sum;
        return "Success " + amount;
    }
}
