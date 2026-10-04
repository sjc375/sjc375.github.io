import java.util.Scanner;

public class WordsToNumbersDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String inputDate, monthText, dayText, yearText, Date1, Date2, numberMonth;
        
        System.out.println("Please enter the date as it is pressented: September 27, 2024");
        inputDate = scanner.nextLine();
        System.out.println("Entered date: " + inputDate);
        
       
        monthText = inputDate.substring(0, 3);
        int spacePosition = inputDate.indexOf(" ");
        int commaPosition = inputDate.indexOf(",");
        dayText = inputDate.substring(spacePosition + 1, commaPosition);
        yearText = inputDate.substring(commaPosition + 2);
        
        // Convert month to numeric form
        if (monthText.equals("Jan")) {
            numberMonth = "01";
        } else if (monthText.equals("Feb")) {
            numberMonth = "02";
        } else if (monthText.equals("Mar")) {
            numberMonth = "03";
        } else if (monthText.equals("Apr")) {
            numberMonth = "04";
        } else if (monthText.equals("May")) {
           numberMonth = "05";
        } else if (monthText.equals("Jun")) {
            numberMonth = "06";
        } else if (monthText.equals("Jul")) {
            numberMonth = "07";
        } else if (monthText.equals("Aug")) {
            numberMonth = "08";
        } else if (monthText.equals("Sep")) {
            numberMonth = "09";
        } else if (monthText.equals("Oct")) {
            numberMonth = "10";
        } else if (monthText.equals("Nov")) {
            numberMonth = "11";
        } else if (monthText.equals("Dec")) {
            numberMonth = "12";
        } else {
            numberMonth = "00"; 
        }
        
        
        Date1 = numberMonth + "/" + dayText + "/" + yearText;
        Date2 = dayText + "/" + numberMonth + "/" + yearText;
        
        System.out.println("Formatted Date (MM/DD/YYYY): " + Date1);
        System.out.println("Formatted Date (DD/MM/YYYY): " + Date2);
    }
}
