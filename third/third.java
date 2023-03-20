package third;

import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int sum = 0;
        String dayOfTheWeek = "";
        do {
            System.out.println("Enter an integer:");

            String input = scanner.nextLine();
            
            try {
                n = Integer.parseInt(input);
                switch (n % 7) {
                    case 0:
                        dayOfTheWeek = "Sunday";
                        break;
                    case 1:
                        dayOfTheWeek = "Monday";
                        break;
                    case 2:
                        dayOfTheWeek = "Tuesday";
                        break;
                    case 3:
                        dayOfTheWeek = "Wednesday";
                        break;
                    case 4:
                        dayOfTheWeek = "Thursday";
                        break;
                    case 5:
                        dayOfTheWeek = "Friday";
                        break;
                    case 6:
                        dayOfTheWeek = "Saturday";
                        break;
                    default:
                        System.out.println("invalid day of the week");
                        break;
                }
                if (n % 2 == 0) {
                    sum += n;
                } else if ((n % 2 != 0) && (n > 0)) {
                    break;
                } else if (n == 0) {
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter an integer");
                continue;
            }
            System.out.println(dayOfTheWeek);
        } while (true);
        scanner.close();
        System.out.println("The sum of even numbers entered is: " + sum);
    }
}