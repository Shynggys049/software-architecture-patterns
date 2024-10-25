public class UserCreditentials {
    private String username;
    private String password;

    public UserCreditentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean validate(){
        return username != null && username.isEmpty() && password != null && password.isEmpty();
    }
}

