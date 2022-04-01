

class Bankaccount {
    
    private int id;
    private String password;
    private double money = 0.0;
    private String name;
    private String surname;
    private String username;

    public Bankaccount(String username, String passwordentered){
        this.username = username;
        this.password = passwordentered;

    }

    public double getmoney(){

        return this.money;
    }

    public void entry(double amount){

            this.money = money +  amount;
    }
    public void withdraw(double amount){

        this.money = money -  amount;

    }
    public void setname(String name){

        this.name = name;
    }

    public void setsurname(String surname){

        this.surname = surname;
    }

    public void setusername(String username){

        this.username = username;
    }    

}
