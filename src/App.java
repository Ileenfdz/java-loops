import Models.User;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        User user = new User("Giacomo", true);
        System.out.println(user.getName());
        System.out.println(user.getIsAuth());
    }
}
