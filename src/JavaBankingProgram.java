import java.util.Scanner;

public class JavaBankingProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0; 
        boolean isRunning = true;
        int choice;
       
        while(isRunning) {
            System.out.println("----BANKING PROGRAM----");
            System.out.println("1. Show balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("------------------------");
       
            System.out.println("Enter your choice (1-4):");
            choice = scanner.nextInt();
       
            switch(choice) {
                case 1 -> {
                    System.out.println("Your balance is: €" + balance);
                }
                case 2 -> {
                    System.out.println("Enter an amount to deposit:");
                    double depositAmount = scanner.nextDouble();
                    balance += depositAmount;
                }
                case 3 -> {
                    System.out.println("Enter an amount to withdraw:");
                    double withdrawAmount = scanner.nextDouble();
                    
                    if(withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                    } else {
                        System.out.println("Insufficient funds!");
                    }
                }
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }
        }
        
        System.out.println("Thanks for banking with");
        scanner.close();
    }
}