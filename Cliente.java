package Exer5;

public class Cliente {
    private int number;
    private String name;
    private double saldo;


    public Cliente(int number, String name, double initialDeposit) {
        this.number = number;
        this.name = name;
        deposit(initialDeposit);
    }

    public Cliente(int number, String name) {
        this.number = number;
        this.name= name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSaldo(){
        return saldo;
    }

    public void deposit(double amount) {
        saldo += amount;
    }

    public void withdraw(double amount) {
        saldo -= amount + 5;
    }

    public String toString() {
        return "Account"
                +number
                +", Holder: "
                + name
                +", Balance: $"
                +String.format("%.2f", saldo);
    }
}
