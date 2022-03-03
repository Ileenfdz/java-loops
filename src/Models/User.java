package Models; 

public class User {
    private String name;
    private Boolean isAuth;
    
    public User() {
    }

    public User(String name, Boolean isAuth) {
        this.name = name;
        this.isAuth = isAuth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsAuth() {
        return isAuth;
    }

    public void setIsAuth(Boolean isAuth) {
        this.isAuth = isAuth;
    }

}
