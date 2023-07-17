
class Account {
    public String name;
    protected String email;
    private String password;

    // getters and setters 
    public String getPass(){
        return this.password;
    }
    public void setPass(String pass){
        this.password = pass;
    }
}

public class bank {
    public static void main(String args[]){
        Account account1 =  new Account();
        account1.name = "Apna College";
        account1.email = "vanshika234@gmail.com";
        // account1.password = "password";
        account1.setPass("abcd");
        System.out.println(account1.getPass());
    } 
}
