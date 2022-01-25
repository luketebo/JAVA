package homewolk1118.user;

public class User {
    private String name;
    private String pass;

    public User(String n,String p){

        name = n;
        pass = p;
    }
    public int check(String n,String p){
        if(this.name.equals(n)){
            if(this.pass.equals(p))
            {
                System.out.println("login success!!!");
                return 1;
            }
        }
        return 0;

    }

}
