package Authentication;

//Class yang akan mengimplementasi class authentication
public class UserAuth implements Authentication {
    
    //Method yang akan mengoverride methode yang ada pada class Authentication
    @Override
    public void getAuthentication() {
        System.out.println("Anda berhasil login sebagai User");
    }

}
