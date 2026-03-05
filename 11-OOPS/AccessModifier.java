public class AccessModifier {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.userName = "SachinSharma";
        ba.setPassword("314fewrfewar4@3");
    }
}
/*Four types of access modifiers are available in java
1. Public
2. Private
3. Protected
4. Default */

class BankAccount{
    public String userName;
    // private String password;
    protected String password;
    
    public void setPassword(String pwd){
        password = pwd;
    }
    
}
