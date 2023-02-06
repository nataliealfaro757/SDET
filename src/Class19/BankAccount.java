package Class19;

public class BankAccount {
    long accountNumber;
    double money;

    void deposit(){
        System.out.println("Deposit methods from Bank account class");
    }
}
class Checking extends BankAccount{  // child class or sub class or derived class

    double interest;
    void Transfer(){

        System.out.println("transfer methods from Checking");

    }
    }

