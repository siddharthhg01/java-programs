import java.util.Scanner;

class Bank {
    String name;
    int accNumber;
    int balance;


    Bank(String name, int accNumber, int balance) {

        this.name = name;
        this.accNumber = accNumber;
        this.balance = balance;
    }
}

class Savings extends Bank {
    Savings(String name, int accNumber, int balance) {
        super(name, accNumber, balance);
    }

    int withdraw(int amount) {
        this.balance -= amount;
        return this.balance;
    }

    void getBalance() {
        System.out.println("Balance: " + this.balance);
    }

    int Deposit(int amount){
        this.balance+=amount;
        return this.balance;
    }
    void Dispaly(){
        System.out.println("name: "+this.name+"\n");
        System.out.println("Account number : "+this.accNumber+"\n");
        System.out.println("balance: "+this.balance+"\n");
    }
    void computerInterest(){
        int compoundInterest=this.balance*2/100;
        System.out.println("compund Interest ="+compoundInterest);
    }
}
class Current extends Bank {
    Current(String name, int accNumber, int balance) {
        super(name, accNumber, balance);
    }
    int withdraw(int amount) {
        this.balance -= amount;
        return this.balance;
    }

    void Dispaly(){
        System.out.println("name: "+this.name+"\n");
        System.out.println("Account number : "+this.accNumber+"\n");
        System.out.println("balance: "+this.balance+"\n");
    }
    int Deposit(int amount){
        this.balance+=amount;
        return this.balance;
    }
    int checkMin(){
        if(this.balance<1000){
            this.balance-=50;
            return this.balance;
        }
    }
}
public class BankMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name");
        String name=sc.nextLine();
        System.out.println("Enter your Account Number ");
        int accNumber=sc.nextInt();
        int balance=1000;
        Savings savingsAccount = new Savings(name,accNumber,balance);
        int Choice;
        int Deposit;
        int withdraw;
        System.out.println("-------MENU------");
        System.out.println("1. Deposit\n 2. Withdraw\n 3.Display\n 4.Exit\n");
        System.out.println("Enter your choice ");
        Choice=sc.nextInt();
        while (Choice!=5) {
            switch (Choice) {
                case 1:
                    System.out.println("Enter the amount to deposit\t ");
                    Deposit=sc.nextInt();
                    System.out.println("Balance "+savingsAccount.Deposit(Deposit) );
                    System.out.println("1. Deposit\n 2. Withdraw\n 3.Display\n 4.Compound Interest\n 5.Exit");
                    Choice=sc.nextInt();
                    break;
                case 2:
                    System.out.println("Enter the amount to withdraw \t ");
                    withdraw=sc.nextInt();
                    System.out.println( "Balance "+savingsAccount.withdraw(withdraw));
                    System.out.println("1. Deposit\n 2. Withdraw\n 3.Display\n 4.Exit\n");
                    Choice=sc.nextInt();
                    break;
                case 3:
                    System.out.println("Account Details \n ");
                    savingsAccount.Dispaly();
                    System.out.println("1. Deposit\n 2. Withdraw\n 3.Display\n 4.Exit\n");
                    Choice=sc.nextInt();
                    break;
                case 4:
                    System.out.println("Compund Interest");
                    savingsAccount.computerInterest();
                    System.out.println("1. Deposit\n 2. Withdraw\n 3.Display\n 4.Exit\n");
                    Choice=sc.nextInt();
                    break;
                default:
                    break;

            }
        }
    }
}