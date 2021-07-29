public class Account {
    static int numAccounts = 0;

    Account() {

        numAccounts += 1;
    }

    static int getNumAccounts() {

        return numAccounts;
    }
    public static void main(String[] args) {

        Account A = new Account();
        Account B = new Account();
        Account C = new Account();
        Account D = new Account();

        System.out.println("Total account created: " + getNumAccounts());

    }
}
