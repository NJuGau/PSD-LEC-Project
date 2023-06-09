package view;

import java.util.Scanner;

import authentication.context.authentication_context.events.GoToHomePageEvent;
import authentication.context.authentication_context.events.LoginEvent;
import authentication.context.authentication_context.events.RegisterEvent;
import utility.UtilityPage;

public class AuthenticationPage {
    Scanner scan = new Scanner(System.in);

    public AuthenticationPage() {
        int input = 0;
        do {
        	UtilityPage.changePage();
            System.out.println("Menu : ");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit app");
            input = UtilityPage.getOption(1, 3);
            switch (input) {
                case 1:
                    loginPage();
                    break;
                case 2:
                    registerPage();
                    break;
                case 3:
                	System.out.println("Exitting app...");
                    break;
            }
        } while (input != 3);
    }

    public void loginPage() {
        System.out.print("username : ");
        String username = scan.nextLine();
        System.out.print("password : ");
        String password = scan.nextLine();
        if(LoginEvent.login(username, password)) {
        	GoToHomePageEvent.run();
        }
    }

    public void registerPage() {
        System.out.print("input your username : ");
        String username = scan.nextLine();
        System.out.print("input your first name : ");
        String firstName = scan.nextLine();
        System.out.print("input your last name : ");
        String lastName = scan.nextLine();
        System.out.print("input you password : ");
        String password = scan.nextLine();
        RegisterEvent.register(username,firstName,lastName,password);
    }
}
