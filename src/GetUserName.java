import java.util.Scanner;

public class GetUserName {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String fName = SafeInput.getNonZeroLenString(in,"What is your first name?");

        String lName = SafeInput.getNonZeroLenString(in,"Last Name?");

        System.out.println("Your name is " + fName + " " + lName);

    }
}
