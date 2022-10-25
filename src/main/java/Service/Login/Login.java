package Service.Login;

import java.util.Scanner;

import Object.*;

public class Login {
    public void initial() {
        System.out.println(" <1> Sign in");
        System.out.println(" <2> Sign up");
        System.out.println(" <0> Exit");
        System.out.print("Enter option: ");
        switch (new Scanner(System.in).nextInt()) {
            case 1 -> signIn();
            case 2 -> signUp();
            case 0 -> System.exit(0);
            default -> initial();

        }
    }

    private void signUp() {
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        System.out.print("Enter first name: ");
        user.setFirstName(scanner.nextLine());
        System.out.print("Enter last name: ");
        user.setLastName(scanner.nextLine());
        System.out.print("Enter fathers name: ");
        user.setFathersName(scanner.nextLine());
        System.out.print("Enter email: ");
        user.setEmail(scanner.nextLine());
        System.out.print("Enter gender: ");
        user.setGender(scanner.nextLine());
        System.out.print("Enter ip address: ");
        user.setIpAddress(scanner.nextLine());
        System.out.print("Enter username: ");
        user.setUsername(scanner.nextLine());
        System.out.print("Enter password: ");
        user.setPassword(scanner.nextLine());
        System.out.print("Enter phone number: ");
        user.setPhoneNumber(scanner.nextLine());
        System.out.print("Enter address: ");
        user.setAddress(scanner.nextLine());
        System.out.print("Enter country: ");
        user.setCountry(scanner.nextLine());
        System.out.print("Enter country code: ");
        user.setCountryCode(scanner.nextLine());
        System.out.print("Enter your job: ");
        user.setJobs(scanner.nextLine());
    }

    private void signIn() {
        String username = null;
        String password = null;
        System.out.print("Enter username: ");
        username = new Scanner(System.in).nextLine();
        System.out.print("Enter password: ");
        password = new Scanner(System.in).nextLine();
    }
}
