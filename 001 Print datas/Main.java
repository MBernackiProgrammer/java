import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("Hi, I'm Helper, please write your name");

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        System.out.println("Hi, " + userName + " what can I do for you ?");
        System.out.println("1. Print day");
        System.out.println("2. Print hour");
        System.out.println("3. Print now");

        int outMenu = Integer.parseInt(scanner.nextLine());

        switch (outMenu)
        {
            case 1:
                //Print day
                System.out.println("day : " + java.time.MonthDay.now());
                break;

            case 2:
                //Print hour
                System.out.println("hour : " + java.time.LocalTime.now());
                break;

            case 3:
                //Print data
                System.out.println("date : " + java.time.LocalDate.now());
                break;
        }
    }
}