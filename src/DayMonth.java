
import java.util.Scanner;

/**
 Creator: Hamid Majeed
 Date: 01/23/18
 Purpose: To return the number of days in a month which the user enters in a certain year */
public class DayMonth {

    public static void main(String[] args) {

        //gets user input

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year (2014): " );
        int year = input.nextInt();
        System.out.print("Enter a month ex.(Jul): " );
        String month = input.next();
        input.close();

        System.out.println(month + " " + year + " has " +
                getNumOfDaysInMonth(year, getMonthNumber(month)) + " days.");

    }

    //depending on user input this determines what output # days

    static int getNumOfDaysInMonth(int year, int month) {

        switch (month) {
            case 1: return 31;
            case 2: return isLeapYear(year) ? 28 : 29;
            case 3: return 31;
            case 4: return 30;
            case 5: return 31;
            case 6: return 30;
            case 7: return 31;
            case 8: return 31;
            case 9: return 30;
            case 10: return 31;
            case 11: return 30;
            case 12: return 31;
            default: return 0;
        }

    }

    public static int getMonthNumber(String month) {

        int monthNumber;

        switch (month) {
            case "jan":
                monthNumber = 1;
                break;
            case "feb":
                monthNumber = 2;
                break;
            case "mar":
                monthNumber = 3;
                break;
            case "apr":
                monthNumber = 4;
                break;
            case "may":
                monthNumber = 5;
                break;
            case "jun":
                monthNumber = 6;
                break;
            case "jul":
                monthNumber = 7;
                break;
            case "aug":
                monthNumber = 8;
                break;
            case "sep":
                monthNumber = 9;
                break;
            case "oct":
                monthNumber = 10;
                break;
            case "nov":
                monthNumber = 11;
                break;
            case "dec":
                monthNumber = 12;
                break;
            default:
                monthNumber = 0;
                break;
        }

        return monthNumber;
    }


    static boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }

}