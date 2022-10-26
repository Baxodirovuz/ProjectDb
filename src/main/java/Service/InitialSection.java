package Service;

public class InitialSection {
    private static InitialSection initialSection = new InitialSection();

    public static InitialSection getSection() {
        return initialSection;
    }

    public void section() {
        System.out.println(" <1> -> Create user");
        System.out.println(" <2> -> Read user");
        System.out.println(" <3> -> Update user");
        System.out.println(" <4> -> Delete user");

    }
}
