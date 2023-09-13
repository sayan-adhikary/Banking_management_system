import java.util.Scanner;

class ATM{
    float Balance;
    int PIN=1234;

    public void checkpin(){
        System.out.println("Enter your pin: ");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if(enteredpin == PIN){
            menu();
        }
        else{
            System.out.println("Enter a valid pin: ");
        }
    }




public void menu(){
    System.out.println("Enter your choice: ");
    System.out.println("1.Check A/C Balance");
    System.out.println("2.Withdraw Balance: ");
    System.out.println("3.Deposit Memory: ");
    System.out.println("4.EXIT");

    Scanner sc = new Scanner(System.in);
    int opt = sc.nextInt();

    if(opt == 1){
        checkBalance();
    }
    else if(opt == 2){
        WithdrawMoney();
    }
    else if(opt == 3){
        depositMoney();
    }
    else if(opt == 4){
        return;
    }
    else{
        System.out.println("Enter a valid choice");
    }
}


public void  checkBalance(){
    System.out.println("Balance: "+ Balance);
    menu();
}

public void WithdrawMoney(){
    System.out.println("Enter Amount to Withdraw: ");
    Scanner sc = new Scanner (System.in);
    float amount = sc.nextFloat();
    if(amount>Balance){
        System.out.println("Insufficient Balance");
        menu();
    }
    else{
        Balance = Balance-amount;
        System.out.println("Money Withdrawl Succesfully"); 
        menu();
    }
}

public void depositMoney(){
    System.out.println("Enter the amount: ");
    Scanner sc = new Scanner(System.in);
    float amount = sc.nextFloat();
    Balance = Balance + amount;
    System.out.println("Deposit Succesfully");
    menu();
}


public class Atm {
    public static void main(String[] args) {

        ATM obj = new ATM();
        obj.checkpin();
        
    }
    
}
}
