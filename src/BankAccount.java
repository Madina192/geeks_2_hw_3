public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    double deposit(double sum) {
        return amount += sum;
    }

    int withDraw(int sum) throws LimitException {
        if(sum > amount) {
            throw new LimitException("Error. Sum is more than your remaining amount. " +
                    "You can withdraw the balance.", amount);
        } else {
            return (int) (amount -= sum);
        }
    }
}
