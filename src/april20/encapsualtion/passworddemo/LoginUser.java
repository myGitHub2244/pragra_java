package april20.encapsualtion.passworddemo;

public class LoginUser {
    private String userName;
    private String password;

    public LoginUser(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }


    public String getUserName() {
        return userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void  isUserAuthenticated(String userName, String password) {
        if (this.userName.equalsIgnoreCase(userName) && this.password.equalsIgnoreCase(password)){
            System.out.println("User is authenticated.");
            System.out.println("Welcome  "+ userName);
        }else {
            System.out.println("Invalid user! try again..");
        }

    }
}
