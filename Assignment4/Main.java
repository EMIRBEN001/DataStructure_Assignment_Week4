package Assignment4;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        LinkedList<String> name = new LinkedList<String>();
        LinkedList<Long> phoneNumber = new LinkedList<Long>();
        LinkedList<String> email = new LinkedList<String>();
        Scanner scanner = new Scanner(System.in);
        String tempName;
        long tempNum;
        String tempEmail;
        int index;
        boolean done = false;


        // Input
        while (done == false) {
            System.out.println("***********************************");
            System.out.println("(A)dd");
            System.out.println("(D)elete");
            System.out.println("(E)mail Search");
            System.out.println("(P)rint List");
            System.out.println("(S)earch");
            System.out.println("(Q)uit");
            System.out.println("***********************************");
            System.out.println("Enter a command: ");
            String menu = scanner.nextLine();

            // I used a Switch Case because it is much more simple for me than writting a bunch of for loops
            // this commands reminds me of the FSM simulation assignment in the past
            switch (menu) {
                case "A":
                    System.out.println("Enter Name: ");
                    tempName = scanner.nextLine();
                    name.add(tempName);

                    System.out.println("Enter Phone Number: ");
                    tempNum = scanner.nextLong();
                    phoneNumber.add(tempNum);
                    scanner.nextLine();

                    System.out.println("Enter Email Address: ");
                    tempEmail = scanner.nextLine();
                    email.add(tempEmail);

                    break;


                case "D":
                    System.out.println("Enter Name: ");
                    tempName = scanner.nextLine();
                    if (name.contains(tempName)) {
                        index = name.indexOf(tempName);
                        name.remove(tempName);
                        phoneNumber.remove(index);
                        email.remove(index);
                        break;
                    }
                    System.out.println("Error");
                    break;

                case "E":
                    System.out.println("Search Email: ");
                    tempEmail = scanner.nextLine();
                    if (email.contains(tempEmail)) {
                        index = email.indexOf(tempEmail);
                        System.out.println("Name: " + name.get(index));
                        System.out.println("Phone Number: " + phoneNumber.get(index));
                        System.out.println("Email: " + email.get(index));
                    }

                case "P":
                    System.out.println(name);
                    System.out.println(phoneNumber);
                    System.out.println(email);
                    break;

                // this is the command to Search the Name of the Data that u Inputted
                // although it needs to be very precise when searching for the name
                // recomended to have no spaces on the name that we stored
                case "S":
                    System.out.println("Enter Name: ");
                    tempName = scanner.nextLine();
                    if (name.contains(tempName)) {
                        index = name.indexOf(tempName);
                        System.out.println("Name: " + name.get(index));
                        System.out.println("Phone Number: " + phoneNumber.get(index));
                        System.out.println("Email: " + email.get(index));
                    }
                    else {
                        System.out.println("Error! ");
                        break;
                    }


                case "Q":
                    done = true;
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }
    }
}
