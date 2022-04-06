
public class BankAccount
{
    private double checkingBalance;
    private double savingsBalance;
    private static int totalAccounts = 0;
    private static double totalAmounts = 0.0;

public BankAccount(){
    totalAccounts++;
}

//getter for checkings balance
public double getCheckingBalance(){
    return this.checkingBalance;
}
//getter for savings
public double getSavingsBalance(){
    return this.savingsBalance;
}
public void deposit(){
    System.out.println("Please input checkings or savings to decide what account to deposit funds into.");
    String account = System.console().readLine();
    if (account.indexOf("savings") != -1){
        System.out.println("Please enter amount wished to deposit into savings in 00.00 format");
        String str = System.console().readLine();
        double amount = Double.parseDouble(str);
        this.savingsBalance += amount;
        totalAmounts += amount;
        System.out.println("$"+amount+"0 successfully deposited into savings.");
} 
    else if (account.indexOf("checkings") != -1){
        System.out.println("Please enter amount wished to deposit into checkings in 00.00 format");
        String str = System.console().readLine();
        double amount = Double.parseDouble(str);
        this.checkingBalance += amount;
        totalAmounts += amount;
        System.out.println("$"+amount+"0 successfully deposited into savings.");
    }
    else {
        System.out.println("Invalid Input try again.");
    }
    }
public void withdraw(){
    System.out.println("Please input checkings or savings to decide what account to withdraw funds from.");
    String account = System.console().readLine();
    if (account == "savings"){
        System.out.println("Please enter amount wished to withdraw from savings in 00.00 format");
        String str = System.console().readLine();
        double amount = Double.parseDouble(str);
        if (amount <= savingsBalance){
            this.savingsBalance -= amount;
            totalAmounts -= amount;
            System.out.println("$"+amount+"0 successfully withdrawed from savings.");
        } else if(amount > savingsBalance){
            System.out.println("Insufficient funds. Try a lower amount.");
        }
        
} 
    else if (account == "checkings"){
        System.out.println("Please enter amount wished to withdraw from checkings in 00.00 format");
        String str = System.console().readLine();
        double amount = Double.parseDouble(str);
        if (amount <= checkingBalance){
            this.checkingBalance -= amount;
            totalAmounts -= amount;
            System.out.println("$"+amount+"0 successfully withdrawed from savings.");
        } else if (amount> checkingBalance){
            System.out.println("Insufficient funds. Try a lower amount.");
        }
    }
    else {
        System.out.println("Invalid Input try again.");
    }
}

public void checkBalance(){
    System.out.println("Checkings Balance: $"+getCheckingBalance()+"0");
    System.out.println("Checkings Balance: $"+getSavingsBalance()+"0");
}
    
}