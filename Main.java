import java.util.Scanner;
class Account{
    double balance = 2500;
}
class Atm{
    Account ac = new Account();
    public double withdraw(int amount){
        if(ac.balance-amount<0){
            return ac.balance;
        }
        ac.balance = ac.balance-amount;
        return ac.balance;
    }
    public double deposit(int amount){
        ac.balance=ac.balance+amount;
        return ac.balance;
    }
    public double checkbalance(){
        return ac.balance;
    }
}
public class Main{
    public static void main(String[] args){
        Atm a = new Atm();
        Scanner sc = new Scanner(System.in);
        int amount;
        int n;
        System.out.println("----------------------------------------");
        System.out.println("                 ATM                    ");
        System.out.println("----------------------------------------");
        System.out.println("           Welcome to ATM               ");
        System.out.println("  The minimum balance is Rs.500 ");
        System.out.println("  or you will be charged Rs.50 as fine ");
        System.out.println("----------------------------------------");
        System.out.println("1. Withdraw ");
        System.out.println("2. Deposit  ");
        System.out.println("3. Checkbalance");
        System.out.println("4. Exit     ");
        do{
            System.out.println("Choose the option ");
            n = sc.nextInt();
            switch(n){
                case 1:
                    System.out.println("Enter the amount to be withdraw");
                    amount=sc.nextInt();
                    if(a.checkbalance()<0||a.checkbalance()-amount<0){
                        System.out.println("Withdraw failed");
                        break;
                    }
                    else{
                        a.withdraw(amount);
                        if(a.withdraw(amount)<500){
                            System.out.println("Rs "+amount+"has been withdrawal");
                            System.out.println("You will be charged with Rs 50 as fine");
                        }
                        break;
                    }
                    case 2:
                        System.out.println("Enter the amount to be deposit");
                        amount = sc.nextInt();
                        if(a.checkbalance()<500){
                            if(amount>=50){
     
     
                                amount = amount-50;
                            }
                            else{
                                amount=0;
                            }
                            System.out.println("Rs.50 fine amount deducted");
                        }a.deposit(amount);
                        System.out.println("Rs. "+amount+"has been deposited");
                        break;
                        case 3:
                            System.out.println("Balance: "+a.checkbalance());
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Invalid entry");
                            break;
                            }
                            }while(n!=4);
                            System.out.println("  Have a Nice Day ");
                            System.out.println("----------------------------------------");
                        }
                        }