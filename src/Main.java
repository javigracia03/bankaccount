import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        

        Scanner scan = new Scanner(System.in);

        System.out.println("WELCOME TO OUR BANK");
        System.out.println("PLEASE ENTER YOUR NAME");


        String username_enetered = scan.nextLine();

        System.out.print("PLEASE ENTER YOUR PASSWORD");

        String password_enetered = scan.nextLine();

        Bankaccount a1 = new Bankaccount(username_enetered, password_enetered);

        System.out.print("WHAT WOULD YOU LIKE TO DO?");
        System.out.print("TYPE A FOR ADDIG MONEY TO YOUR ACCOUNT");
        System.out.print("TYPE B FOR WITHDRAWING MONEY FROM YOUR ACCOUNT");
        System.out.print("TYPE Q TO QUIT");

        char option = scan.next().charAt(0);
        char option1 = Character.toUpperCase(option);


        switch (option1){

           case 'A': {

                System.out.println("HOW MUCH MONEY WOULD YOU LIKE TO ADD?");

                String amount_entry = scan.nextLine();

                double amount = Double.parseDouble(amount_entry);
                a1.entry(amount);
                break;
            } 
            case 'B': {

                System.out.println("HOW MUCH MONEY WOULD YOU LIKE TO SUBSTRACT?");

                String amount_entry = scan.nextLine();

                double amount = Double.parseDouble(amount_entry);
                a1.withdraw(amount);
                break;
            } 
            case 'Q': {

                System.out.println("THANKS FOR TRUSTING US");

                break;
            } 

        }//switch

        System.out.println("YOUR CURRENT AMOUNT IS: " + a1.getmoney());

    }
}
