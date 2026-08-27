public class Access_Modifiers {
    public static void main(String args[]) {

        BankAccount myAcc = new BankAccount();

        myAcc.username = "Priya";
        myAcc.setPassword("123456");
        System.out.println(myAcc.username);
        System.out.println(myAcc.password);
    }

    static class BankAccount {
        public String username;
        private String password;

        public void setPassword(String pwd) {
            password = pwd;
        }
    }
}