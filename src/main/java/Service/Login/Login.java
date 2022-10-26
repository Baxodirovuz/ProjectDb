package Service.Login;

import java.util.Scanner;

import DB.DataB;
import Object.*;
import Service.InitialSection;

public class Login {

    /*
     * DataBase @dataB object DataB
     * initial 2 sections
     * 1 - sign in -> signIn()
     * 2 - sign up -> signUp()
     * default repeat method initial()
     * 0 - exit -> System.exit(0)
     * */


    private final DataB dataB = DataB.getDataB();
    private final InitialSection initialSection = InitialSection.getSection();

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

    public void signUp() {
        Scanner scanner = new Scanner(System.in);
        User userUp = new User();
        System.out.print("Enter first name: ");
        userUp.setFirstName(scanner.nextLine());
        System.out.print("Enter last name: ");
        userUp.setLastName(scanner.nextLine());
        System.out.print("Enter fathers name: ");
        userUp.setFathersName(scanner.nextLine());
        System.out.print("Enter email: ");
        userUp.setEmail(scanner.nextLine());
        System.out.print("Enter gender: ");
        userUp.setGender(scanner.nextLine());
        System.out.print("Enter ip address: ");
        userUp.setIpAddress(scanner.nextLine());
        System.out.print("Enter username: ");
        userUp.setUsername(scanner.nextLine());
        System.out.print("Enter password: ");
        userUp.setPassword(scanner.nextLine());
        System.out.print("Enter phone number: ");
        userUp.setPhoneNumber(scanner.nextLine());
        System.out.print("Enter address: ");
        userUp.setAddress(scanner.nextLine());
        System.out.print("Enter country: ");
        userUp.setCountry(scanner.nextLine());
        System.out.print("Enter country code: ");
        userUp.setCountryCode(scanner.nextLine());
        System.out.print("Enter your job: ");
        userUp.setJobs(scanner.nextLine());
        dataB.users.add(userUp);
        initial();            // go to the main section
    }

    public void signIn() {
        String username;
        String password;
        System.out.print("Enter username: ");
        username = new Scanner(System.in).nextLine();
        System.out.print("Enter password: ");
        password = new Scanner(System.in).nextLine();
        for (User user : dataB.users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                initialSection.section();
            }
        }
    }
}
