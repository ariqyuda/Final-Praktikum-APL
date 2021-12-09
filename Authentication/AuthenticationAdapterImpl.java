package Authentication;

//Class yang akan mengimplementasi class authentication adapter
public class AuthenticationAdapterImpl implements AuthenticationAdapter {

    //Deklarasi variabel dengan tipe Authentication
    private Authentication authentication;

    public AuthenticationAdapterImpl(Authentication auth) {
        this.authentication = auth;
    }

    //Method yang akan mengoverride methode yang ada pada class AuthenticationAdapter
    @Override
    public void getAuthentication() {

        authentication.getAuthentication();
    }
    
}
