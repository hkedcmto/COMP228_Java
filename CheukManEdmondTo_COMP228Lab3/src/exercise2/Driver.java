package exercise2;

import java.util.InputMismatchException;
import java.util.Scanner;

//Create a console application that demonstrates how to create objects of both subclasses.
public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInputFTPT;
        boolean isFullTime;
        GameTester gameTester=null;
        int numOfHours=0;

        // Allow the user to choose game tester type
        System.out.print("Input the game tester type (Enter 0 for Full Time, 1 for Part Time): ");

        try{
            userInputFTPT = scanner.nextInt();
            if ( userInputFTPT == 0) {
                isFullTime = true;
            }else if (userInputFTPT ==1){
                isFullTime = false;
            }else{
                throw new InputMismatchException();
            }
        }catch(InputMismatchException e){
            System.out.println("Invalid input. Program ends.");
            return;
        }

        //create objects of both subclasses
        if(isFullTime){ //Full Time
            gameTester = new FullTimeGameTester();
        } else if (!isFullTime) { //Part Time
            gameTester = new PartTimeGameTester();
            // Ask for the number of hours for the part-time testers.
            System.out.print("Input the number of hours: ");
            try {
                numOfHours = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Program ends.");
                return;
            }
        }
        gameTester.salary(numOfHours);
    }
}
