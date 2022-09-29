public class BankAccount {

       private double checkingBalance;
       private double savingsBalance;
       private double NUM_OF_ACCOUNTS;
       private static int TOTAL_DEPOSITS;


    BankAccount(){
           NUM_OF_ACCOUNTS++;

    }


    public void deposit(double amount, String acctType){
           if(acctType == "checking"){
               this.checkingBalance += amount;
               TOTAL_DEPOSITS += amount;
           } else {
               this.savingsBalance += amount;
           }
               TOTAL_DEPOSITS += amount;


    }
    public void withdraw (double amount, String acctType){
           if(acctType == "checking" && checkingBalance >= amount){
               this.checkingBalance -= amount;
           } else if (savingsBalance >= amount){
               savingsBalance -= amount;
           }
    }


    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }
    public void checkBalances (){
        System.out.println(checkingBalance + savingsBalance);

    }


}
