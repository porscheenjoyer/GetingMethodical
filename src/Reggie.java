import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        boolean done = false;
        String ssn = "";
        String ucID = "";
        String menu = "";

        ssn = SafeInput.getRegExString(in, "What is your SSN?", "\\d{3}-\\d{2}-\\d{4}");

        ucID = SafeInput.getRegExString(in, "What is your UC Student M number?", "(M|m)\\d{5}");

        menu = SafeInput.getRegExString(in, "What is your menu choice?", "[OoSsVvQq]");

        System.out.println("SSN: " + ssn + "\nUC Student M Number: " + ucID + "\nMenu: " + menu);

    }
}
