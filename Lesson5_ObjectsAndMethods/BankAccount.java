package Lesson5_ObjectsAndMethods;

public class BankAccount {
    String name;
    int balance;

    BankAccount(String getName, int getBalance) {
        name = getName;
        balance = getBalance;
    }

    public void addMoney(int add) {
        balance += add;
    }

    public void takeMoney(int take) {
        if (take <= balance)
            balance -= take;
        else
            System.out.println("There are not enough funds in the balance: " + balance);
    }

    public void info() {
        System.out.println("Profile: \n" + "Name: " + name + "\nBalance: " + balance + "\n");
    }
}

class Main {
    public static void main(String[] args) {
        BankAccount me = new BankAccount("Den", 200);
        me.info();
        me.addMoney(500);
        me.info();
        me.takeMoney(600);
        me.info();
        me.takeMoney(200);
        me.info();
    }
}
