import java.util.Scanner;



public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        

        Scanner scan = new Scanner(System.in);

        System.out.println("WELCOME TO OUR BANK");
        System.out.println("PLEASE ENTER YOUR NAME");



        String username_enetered = scan.nextLine();

        System.out.print("PLEASE ENTER YOUR PASSWORD\n");

        String password_enetered = scan.nextLine();

        Bankaccount a1 = new Bankaccount(username_enetered, password_enetered);


        boolean t = true;
        boolean t2 = true;
        while(t==true){
            System.out.print("WHAT WOULD YOU LIKE TO DO?\n");
            System.out.print("TYPE A FOR ADDIG MONEY TO YOUR ACCOUNT\n");
            System.out.print("TYPE B FOR WITHDRAWING MONEY FROM YOUR ACCOUNT\n");
            System.out.print("TYPE ANY OTHER LETTER TO QUIT\n");

            char option = scan.next().charAt(0);
            char option1 = Character.toUpperCase(option);
    

            switch (option1){

            case 'A': 

                    System.out.println("HOW MUCH MONEY WOULD YOU LIKE TO ADD?");

                    scan.nextLine();

                    String amount_entry = scan.nextLine();

                    double amount = Double.parseDouble(amount_entry);
                    a1.entry(amount);
                    break;
                
            case 'B': 

                    System.out.println("HOW MUCH MONEY WOULD YOU LIKE TO SUBSTRACT?");
                    
                    scan.nextLine();

                    String amount_substracted = scan.nextLine();

                    double amount_sub = Double.parseDouble(amount_substracted);
                    a1.withdraw(amount_sub);
                    break;
                
            default : 

                t2 = false;
                t = false;
                    break;
                
                
            }//switch

            if (t2==true){
                System.out.println("YOUR CURRENT AMOUNT IS: " + a1.getmoney()+ "\n");
                System.out.println("Would you like to do any other operation? Y/N");
                char option2 = scan.next().charAt(0);
                char option3 = Character.toUpperCase(option2);

                if (option3 == 'N'){
                    t = false;

                } else scan.nextLine();
            }//if    

        }//while    

       
        System.out.println("THANKS FOR TRUSTING US");

    }//main


    
}
