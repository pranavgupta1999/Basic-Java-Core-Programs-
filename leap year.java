import java.util.Scanner;

    public class LeapYear {
        public static void main(String[] args)
        {
            System.out.println("Taking Input From the User");
            //scanner class declaration
            Scanner sc=new Scanner(System.in);
            //input year from user
            System.out.println("Enter a Year");
            int year = sc.nextInt();
            if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                System.out.println(" is a leap year" +year);
            else
                System.out.println(" is not a leap year" +year);
        }
    }