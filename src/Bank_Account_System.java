public class Bank_Account_System {
    String name;
    String AccountName;
    double balance;
    Bank_Account_System(String name,String AccountName,double balance){
        this.name = name;
        this.AccountName = AccountName;
        this.balance = balance;
    }
    public  void getDetails(){
        System.out.println("Name:"+""+name+"\nAccountName:"+""+AccountName+""+"\nbalance:"+balance);
    }
   public void deposit(double amount) {
       if (amount > 0) {
           balance += amount;
           System.out.println("Total balance of your account:" + balance);
       }else{
           System.out.println("This can't be added on to ur balance");
       }
   }
   public boolean withDrawel(double amount){
       if(amount > balance){
           System.out.println("Insufficient amount");
           return false;
       }
       balance -= amount;
       System.out.println("Total balance in your account is:"+balance);
       return  true;
   }

    public static void main(String[] args) {
        Bank_Account_System ba = new Bank_Account_System("John","ap123",1000);
        ba.getDetails();
        ba.deposit(100);
        System.out.println(ba.withDrawel(100));
    }
}
