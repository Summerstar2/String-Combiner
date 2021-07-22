import java.util.*;

class Name_joiner {
    public static void main(String[] args) {
        boolean run = true;
        System.out.println("Welcome to this program!");
        System.out.println("This program will take input from the user and present the combination of the 2 strings.");
        while (run) {
            Scanner a = new Scanner(System.in);
            System.out.print("Enter the first string - ");
            String First = a.nextLine();
            Scanner b = new Scanner(System.in);
            System.out.print("Enter the second string - ");
            String Second = b.nextLine();
            String String_add = First + " " + Second;
            System.out.println("The combination of the strings is " + String_add);
            Scanner c = new Scanner(System.in);
            System.out.print("Do you wish to use this program again? (Yes/No) ");
            String Again = c.nextLine();
            if (Again.equals("Yes")) {
                continue;
            }
            if (Again.equals("No")) {
                break;
            }
            a.close();
            b.close();
            c.close();

        }

    }

}
