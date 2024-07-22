public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        KidUser Sam = new KidUser(10, "Kids");
        Sam.registerAccount();

        KidUser Ash = new KidUser(18, "Fiction");
        Ash.requestBook();

        AdultUser Jason = new AdultUser(5, "Kids");
        Jason.registerAccount();

        AdultUser Ron = new AdultUser(23, "Fiction");
        Ron.requestBook();

    }
}
