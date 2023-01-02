public class Main {

    public static void main(String[] args) {
        IdeaPasswords idpasswords = new IdeaPasswords();
        LoginPage loginPage = new LoginPage(idpasswords.getLoginInfo());
    }
}
