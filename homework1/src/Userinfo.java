public class Userinfo {
    private String username = "123";
    private String userpassword = "xxx";

    public Userinfo(String username, String userpassword){
        this.username = username;
        this.userpassword = userpassword;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setUserpassword(String userpassword){
        this.userpassword = userpassword;
    }

    public String getUsername(){
        return this.username;
    }

    public String getpassword(){
        return this.userpassword;
    }
}