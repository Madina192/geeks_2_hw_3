public class Main {
    public static void main(String[] args){
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);

        while (true) {
            try {
                bankAccount.withDraw(6000);
                System.out.println("Successfully! You withdrew 6000 soms");
                System.out.println("Balance: " + bankAccount.getAmount());
            } catch (LimitException le) {
                System.out.println(le.getMessage() + "Your balance: " + le.getRemainingAmount());
                try {
                    bankAccount.withDraw((int) bankAccount.getAmount());
                    System.out.println("You withdrew the remaining amount successfully! You're amount: " + bankAccount.getAmount());
                } catch (LimitException e) {
                    System.out.println(e.getMessage());
                }
                break;
            }
        }
    }
}