package Class19;

public class Test {
    public static void main(String[] args) {

        BankAccount ba=new BankAccount();
        ba.accountNumber= 787878871;
        ba.money=1000;
        ba.deposit();

        System.out.println(ba.accountNumber);
        System.out.println(ba.money);

        System.out.println("  -- Creating an Object");
        // ba.transfer(); methods
        Checking  check=new Checking();
        //feature from parent
        check.accountNumber=5765;
        check.money=780;
        // features from checking class itself
        check.interest=0;

        check.deposit();

        System.out.println(" --  Creating an Object of savings account");



    }
}
