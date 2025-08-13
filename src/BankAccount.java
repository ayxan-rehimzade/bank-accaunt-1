public class BankAccount {
    private String accountNumber;
    private double balance;

    public double getBalance() {
        return balance;
    }

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    public void addBalance(double amountAdded){
        if (amountAdded<=0) throw new IllegalArgumentException("mebleq sifir ve menfi ola bilmez");
        balance+=amountAdded;
        System.out.println(amountAdded+" AZN elave olundu");
        System.out.println("yekun balans:"+balance);


    }
    public void withdraw(double amountDraw) throws InsufficientFundsException{
        if (balance<amountDraw) throw new InsufficientFundsException("balansda kifayet qeder mebleq yoxdur");
        balance-=amountDraw;
        System.out.println(amountDraw+" AZN cixarildi");
        System.out.println("yekun mebleq="+balance);
    }
}
