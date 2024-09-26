package exercise3;

/*
Author: Cheuk Man Edmond, To - 301378748
Date:   Sep 25, 2024
Description:
COMP228-006-2024F
Lab 2 - Exercise 3
Write a Java class that implements a set of three overloaded static methods.
The methods should have different set of parameters and perform similar functionalities.
Call the methods within main method and display the results.
 */
public class Overload {

    //Method accept an integer and return the integer with fixed value 10
    public static int overloaded(int number){
        return 10;
    }

    //Method accept a string and return the integer with fixed value 11
    public static int overloaded(String str){
        return 11;
    }

    //Method accept a double and return the integer with fixed value 10
    public static int overloaded(double number){
        return 12;
    }
}
