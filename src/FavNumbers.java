import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int userFavInt = 0;
        double userFavDouble = 0;

        userFavInt = SafeInput.getInt(in, userFavInt);

        userFavDouble = SafeInput.getDouble(in, userFavDouble);

        System.out.println("Favorite Int: " + userFavInt);

        System.out.println("Favorite Double: " + userFavDouble);

    }
}
