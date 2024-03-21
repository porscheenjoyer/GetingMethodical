import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double userItem = 0;
        double total = 0;
        String moreItems = "";


        userItem = SafeInput.getRangedDouble(in, "Item price($0.50-$9.99): ", .5, 9.99);

        total = total + userItem;

        moreItems = SafeInput.getYNConfirm(in, "Do you have more items(Y or N)?");

        System.out.println("The total cost of your items is: $" + total);

    }



}
