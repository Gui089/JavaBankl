package Exer5;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account number :");
        int number = sc.nextInt();

        System.out.println("Enter account holder : ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.println("Is there na initial deposit (y/n) ?");
        char confirm = sc.next().charAt(0);
        Cliente cliente;


        if (confirm == 'y') {
            System.out.println("Enter initial deposit value :");
            double initialDeposit = sc.nextDouble();
            cliente = new Cliente(number, name, initialDeposit);

        } else {
           cliente = new Cliente(number, name);
        }

        System.out.println();
        System.out.println("Account data : ");
        System.out.println(cliente);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        cliente.deposit(depositValue);
        System.out.println("Update account data: ");
        System.out.println(cliente);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        cliente.withdraw(withdrawValue);
        System.out.println("Update account data: ");
        System.out.println(cliente);


        sc.close();
    }
}
