import java.util.Scanner;

public class BankAccountMenu {
    public static void main(String[] args) {
        // TODO: Implement the bank account menu

       Scanner sc = new Scanner(System.in);
        // 1. Create a double variable for balance
        double moneyhave = 0.0, money;

        // 2. Create a while loop for the menu
        boolean run;
        run = true;
        while (run)
        {
            // 3. Display the menu options
            System.out.println("----menu----");
            System.out.println("1. Add money");
            System.out.println("2. withdraw money");
            System.out.println("3. check balence");
            System.out.println("4. exit\n");
            System.out.print("your choise: ");
            int choice = sc.nextInt();

            // 5. Use switch statement to handle menu choices
            // 6. Implement add money, withdraw money, check balance, and exit functionality
            switch (choice) {
                case 1:
                    System.out.print("\nadd:  ");
                    money = sc.nextDouble();
                    if ( money >0 ) {
                        moneyhave += money;
                        System.out.println("your balance is: " + moneyhave + "\n");
                    }
                    else {
                        System.out.println("error");
                    }
                    break;
                case 2 :
                    System.out.println("withdraw: ");
                    money = sc.nextDouble();
                    if (money <= moneyhave && moneyhave>0)
                    {
                        moneyhave -= money;
                    System.out.println( "your balance is: " + moneyhave);
                    }
                    else {
                        System.out.println("insufficient funds\n");
                    }
                    break;
                case 3:
                    System.out.println("your balance is : " + moneyhave);
                    break;
                case 4:
                    run = false;
                    break;
            }

        }
        // 4. Use Scanner to read user input
    }
}