/*
public class Main {
    public static void main(String[] args) {


        // .substring() = A method used to extract a portion of a string
        //                .substring(start, end
        
        System.out.println("Hello in a new chapter in your Java Course\n\n");

        String email = "Bro123@gmail.com";

        String username = email.substring(0, 6);
        String domain = email.substring(7, 16);

        System.out.println(username);
        System.out.println(domain);


    }
}


*/


import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        System.out.println("Hello in a new chapter in your Java Course\n\n");

        String email = "Bro123@gmail.com";

        // Extract everything before and after the @
        String username = email.substring(0, email.indexOf('@'));
        String domain = email.substring(email.indexOf('@') + 1);

        System.out.println("Username: " + username);
        System.out.println("Domain: " + domain);*/


        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;


        System.out.print("Enter your email: ");

        email = scanner.nextLine();



        if(email.contains("@")){
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);


            System.out.println("Your username: " + username);
            System.out.println("Your domain: " + domain);

        }
        else{
            System.out.println("Emails must contain @");
        }



        scanner.close();
    }
}
