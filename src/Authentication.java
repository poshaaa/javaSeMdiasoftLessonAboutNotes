package src;

import java.util.Scanner;

public class Authentication {

    private static final String LOGIN="polina"; //константа-капсом
    private static final String PASSWORD="1234";

    public static int authenticate() {
        Scanner s = new Scanner(System.in);

        //int maxCount = 3;
        boolean isLoginSuccess = false;

//        while(maxCount > 0 && !isLoginSuccess){
//            System.out.println("Login:  ");
//            var login = s.nextLine();
//
//            System.out.println("Password:  ");
//            var password = s.nextLine();
//
//            if(login.equals(LOGIN) && password.equals(PASSWORD)) {
//                isLoginSuccess = true;
//            }
//            maxCount--;
//        }

        for(int maxCount = 3; maxCount > 0 && !isLoginSuccess; maxCount--){
            System.out.println("Login:  ");
            var login = s.nextLine();

            System.out.println("Password:  ");
            var password = s.nextLine();

            if(login.equals(LOGIN) && password.equals(PASSWORD)) {
                isLoginSuccess = true;
            }
        }

        return isLoginSuccess ? 0: -1;
    }
}
