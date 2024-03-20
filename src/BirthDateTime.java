import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int month = 0;
        int day = 0;
        int year = 0;
        int hour = 0;
        int minute = 0;

        year = SafeInput.getRangedInt(in, "Year(1955-2010): ", 1955, 2010);

        month = SafeInput.getRangedInt(in, "Month(1-12): ", 1, 12);

        switch(month) {

            case 9:

            case 4:

            case 6:

            case 11:
                day = SafeInput.getRangedInt(in, "Day(1-30): ", 1, 30);
                break;
            case 2:
                day = SafeInput.getRangedInt(in, "Day(1-29): ", 1, 29);
                break;
            default:
                day = SafeInput.getRangedInt(in, "Day(1-31): ", 1, 31);
                break;

        }

        hour = SafeInput.getRangedInt(in, "Hour(1-24): ", 1, 24);

        minute = SafeInput.getRangedInt(in, "Minute(0-59): ", 0, 59);

        System.out.println("Year: " + year + "\nMonth: " + month + "\nDay: " + day + "\nTime: " + hour + ":" + minute);

    }
}
