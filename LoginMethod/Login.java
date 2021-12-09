package LoginMethod;

public class Login {

    //Mendelkarasikan sebuah variabel dengan tipe LoginBy
    private LoginBy loginBy;

    //Methode untuk merubah metode dalam login
    public void setLoginMethod(LoginBy login)
    {
        this.loginBy = login;
    }

    //Methode untuk mendapatkan metode dalam login
    public LoginBy getLoginType()
    {
        return loginBy;
    }

    //Methode untuk melakukan login dengan metode yang dipilih
    public void loginNow()
    {
        loginBy.loginNow();
    }
}
