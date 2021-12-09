//Ariq Yuda Pratama
//1908107010029

import java.util.Scanner;
import LoginMethod.*;
import Authentication.*;

public class Main {

    private static Scanner scanner;
    
    public static void main(String args[]){

        System.out.println("Selamat datang di aplikasi manajemen");

        scanner = new Scanner(System.in);

        System.out.println("-------------------------------");
        System.out.println("Masukkan nama anda: ");
        String name = scanner.next();

        System.out.println("-------------------------------");
        System.out.println("Masuk Sebagai");
        System.out.println("- Admin");
        System.out.println("- User");
        System.out.println("Pilihan: ");
        String loginType = scanner.next();
        System.out.println("-------------------------------");
        
        System.out.println("Metode yang dipilih untuk login : " + loginType +"\n");
        LoginMethod(loginType);
        System.out.println("Selamat " + name);
        Authen(loginType);
        
    }

    //Fungsi untuk memilih metoe login
    static void LoginMethod(String loginType) {
        
        Login login = null;
        login = new Login();

        if( "Admin".equalsIgnoreCase(loginType))
        {
            login.setLoginMethod(new AdminLogin());
        }
        else if("User".equalsIgnoreCase(loginType))
        {
            login.setLoginMethod(new UserLogin());
        }

        login.loginNow();
        
    }

    //Fungsi untuk mendapatkan keberhasilan login setelah menggunakan salah satu metode yang ada
    static void Authen(String loginType) {
        
        if( "Admin".equalsIgnoreCase(loginType))
        {
            Authentication adminAuthentication = new AdminAuth();
            AuthenticationAdapter adminAuthenticationAdapter = new AuthenticationAdapterImpl(adminAuthentication); 
            adminAuthenticationAdapter.getAuthentication();
        }
        else if("User".equalsIgnoreCase(loginType))
        {
            Authentication userAuthentication = new UserAuth();
            AuthenticationAdapter userAuthenticationAdapter = new AuthenticationAdapterImpl(userAuthentication); 
            userAuthenticationAdapter.getAuthentication();
        }

    }


}
