package javaFirstPart.javaObject;

public class User {
    private String username;

    private String password;

    public  User(){
        username = "admin";
        password = "123456";
        new User(username,password);

    }
    public  User(String username,String password){
        this.username = username;
        this.password = password;
    }

    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.username);
        System.out.println(user.password);
    }
}
