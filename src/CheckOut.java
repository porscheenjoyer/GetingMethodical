import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double userItem = 0;
        double total = 0;
        String moreItems = "";

        do {

            userItem = SafeInput.getRangedDouble(in, "Item price($0.50-$9.99): ", .5, 9.99);

            total = total + userItem;

            moreItems = SafeInput.getYNConfirm(in, "Do you have more items(Y or N)?");

            if (moreItems.equalsIgnoreCase("n")) {

                break;

            }

        } while (true);

        System.out.println("The total cost of your items is: $" + total);

    }



}
