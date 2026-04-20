package bank;

public class CheckingAccount {
  
  private String name;
  private int balance;
  private String id;

  public CheckingAccount(String inputName, int inputBalance, String inputId){
    name = inputName;
    balance = inputBalance;
    id = inputId;
  }

    CheckingAccount(String nico, String $) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int newBalance) {
    balance = newBalance;
  }
 
}